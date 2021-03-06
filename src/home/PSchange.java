/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.AWTException;
import java.io.File;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sijan
 */
public class PSchange extends javax.swing.JFrame {

    /**
     * Creates new form PSchange
     */
    public PSchange() {
        t = new Toaster(jPanel1);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/icons/icon.png")).getImage());
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
        jLabel2 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        currentpas = new RSMaterialComponent.RSTextFieldIconUno();
        conpass = new RSMaterialComponent.RSTextFieldIconUno();
        submit = new rojeru_san.rsbutton.RSButtonRoundEffect();
        rSButtonRound9 = new rojeru_san.rsbutton.RSButtonRound();
        jLabel3 = new javax.swing.JLabel();
        newpass = new RSMaterialComponent.RSTextFieldIconUno();
        logout = new rojeru_san.rsbutton.RSButtonRoundEffect();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change password");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lifely.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));

        title.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(29, 161, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        title.setText("Change Password");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 240, 50));

        currentpas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK);
        currentpas.setPlaceholder("Current Password");
        jPanel1.add(currentpas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 40));

        conpass.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK);
        conpass.setPlaceholder("Confirm Password");
        jPanel1.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        submit.setBackground(new java.awt.Color(255, 102, 153));
        submit.setText("Change Password");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, -1));

        rSButtonRound9.setText("Back");
        rSButtonRound9.setBorderPainted(false);
        rSButtonRound9.setFocusable(false);
        rSButtonRound9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound9ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 70, 30));

        jLabel3.setForeground(new java.awt.Color(62, 1, 1));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-670, 30, 1150, -1));

        newpass.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK);
        newpass.setPlaceholder("New Password");
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        logout.setBackground(new java.awt.Color(0, 153, 153));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Toaster t;
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (newpass.getText().equals("") || currentpas.getText().equals("") || conpass.getText().equals("")) {
            t.error("please enter all details");
        } else {
            if (newpass.getText().equals(conpass.getText())) {
                if (Crypt.passcrypt(currentpas.getText()).equals(getUserData.pass)) {
                    try {
                        Statement stmt = DB.getConnection().createStatement();
                        stmt.execute("update users set Password = '" + Crypt.passcrypt(newpass.getText()) + "' where id =" + UserDB.getUserID());
                        JOptionPane.showMessageDialog(this, "password Updated");
                        logout.doClick();
                    } catch (SQLException ex) {
                        Logger.getLogger(PSchange.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    t.error("Incorrect password");
                }

            } else {
                t.error("Please Confirm Password Correctly");
                conpass.setText("");

            }
        }
    }//GEN-LAST:event_submitActionPerformed


    private void rSButtonRound9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound9ActionPerformed

        Userprofile.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound9ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
getUserData.isset=0;
        Getuserpic.isset=0;        File f = new File("user.txt");

        if (f.exists()) {

            f.delete();
        }
        File ff = new File("user.png");
        if (ff.exists()) {
            ff.delete();
        }
        TrayIco tr = new TrayIco();
        TrayIco.mes = "Logged Out";
        try {
            TrayIco.main();
        } catch (AWTException ex) {
            Logger.getLogger(Userprofile.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login.main();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(PSchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PSchange().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSTextFieldIconUno conpass;
    private RSMaterialComponent.RSTextFieldIconUno currentpas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.rsbutton.RSButtonRoundEffect logout;
    private RSMaterialComponent.RSTextFieldIconUno newpass;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound9;
    private rojeru_san.rsbutton.RSButtonRoundEffect submit;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
