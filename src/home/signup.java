/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
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
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icons/icon.png")).getImage());
        
        initComponents();
        error.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        rSButtonGradiente1 = new rojeru_san.rsbutton.RSButtonGradiente();
        jLabel6 = new javax.swing.JLabel();
        txt_lname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btn_login = new java.awt.Button();
        txt_pwd = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_fnamee = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        error = new javax.swing.JLabel();
        rSButtonEffect1 = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        usri = new rojeru_san.rslabel.RSLabelBorderRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_bg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginMouseDragged(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonGradiente1.setText("Database");
        rSButtonGradiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente1ActionPerformed(evt);
            }
        });
        login.add(rSButtonGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Last Name");
        login.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 40));

        txt_lname.setForeground(new java.awt.Color(102, 102, 102));
        txt_lname.setBorder(null);
        txt_lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_lnameFocusGained(evt);
            }
        });
        txt_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lnameActionPerformed(evt);
            }
        });
        login.add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 270, 30));

        jSeparator1.setBackground(new java.awt.Color(41, 168, 73));
        jSeparator1.setForeground(new java.awt.Color(41, 168, 73));
        login.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 270, 10));

        jSeparator2.setBackground(new java.awt.Color(41, 168, 73));
        jSeparator2.setForeground(new java.awt.Color(41, 168, 73));
        login.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 270, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unlock_18px.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 20, 31));

        btn_login.setBackground(new java.awt.Color(41, 168, 73));
        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setLabel("Signup");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        login.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 97, 40));

        txt_pwd.setForeground(new java.awt.Color(102, 102, 102));
        txt_pwd.setBorder(null);
        txt_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pwdFocusGained(evt);
            }
        });
        login.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 250, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Signup");
        login.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, -10, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lifely.png"))); // NOI18N
        jLabel1.setText("Version 1.0");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, -1));

        jLabel4.setForeground(new java.awt.Color(52, 170, 231));
        jLabel4.setText("Beta");
        login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 50, 30));

        jLabel7.setForeground(new java.awt.Color(62, 1, 1));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        login.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, 20, 760, -1));

        txt_fnamee.setForeground(new java.awt.Color(102, 102, 102));
        txt_fnamee.setBorder(null);
        txt_fnamee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fnameeFocusGained(evt);
            }
        });
        login.add(txt_fnamee, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 270, 30));

        jSeparator3.setBackground(new java.awt.Color(41, 168, 73));
        jSeparator3.setForeground(new java.awt.Color(41, 168, 73));
        login.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 270, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contacts_18px.png"))); // NOI18N
        login.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 20, 31));

        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_email.setBorder(null);
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emailFocusGained(evt);
            }
        });
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        login.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 250, 30));

        jSeparator4.setBackground(new java.awt.Color(41, 168, 73));
        jSeparator4.setForeground(new java.awt.Color(41, 168, 73));
        login.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 270, 10));

        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText("Error Detected");
        login.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        rSButtonEffect1.setText("Login Instead");
        rSButtonEffect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonEffect1ActionPerformed(evt);
            }
        });
        login.add(rSButtonEffect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 130, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Username");
        login.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 70, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Password");
        login.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 70, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("First Name");
        login.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 40));

        usri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usri.setText("Click to Add Image");
        usri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usriMouseClicked(evt);
            }
        });
        login.add(usri, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 190, 190));

        jPanel1.add(login, "card2");

        javax.swing.GroupLayout pnl_bgLayout = new javax.swing.GroupLayout(pnl_bg);
        pnl_bg.setLayout(pnl_bgLayout);
        pnl_bgLayout.setHorizontalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_bgLayout.setVerticalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_lnameFocusGained
        if (txt_lname.getText().equals("Last Name")) {
            txt_lname.setText("");
        }
        //txt_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 117, 253)));
        //jSeparator1.setForeground(Color.blue);
    }//GEN-LAST:event_txt_lnameFocusGained

    private void txt_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lnameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        InputStream inputStream = null;

        if (jf != null) {
            //
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            try {                       
                ImageIO.write(img, "jpeg", os);
                
            } catch (IOException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
            inputStream = new ByteArrayInputStream(os.toByteArray());
        }else{
            try {
                inputStream = new FileInputStream(new File("/icons/usrimg.png"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Toaster toaster = new Toaster(login);
        int isempty = 0;
        if (txt_email.getText().equals("")) {
            isempty = 1;
            jSeparator4.setForeground(Color.red);
        }
        if ("".equals(Arrays.toString(txt_pwd.getPassword()))) {
            isempty = 1;
            jSeparator2.setForeground(Color.red);
        }
        if (txt_fnamee.getText().equals("")) {
            isempty = 1;
            jSeparator3.setForeground(Color.red);
        }
        if (txt_lname.getText().equals("")) {
            isempty = 1;
            jSeparator1.setForeground(Color.red);
        }
        error.setVisible(false);
        if (isempty == 0) {
            try {

                SqlConnection sq = new SqlConnection();
                int res = sq.Signup(txt_email.getText(), new String(txt_pwd.getPassword()), txt_fnamee.getText(), txt_lname.getText(), inputStream);
                if (res == 0) {
                    Login.main();
                    dispose();
                } else {
                    toaster.error("Error occured");
                }
            } catch (Exception ex) {

                toaster.error("Error occured");
                error.setVisible(true);
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            toaster.error("Please fill all details");

            error.setVisible(true);
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwdFocusGained
        if (new String(txt_pwd.getPassword()).equals("password")) {
            txt_pwd.setText("");        // TODO add your handling code here:
        }
    }//GEN-LAST:event_txt_pwdFocusGained
    int xy, xx;
    private void loginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_loginMouseDragged

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        xx = evt.getX();
        xy = evt.getY();        // TODO add your handling code here:

    }//GEN-LAST:event_loginMousePressed

    private void txt_fnameeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fnameeFocusGained
        if (txt_fnamee.getText().equals("First Name")) {
            txt_fnamee.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameeFocusGained
    }
    private void txt_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusGained
        if (txt_email.getText().equals("Email")) {
            txt_email.setText("");
        }
    }//GEN-LAST:event_txt_emailFocusGained

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed

    }//GEN-LAST:event_txt_emailActionPerformed

    private void rSButtonGradiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente1ActionPerformed
        Database.main();
    }//GEN-LAST:event_rSButtonGradiente1ActionPerformed

    private void rSButtonEffect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonEffect1ActionPerformed
        Login.main();
        dispose();
    }//GEN-LAST:event_rSButtonEffect1ActionPerformed
    File usrimg;
    BufferedImage img;
    JFileChooser jf = null;
    private void usriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usriMouseClicked
        jf = new JFileChooser();
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
            img = new ImgUtils().scaleImage(190, 190, usrimg.getPath());
            usri.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_usriMouseClicked

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new signup().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_login;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel login;
    private javax.swing.JPanel pnl_bg;
    private rojeru_san.rsbutton.RSButtonEffect rSButtonEffect1;
    private rojeru_san.rsbutton.RSButtonGradiente rSButtonGradiente1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fnamee;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JPasswordField txt_pwd;
    private rojeru_san.rslabel.RSLabelBorderRound usri;
    // End of variables declaration//GEN-END:variables
}
