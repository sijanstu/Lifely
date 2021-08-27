package home;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sijan
 */
public class config {

    public String dbhost;
    public String dbport;
    public String dbusername;
    public String dbpassword;
    public String dbname;
    public static boolean islocal = true;

    public config() {
        File cf = new File("config.txt");
        if (cf.exists()) {
            BufferedReader br;
            try {
                System.err.println("\nconfig file found\n");
                br = new BufferedReader(new FileReader(new File("config.txt")));
                dbhost = br.readLine();
                dbport = br.readLine();
                dbusername = br.readLine();
                dbpassword = br.readLine();
                dbname = br.readLine();
                br.close();
            } catch (FileNotFoundException ex) {

            } catch (IOException ex) {

            }
        } else {
            System.err.println("\nconfig file not found\nusing default database\n");
            if (islocal) {
                dbhost = "localhost";
                dbport = "3306";
                dbusername = "root";
                dbpassword = "";
                dbname = "test";
            } else {
                dbhost = "remotemysql.com";
                dbport = "3306";
                dbusername = "7MEZWTYhdr";
                dbpassword = "4GKnHiR6Lr";
                dbname = "7MEZWTYhdr";
            }
        }
    }
}
