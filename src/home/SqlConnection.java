package home;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
 * @author Sijan Bhandari
 */
public class SqlConnection {
    static String response;
    static int retc = 0;
    static String url;
   static  String u, p;
    Connection con;
    static String server;
   static  String port;
   static  String database;
   static  String user;
   static  String pass;
   static  config conf = new config();
    public SqlConnection() throws IOException {

        try {
            server = conf.dbhost;
            
            port = conf.dbport;
            
            database = conf.dbname;
            
            user = conf.dbusername;
            
            pass = conf.dbpassword;
            url = "jdbc:mysql://" + server + ":" + port + "/" + database;
            con = DriverManager.getConnection(url + "?user=" + user + "&password=" + pass);
            if (con != null) {
                response = "Connected to server";
                System.out.println(response);
            } else {
                response = "null database returned";
                System.out.println(response);
            }
        } catch (SQLException ex) {
           Database.main();
        }

    }

    String Response() {
        return response;
    }
    int contact(String name,String email,String message){
        try {
            PreparedStatement pss;
            String query = "INSERT INTO contact (Name, Email, Message) VALUES ('"+name+"','"+email+"','"+message+"')";
            pss = con.prepareStatement(query);
            System.out.println(pss.toString());
           //pss.executeQuery();
            pss.executeUpdate();
            con.close();
            System.out.println("message sent");
            return 0;
        } catch (SQLException ex) {
            
            System.out.println("database error\n"+ex);
            return 1;
        }
        
    }
    public int AdminLogin(String user, String pass) throws SQLException, IOException, Exception {
        if (user.equals("") || pass.equals("")) {
            return 0;
        } else {
            PreparedStatement ps;
            String queryString = "SELECT `ID`, "
                    + "`FirstName`, `LastName`,"
                    + " `Email`, `Password` FROM "
                    + "`Admins` WHERE Email='" + user + "' "
                    + "and Password='" + Crypt.passcrypt(pass) +
                    "'";
            ps = con.prepareStatement(queryString);
            try ( ResultSet results = ps.executeQuery()) {
                if (results.next()) {
                    System.out.print("Signed In");
                    id = results.getInt("ID");
                    lname = results.getString("LastName");
                    fname = results.getString("FirstName");
                    con.close();
                    
                    File f=new File("admin.txt");
                    f.createNewFile();
                    try ( BufferedWriter fw = new BufferedWriter(new FileWriter(f))) {
                        fw.write(Crypt.encrypt(Integer.toString(id)));
                        fw.newLine();
                        fw.write(Crypt.encrypt(fname));
                        fw.newLine();
                        fw.write(Crypt.encrypt(lname));
                        con.close();
                        return 1;
                    }
                } else {
                    System.out.print("not found");
                    con.close();
                    return 0;
                }
            }
        }
      
        
    }
    public int Login(String user, String pass) throws SQLException, IOException, Exception {
        if (user.equals("") || pass.equals("")) {
            return 0;
        } else {
            PreparedStatement ps;
            String queryString = "SELECT `ID`, `FirstName`, `LastName`, `Email`, `Password` FROM `Users` WHERE Email='" + user + "' and Password='" + Crypt.passcrypt(pass) + "'";
            ps = con.prepareStatement(queryString);
            try ( ResultSet results = ps.executeQuery()) {
                if (results.next()) {
                    System.out.print("Signed In");
                    id = results.getInt("ID");
                    lname = results.getString("LastName");
                    fname = results.getString("FirstName");
                    con.close();
                    try ( BufferedWriter fw = new BufferedWriter(new FileWriter(new File("user.txt")))) {
                        fw.write(Crypt.encrypt(Integer.toString(id)));
                        fw.newLine();
                        fw.write(Crypt.encrypt(fname));
                        fw.newLine();
                        fw.write(Crypt.encrypt(lname));
                        con.close();
                        return 1;
                    }
                } else {
                    System.out.print("not found");
                    con.close();
                    return 0;
                }
            }
        }
    }
    int id;
    String log;
    String fname;
    String lname;
    int Passwords(boolean isfetch){
        if(isfetch){
            PreparedStatement pss;
            String queryString = "SELECT ID,FirstName,LastName,Email,logid FROM Users where logid=?";
        }
        return 0;
        
    }
    int weblog(String a) throws SQLException, IOException, Exception {
        PreparedStatement pss;
        String queryString = "SELECT ID,FirstName,LastName,Email,logid FROM Users where logid=?";
        pss = con.prepareStatement(queryString);
        pss.setString(1, a);
        try ( ResultSet results = pss.executeQuery()) {
            if (results.next()) {
                id = results.getInt("ID");
                fname = results.getString("FirstName");
                lname = results.getString("LastName");
                log = results.getString("logid");
                try ( BufferedWriter fw = new BufferedWriter(new FileWriter(new File("user.txt")))) {
                    fw.write(Crypt.encrypt(Integer.toString(id)));
                    fw.newLine();
                    fw.write(Crypt.encrypt(fname));
                    fw.newLine();
                    fw.write(Crypt.encrypt(lname));
                    con.close();
                    return 1;
                }

            }
        }
        con.close();
        return 0;

    }

    void weblogcheck(String logi) throws SQLException, IOException {
        PreparedStatement pss;
        String queryString = "SELECT ID FROM Users where logid=?";
        pss = con.prepareStatement(queryString);
        pss.setString(1, logi);
        try ( ResultSet results = pss.executeQuery()) {
            if (results.next()) {

            }

        }
        con.close();
    }

    int Signup(String em, String ps, String fname, String lname) {
        try {
            PreparedStatement pss;
            this.fname = fname;
            this.lname = lname;
            String query = "INSERT INTO `Users` (`FirstName`, `LastName`, `Email`, `Password`) VALUES (?,?,?,?)";
            System.out.println(query);
            pss = con.prepareStatement(query);
            pss.setString(1, fname);
            pss.setString(2, lname);
            pss.setString(3, em);
            pss.setString(4, Crypt.passcrypt(ps));
            pss.executeUpdate();
            String queryString = "SELECT ID FROM Users where Email=? and Password=?";
            pss = con.prepareStatement(queryString);
            pss.setString(1, user);
            pss.setString(2, pass);
            try ( ResultSet results = pss.executeQuery()) {
                if (results.next()) {
                    id = results.getInt("ID");
                    System.out.print("id from database:"+id);
                    con.close();
                }
            }
            con.close();
            System.out.println("Signup success");
            return 0;
        } catch (SQLException ex) {
            System.out.println("database error");
            return 1;
        }
    }

    int getEvents() {

        return 0;

    }

    String[] SigninOTP(String em) throws SQLException {

        PreparedStatement pss;
        String queryString = "SELECT ID,FirstName,LastName FROM Users where Email=?";
        pss = con.prepareStatement(queryString);
        pss.setString(1, em);
        try ( ResultSet results = pss.executeQuery()) {
            if (results.next()) {
                String[] s = new String[5];
                s[1] = Integer.toString(results.getInt("ID"));
                s[2] = results.getString("FirstName");
                s[3] = results.getString("LastName");
                con.close();
                return s;
            }
        }
        con.close();
        return null;
    }
    
}
class config {

    String dbhost;
    String dbport;
    String dbusername;
    String dbpassword;
    String dbname;
    boolean islocal=true;
    config() {
        File cf=new File("config.txt");
        if(cf.exists()){
           BufferedReader br = null;
            try {
                System.err.println("\nconfig file found\n");
                br = new BufferedReader(new FileReader(new File("config.txt")));
                dbhost = br.readLine();
                dbport = br.readLine();
                dbusername = br.readLine();
                dbpassword = br.readLine();
                dbname = br.readLine();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
         } else {
        System.err.println("\nconfig file not found\nusing default database\n");
        if(islocal){
        dbhost = "localhost";
        dbport = "3306";
        dbusername = "root";
        dbpassword = "";
        dbname = "test";
        }
        else{
        dbhost = "remotemysql.com";
        dbport = "3306";
        dbusername = "7MEZWTYhdr";
        dbpassword = "4GKnHiR6Lr";
        dbname = "7MEZWTYhdr";
    }}}
}
class SqlThread extends Thread {

    Connection conn;
    SqlConnection sq;
    Object ob;

    @Override
    public void run() {

        try {
            sq = new SqlConnection();
        } catch (IOException ex) {
            sq.log="error";
            Logger.getLogger(SqlThread.class.getName()).log(Level.SEVERE, null, ex);
        }

        }

    
    public static void main() {
        SqlThread sql = new SqlThread();
        sql.start();
    }
}