/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Sijan
 */
public class Getuserpic {

    static File userimg;
    static int error = 0;
    static BufferedImage image;
    static int isset=0;
    Getuserpic() {
        try {
            if (isset==0) {
                if (new File("user.png").exists()) {
                    userimg = new File("user.png");
                    image = new ImgUtils().scaleImage(190, 190, userimg.getPath());
                    //image = ImageIO.read(userimg);
                } else {
                    userimg=new File("/icons/usrimg.PNG");
                    image=new ImgUtils().scaleImage(190, 190, userimg.getPath());
                    PreparedStatement ps;
                    String queryString = "SELECT Image from users Where ID=" + UserDB.getUserID();
                    ps = DB.getConnection().prepareStatement(queryString);
                    try (ResultSet results = ps.executeQuery()) {
                        while (results.next()) {
                            if(results.getBlob("Image")==null){
                                userimg=new File("/icons/usrimg.PNG");
                                image = ImageIO.read(userimg);
                                
                            }
                            Blob aBlob = results.getBlob("Image");
                            try (InputStream is = aBlob.getBinaryStream(1, aBlob.length())) {
                                
                                image = ImageIO.read(is);
                                userimg = new File("user.png");
                                if(userimg.exists())userimg.delete();
                                ImageIO.write(image, "png", userimg);
                                isset=1;
                            }

                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Getuserpic.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (SQLException ex) {

            Logger.getLogger(Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
