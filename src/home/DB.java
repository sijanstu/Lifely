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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sijan
 */
public class DB {
    static int isconf = 0;
    static Connection con = null;
    static boolean err=false;
    static Date startDate;
    static Date endDate;
    int t;
    public static Connection getConnection() {
          
          endDate = new Date();
          if(con!=null){
              
              if((int)((endDate.getTime() - startDate.getTime()) / 1000)>100){
                   System.out.print("Connection reset");
                    return getConnection("localhost", "lifely", "root", "");
                   //return getConnection("remotemysql.com", "7MEZWTYhdr", "7MEZWTYhdr", "4GKnHiR6Lr");
                  //return getConnection("bxabsomezdrn1nv4jpvi-mysql.services.clever-cloud.com", "bxabsomezdrn1nv4jpvi", "uwudbzxg1zyeerfd", "CgZaj3EtXvVS2A530ytn");
                }else{
                  startDate = new Date();
                   return con;}
            }else{
              return getConnection("localhost", "lifely", "root", "");
                //return getConnection("bxabsomezdrn1nv4jpvi-mysql.services.clever-cloud.com", "bxabsomezdrn1nv4jpvi", "uwudbzxg1zyeerfd", "CgZaj3EtXvVS2A530ytn");
               // return getConnection("remotemysql.com", "7MEZWTYhdr", "7MEZWTYhdr", "4GKnHiR6Lr");
            }
        }
       
    private static Connection getConnection(String server, String db_name, String user_name, String password) {
        startDate = new Date();
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + db_name + "?user=" + user_name + "&password=" + password);
            err=false;
        } catch (SQLException ex) {
            err=true;
           
            ConError.main();
        return con;
    }
        return con;
    }
}

class UserDB {
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;

    static int getUserID() {
        BufferedReader bf;
        try {
            bf = new BufferedReader(new FileReader(new File("user.txt")));
            int id = Integer.parseInt(Crypt.decrypt(bf.readLine()));
            //System.err.println("returned ID:" + id);
            bf.close();
            return id;

        } catch (FileNotFoundException ex) {
          //  JOptionPane.showMessageDialog(this,"Profile Picture Updated, Relogin to see changes");
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
