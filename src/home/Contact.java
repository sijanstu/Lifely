/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Sijan
 */
public class Contact extends javax.swing.JFrame {

    /**
     * Creates new form Contact
     */
    public Contact() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icons/icon.png")).getImage());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        submit = new rojeru_san.rsbutton.RSButtonRound();
        name = new rojeru_san.rsfield.RSTextFullRound();
        email = new rojeru_san.rsfield.RSTextFullRound();
        message = new javax.swing.JEditorPane();
        usri = new rojeru_san.rslabel.RSLabelBorderRound();
        jLabel1 = new javax.swing.JLabel();
        rSButtonRound6 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound7 = new rojeru_san.rsbutton.RSButtonRound();
        jLabel2 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contact");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setText("Submit");
        submit.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 110, 20));

        name.setPlaceholder("");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 200, 30));

        email.setPlaceholder("");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 220, 30));

        message.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        message.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        jPanel2.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 200, 120));

        usri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usri.setText("Click to Choose");
        usri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usriMouseClicked(evt);
            }
        });
        jPanel2.add(usri, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 190, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/contact.PNG"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 630, 290));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 600, 300));

        rSButtonRound6.setText("About us");
        rSButtonRound6.setBorderPainted(false);
        rSButtonRound6.setFocusable(false);
        rSButtonRound6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 90, 30));

        rSButtonRound7.setText("Back");
        rSButtonRound7.setBorderPainted(false);
        rSButtonRound7.setFocusable(false);
        rSButtonRound7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound7ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lifely.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        name1.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(29, 161, 255));
        name1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name1.setText("Contact");
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 80, 50));

        jLabel3.setForeground(new java.awt.Color(62, 1, 1));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, 29, 1100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRound6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound6ActionPerformed
        About.main();
        dispose();
    }//GEN-LAST:event_rSButtonRound6ActionPerformed

    private void rSButtonRound7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound7ActionPerformed

        Dash.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound7ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        try {
            SqlConnection sq = new SqlConnection();
            //int res=sq.contact(name.getText(), email.getText(), message.getText());
            Connection conn = sq.con;
            String sql = "INSERT INTO contact (Name, Email, message,Image) values (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, name.getText());
            statement.setString(2, email.getText());
            statement.setString(3, message.getText());
            InputStream inputStream = new FileInputStream(usrimg);
            statement.setBlob(4, inputStream);
            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("A contact was inserted with photo image.");
            }
            conn.close();
            System.out.println("uploaded");
        } catch (SQLException ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        }
        Dash.main();
        dispose();
    }//GEN-LAST:event_submitActionPerformed
    File usrimg = new File("icons/usrimg.png");

   
    private void usriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usriMouseClicked
        JFileChooser jf = new JFileChooser();
        usrimg = jf.getSelectedFile();
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: "
                    + chooser.getSelectedFile().getName());
            usrimg = chooser.getSelectedFile();
            Icon icon = new ImageIcon(usrimg.getPath());
            BufferedImage img = new ImgUtils().scaleImage(190, 190, usrimg.getPath());
            usri.setIcon(new ImageIcon(img));
        }


    }//GEN-LAST:event_usriMouseClicked

    /**
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Contact().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsfield.RSTextFullRound email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JEditorPane message;
    private rojeru_san.rsfield.RSTextFullRound name;
    private javax.swing.JLabel name1;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound6;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound7;
    private rojeru_san.rsbutton.RSButtonRound submit;
    private rojeru_san.rslabel.RSLabelBorderRound usri;
    // End of variables declaration//GEN-END:variables
}
