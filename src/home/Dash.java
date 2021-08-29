/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Sijan Bhandari
 */
public final class Dash extends javax.swing.JFrame {

    Getuserpic userpic;

    /**
     * Creates new form Dash
     */
    public Dash() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icons/icon.png")).getImage());
        initComponents();
         userpic = new Getuserpic();
        avatar.setImage(new ImageIcon(Getuserpic.image));
        getUserData userData = new getUserData();
        name.setText(getUserData.fname + " " + getUserData.lname);
        
        
        
        FetchEventNo();
        notification.setText("You have " + count + " Task ToDo");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        avatar = new home.ImageAvatar();
        jLabel1 = new javax.swing.JLabel();
        rSButtonRound6 = new rojeru_san.rsbutton.RSButtonRound();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        rSButtonRound2 = new rojeru_san.rsbutton.RSButtonRound();
        jLabel2 = new javax.swing.JLabel();
        rSButtonRound3 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound4 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound5 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound7 = new rojeru_san.rsbutton.RSButtonRound();
        notification = new javax.swing.JLabel();
        rSButtonRound8 = new rojeru_san.rsbutton.RSButtonRound();
        prof = new rojeru_san.rsbutton.RSButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        avatar.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/usrimg.PNG"))); // NOI18N
        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatarMouseClicked(evt);
            }
        });
        jPanel1.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lifely.png"))); // NOI18N
        jLabel1.setText("Version 1.0");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 60));

        rSButtonRound6.setText("Admin Section");
        rSButtonRound6.setBorderPainted(false);
        rSButtonRound6.setFocusable(false);
        rSButtonRound6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 30));

        jLabel5.setForeground(new java.awt.Color(62, 1, 1));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, 40, 1110, -1));

        name.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(29, 161, 255));
        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setText("Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 270, 40));

        rSButtonRound2.setBackground(new java.awt.Color(0, 153, 255));
        rSButtonRound2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_available_updates_96px.png"))); // NOI18N
        rSButtonRound2.setColorHover(new java.awt.Color(51, 204, 255));
        rSButtonRound2.setFocusPainted(false);
        rSButtonRound2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        rSButtonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 160, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/output-onlinepngtools.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1829, 509));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 240));

        rSButtonRound3.setBackground(new java.awt.Color(0, 153, 255));
        rSButtonRound3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_schedule_80px.png"))); // NOI18N
        rSButtonRound3.setColorHover(new java.awt.Color(51, 204, 255));
        rSButtonRound3.setFocusPainted(false);
        rSButtonRound3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        rSButtonRound3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 160, 130));

        rSButtonRound4.setBackground(new java.awt.Color(0, 153, 255));
        rSButtonRound4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_show_password_96px.png"))); // NOI18N
        rSButtonRound4.setColorHover(new java.awt.Color(51, 204, 255));
        rSButtonRound4.setFocusPainted(false);
        rSButtonRound4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        rSButtonRound4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 160, 130));

        rSButtonRound5.setBackground(new java.awt.Color(0, 153, 255));
        rSButtonRound5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_checklist_96px.png"))); // NOI18N
        rSButtonRound5.setColorHover(new java.awt.Color(51, 204, 255));
        rSButtonRound5.setFocusPainted(false);
        rSButtonRound5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        rSButtonRound5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 130));

        rSButtonRound7.setText("Contact Us");
        rSButtonRound7.setBorderPainted(false);
        rSButtonRound7.setFocusable(false);
        rSButtonRound7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound7ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 110, 30));

        notification.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        notification.setForeground(new java.awt.Color(29, 161, 255));
        notification.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        notification.setText("You have 0 Task ToDo");
        jPanel1.add(notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 230, 30));

        rSButtonRound8.setText("About");
        rSButtonRound8.setBorderPainted(false);
        rSButtonRound8.setFocusable(false);
        rSButtonRound8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound8ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 80, 30));

        prof.setText("Profile");
        prof.setBorderPainted(false);
        prof.setFocusable(false);
        prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profActionPerformed(evt);
            }
        });
        jPanel1.add(prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 80, 30));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection con;
    int count = 0;

    void FetchEventNo() {
        try {
            PreparedStatement ps;
            String queryString = "SELECT * from notes Where UserID=" + UserDB.getUserID();
            ps = DB.getConnection().prepareStatement(queryString);
            try (ResultSet results = ps.executeQuery()) {
                while (results.next()) {
                    count++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void rSButtonRound6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound6ActionPerformed
            home.AdminLogin.main();
            this.dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound6ActionPerformed

    private void rSButtonRound7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound7ActionPerformed
        Contact.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound7ActionPerformed

    private void rSButtonRound3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound3ActionPerformed
        Events.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound3ActionPerformed

    private void rSButtonRound4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound4ActionPerformed
        Passwords.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound4ActionPerformed

    private void rSButtonRound5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound5ActionPerformed
        Note.main();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound5ActionPerformed

    private void rSButtonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound2ActionPerformed
        Updates.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound2ActionPerformed

    private void rSButtonRound8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound8ActionPerformed
        About.main();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound8ActionPerformed

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked
        Userprofile.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_avatarMouseClicked

    private void profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profActionPerformed
        Userprofile.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_profActionPerformed

    /**
     */
    public static void main() {

        //this.mac=f;
        //l1.setText(""+id);
        //l2.setText(mac);
        //fn.setText("First Name: "+f);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dash().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private home.ImageAvatar avatar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel notification;
    private rojeru_san.rsbutton.RSButtonRound prof;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound2;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound3;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound4;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound5;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound6;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound7;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound8;
    // End of variables declaration//GEN-END:variables
}
