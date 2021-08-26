/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sijan
 */
public class DB {
     final static config conf = new config();
           static String server = conf.dbhost;
            
           static String port = conf.dbport;
            
           static String database = conf.dbname;
            
          static String user = conf.dbusername;
            
          static String pass = conf.dbpassword;
    static Connection con=null;
    public static Connection getConnection()
    {
        if (con != null) return con;
        // get db, user, pass from settings file
        return getConnection(server,database, user, pass);
    }

    private static Connection getConnection(String server,String db_name,String user_name,String password)
    {
        try
        {
         
            con=DriverManager.getConnection("jdbc:mysql://"+server+"/"+db_name+"?user="+user_name+"&password="+password);
        }
        catch(SQLException e)
        {
            Database.main();
            System.err.println(e);
        }
        return con;        
    }
}
