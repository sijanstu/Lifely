package home;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crypt {

    public static String passcrypt(String pass) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] passBytes = pass.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digested.length; i++) {
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            System.out.println("returned md5 password\n" + sb.toString());
            return sb.toString();

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Crypt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String encrypt(String Text) throws Exception {
        String encryptedValue = new String(java.util.Base64.getMimeEncoder()
                .encode(Text.getBytes()), StandardCharsets.UTF_8);
        return encryptedValue;

    }

    public static String decrypt(String strEncrypted) throws Exception {
        String decryptedValue = new String(java.util.Base64.getDecoder()
                .decode(strEncrypted), StandardCharsets.UTF_8);
        return decryptedValue;

    }
}
