package home;


import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sijan
 */
public class GETAPI {
    static String username(){
        try {
            return decrypt("N01FWldUWWhkcg==");
            
        } catch (Exception ex) {
            Logger.getLogger(GETAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    static String password(){
        try {
            return decrypt("NEdLbkhpUjZMcg==");
            
        } catch (Exception ex) {
            Logger.getLogger(GETAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    static String port(){
        try {
            return "3306";
            
        } catch (Exception ex) {
            Logger.getLogger(GETAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }static String server(){
        try {
            return decrypt("cmVtb3RlbXlzcWwuY29t");
            
        } catch (Exception ex) {
            Logger.getLogger(GETAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private static String decrypt(String strEncrypted) throws Exception {
        String decryptedValue = new String(java.util.Base64.getDecoder()
                .decode(strEncrypted), StandardCharsets.UTF_8);
        return decryptedValue;

    }
}
