/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sijan
 */
public class DB {
     final static config conf = new config();
           static String server;// = conf.dbhost;
            
           static String port;// = conf.dbport;
            
           static String database;// = conf.dbname;
            
          static String user;// = conf.dbusername;
            
          static String pass;// = conf.dbpassword;
          static int isconf=0;
    static Connection con=null;
    public static Connection getConnection()
    {
        
        
        if (con != null) return con;
        // get db, user, pass from settings file
        return getConnection(server,database, user, pass);
    }
    static void OnlineDB(){
         if(new File("ison.txt").exists()){
             try {
                 DB.server=GETAPI.server();
                 DB.port=GETAPI.port();
                 DB.user=GETAPI.username();
                 DB.pass=GETAPI.password();
                
             } catch (Exception ex) {
                 Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
             }
            
        }else{
             server=conf.dbhost;  
             port=conf.dbport;
             user=conf.dbusername;
             pass=conf.dbpassword;
         }
    }
    private static Connection getConnection(String server,String db_name,String user_name,String password)
    {
       OnlineDB();
        try
        {         
            con=DriverManager.getConnection("jdbc:mysql://"+server+"/"+db_name+"?user="+user_name+"&password="+password);
        }
        catch(SQLException e)
        {
            
        } catch (Exception ex) {
            if(isconf==0)
            System.err.println(ex);
            Database.main();
             Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
         }
        return con;        
    }
}
