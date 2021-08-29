/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sijan
 */
public class DB {

    final static config conf = new config();
    //static String server= conf.dbhost;

    //static String port= conf.dbport;
    //static String database = conf.dbname;
    // static String user= conf.dbusername;
    // static String pass= conf.dbpassword;
    static int isconf = 0;
    static Connection con = null;

    public static Connection getConnection() {
        if (con != null) {
            return con;
        }
        return getConnection("remotemysql.com", "7MEZWTYhdr", "7MEZWTYhdr", "4GKnHiR6Lr");
    }

    private static Connection getConnection(String server, String db_name, String user_name, String password) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + db_name + "?user=" + user_name + "&password=" + password);
        } catch (SQLException ex) {
            if (isconf == 0) {
                System.err.println(ex);
            }
            Database.main();
        }
        return con;
    }
}

class UserDB {

    static boolean tableExistsSQL(Connection connection, String tableName) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(*) "
                + "FROM information_schema.tables "
                + "WHERE table_name = ?"
                + "LIMIT 1;");
        preparedStatement.setString(1, tableName);

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return resultSet.getInt(1) != 0;
    }

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;

    static int getUserID() {
        BufferedReader bf;
        try {
            bf = new BufferedReader(new FileReader(new File("user.txt")));
            int id = Integer.parseInt(Crypt.decrypt(bf.readLine()));
            System.err.println("returned ID:" + id);
            bf.close();
            return id;

        } catch (FileNotFoundException ex) {

            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 500;

    }
}

class getUserData {

    static int ID;
    static String fname;
    static String lname;
    static String email;
    static String pass;
    static int isset;

    getUserData() {
        if (isset == 0) {
            try {
                PreparedStatement ps;
                String queryString = "SELECT * from users Where ID=" + UserDB.getUserID();
                ps = DB.getConnection().prepareStatement(queryString);
                try (ResultSet results = ps.executeQuery()) {
                    while (results.next()) {
                        ID = results.getInt("ID");
                        fname = results.getString("FirstName");
                        lname = results.getString("LastName");
                        email = results.getString("Email");
                        pass = results.getString("Password");
                        isset=1;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Dash.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
