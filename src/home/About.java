/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;

/**
 *
 * @author Sijan
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rSButtonRound6 = new rojeru_san.rsbutton.RSButtonRound();
        jLabel15 = new javax.swing.JLabel();
        imageAvatar2 = new home.ImageAvatar();
        imageAvatar1 = new home.ImageAvatar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(62, 1, 1));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, 40, 1110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 670, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lifely.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 50));

        jLabel6.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(39, 144, 250));
        jLabel6.setText("Nirajan KC");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 170, 50));

        jLabel7.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(39, 144, 250));
        jLabel7.setText("About");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 100, 50));

        jLabel9.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(39, 144, 250));
        jLabel9.setText("Developers");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 100, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 204, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 10, 170));

        jLabel11.setFont(new java.awt.Font("Roboto Slab", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(39, 144, 250));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sijan Bhandari");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 170, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html><a href=\"https://www.facebook.com/Sijanstu\">Portfolio Website</a></html>");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 190, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("<html><a href=\"\">Facebook Profile</a></html>");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 150, -1));

        rSButtonRound6.setText("Back");
        rSButtonRound6.setBorderPainted(false);
        rSButtonRound6.setFocusable(false);
        rSButtonRound6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 80, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html><a href=\"https://www.facebook.com/Sijanstu\">Facebook Profile</a></html>");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 200, -1));

        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/nirajan.png"))); // NOI18N
        jPanel1.add(imageAvatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 150, 150));

        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/sijan.png"))); // NOI18N
        jPanel1.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 150));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRound7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound7ActionPerformed
        Dash.main();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound7ActionPerformed

    private void rSButtonRound8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound8ActionPerformed
        Contact.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound8ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {

            Desktop.getDesktop().browse(new URI("https://bhandarisijan.com.np"));

        }catch (IOException | URISyntaxException e1) {
        }
        // TODO add your handling code here:
                // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
 try {

            Desktop.getDesktop().browse(new URI("https://www.facebook.com/nirajan578"));

        }catch (IOException | URISyntaxException e1) {
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void rSButtonRound6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound6ActionPerformed
        Dash.main();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound6ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
try {

            Desktop.getDesktop().browse(new URI("https://www.facebook.com/Sijanstu"));

        }catch (IOException | URISyntaxException e1) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

   
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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new About().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private home.ImageAvatar imageAvatar1;
    private home.ImageAvatar imageAvatar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound6;
    // End of variables declaration//GEN-END:variables
}
