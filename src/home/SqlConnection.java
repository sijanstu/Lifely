package home;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sijan Bhandari
 */
public class SqlConnection {
    
    static String response;
    static int retc = 0;
    static String url;
    static String u, p;
    static String server;
    static String port;
    int isconf=0;
    static String database;
    static String user;
    static String pass;
    static config conf = new config();
    String Response() {
        return response;
    }

    int contact(String name, String email, String message) {
        try {
            PreparedStatement pss;
            String query = "INSERT INTO contact (Name, Email, Message) VALUES ('" + name + "','" + email + "','" + message + "')";
            pss = DB.getConnection().prepareStatement(query);
            System.out.println(pss.toString());
            //pss.executeQuery();
            pss.executeUpdate();
            DB.getConnection().close();
            System.out.println("message sent");
            return 0;
        } catch (SQLException ex) {

            System.out.println("database error\n" + ex);
            return 1;
        }

    }

    static public int AdminLogin(String user, String pass) throws SQLException, IOException, Exception {
        if (user.equals("") || pass.equals("")) {
            return 0;
        } else {
            PreparedStatement ps;
            String queryString = "SELECT `ID`, "
                    + "`FirstName`, `LastName`,"
                    + " `Email`, `Password` FROM "
                    + "`Admins` WHERE Email='" + user + "' "
                    + "and Password='" + Crypt.passcrypt(pass)
                    + "'";
            ps = DB.getConnection().prepareStatement(queryString);
            try (ResultSet results = ps.executeQuery()) {
                if (results.next()) {
                    System.out.print("Signed In");
                    id = results.getInt("ID");
                    lname = results.getString("LastName");
                    fname = results.getString("FirstName");

                    File f = new File("admin.txt");
                    f.createNewFile();
                    try (BufferedWriter fw = new BufferedWriter(new FileWriter(f))) {
                        fw.write(Crypt.encrypt(Integer.toString(id)));
                        fw.newLine();
                        fw.write(Crypt.encrypt(fname));
                        fw.newLine();
                        fw.write(Crypt.encrypt(lname));
                   
                        return 1;
                    }
                } else {
                    System.out.print("not found");
               
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
            ps = DB.getConnection().prepareStatement(queryString);
            try (ResultSet results = ps.executeQuery()) {
                if (results.next()) {
                    System.out.print("Signed In");
                    id = results.getInt("ID");
                    lname = results.getString("LastName");
                    fname = results.getString("FirstName");
                    
                    try (BufferedWriter fw = new BufferedWriter(new FileWriter(new File("user.txt")))) {
                        fw.write(Crypt.encrypt(Integer.toString(id)));
                        fw.newLine();
                        fw.write(Crypt.encrypt(fname));
                        fw.newLine();
                        fw.write(Crypt.encrypt(lname));
                        fw.newLine();
                        fw.write(Crypt.encrypt(user));
                       fw.close();
                        return 1;
                    }
                } else {
                    System.out.print("not found");
                
                    return 0;
                }
            }
        }
    }
   static int id;
   static String log;
   static String fname;
   static String lname;

    int Passwords(boolean isfetch) {
        if (isfetch) {
            PreparedStatement pss;
            String queryString = "SELECT ID,FirstName,LastName,Email,logid FROM Users where logid=?";
        }
        return 0;

    }

    int weblog(String a) throws SQLException, IOException, Exception {
        PreparedStatement pss;
        String queryString = "SELECT ID,FirstName,LastName,Email,logid FROM Users where logid=?";
        pss = DB.getConnection().prepareStatement(queryString);
        pss.setString(1, a);
        try (ResultSet results = pss.executeQuery()) {
            if (results.next()) {
                id = results.getInt("ID");
                fname = results.getString("FirstName");
                lname = results.getString("LastName");
                log = results.getString("logid");
                try (BufferedWriter fw = new BufferedWriter(new FileWriter(new File("user.txt")))) {
                    fw.write(Crypt.encrypt(Integer.toString(id)));
                    fw.newLine();
                    fw.write(Crypt.encrypt(fname));
                    fw.newLine();
                    fw.write(Crypt.encrypt(lname));
              
                    return 1;
                }

            }
        }
      
        return 0;

    }

    void weblogcheck(String logi) throws SQLException, IOException {
        PreparedStatement pss;
        String queryString = "SELECT ID FROM Users where logid=?";
        pss = DB.getConnection().prepareStatement(queryString);
        pss.setString(1, logi);
        try (ResultSet results = pss.executeQuery()) {
            if (results.next()) {

            }

        }
        
    }

    int Signup(String em, String ps, String fname, String lname,InputStream inp) {
        try {
            PreparedStatement pss;
            SqlConnection.fname = fname;
            SqlConnection.lname = lname;
            String query = "INSERT INTO `Users` (`FirstName`, `LastName`, `Email`, `Password`,`Image`) VALUES (?,?,?,?,?)";
            System.out.println(query);
            pss = DB.getConnection().prepareStatement(query);
            pss.setString(1, fname);
            pss.setString(2, lname);
            pss.setString(3, em);
            pss.setString(4, Crypt.passcrypt(ps));
            
            pss.setBlob(5, inp);
            pss.executeUpdate();
            String queryString = "SELECT ID FROM Users where Email=? and Password=?";
            pss = DB.getConnection().prepareStatement(queryString);
            pss.setString(1, user);
            pss.setString(2, pass);
            try (ResultSet results = pss.executeQuery()) {
                if (results.next()) {
                    id = results.getInt("ID");
                    System.out.print("id from database:" + id);
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("user.txt")))) {
                    bw.write(Crypt.encrypt(Integer.toString(id)));
                    bw.newLine();
                    bw.write(Crypt.encrypt(fname));
                    bw.newLine();
                    bw.write(Crypt.encrypt(lname));
                    bw.newLine();
                    bw.write(user);
                    bw.close();
                }   catch (Exception ex) {
                        System.err.print(ex);
                    }
                  
                }
            }
          
            System.out.println("Signup success");
            return 0;
        } catch (SQLException ex) {
            System.out.println(ex);
            return 1;
        }
    }

    int getEvents() {

        return 0;

    }

    String[] SigninOTP(String em) throws SQLException {

        PreparedStatement pss;
        String queryString = "SELECT ID,FirstName,LastName FROM Users where Email=?";
        pss = DB.getConnection().prepareStatement(queryString);
        pss.setString(1, em);
        try (ResultSet results = pss.executeQuery()) {
            if (results.next()) {
                String[] s = new String[5];
                s[1] = Integer.toString(results.getInt("ID"));
                s[2] = results.getString("FirstName");
                s[3] = results.getString("LastName");
             
                return s;
            }
        }
        
        return null;
    }

}


class SqlThread extends Thread {
    static Object ob;
    Connection con;

    @Override
    public void run() {
        con=DB.getConnection();

    }

    public static void main() {
        SqlThread sql = new SqlThread();
        sql.start();
    }
}
