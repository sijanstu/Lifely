
package home;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Desktop;
import java.net.MalformedURLException;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author Finally
 */
public class main extends javax.swing.JFrame {
    /**
     * Creates new form Splash
     *
     * @throws java.awt.AWTException
     */
    static boolean tableExistsSQL(Connection connection, String tableName) throws SQLException {
    PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(*) "
      + "FROM information_schema.tables "
      + "WHERE table_name = ?"
      + "LIMIT 1;");
    preparedStatement.setString(1, tableName);

    ResultSet resultSet = preparedStatement.executeQuery();
    resultSet.next();
    return resultSet.getInt(1) != 0;
}
    public main() throws AWTException {this.setIconImage(new ImageIcon(getClass().getResource("/icons/icon.png")).getImage());

        initComponents();

        cont.setVisible(false);
        // Error.main();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cont = new rojeru_san.rsbutton.RSButtonRound();
        agree = new rojerusan.RSSwitch();
        rSLabelHora1 = new rojeru_san.rsdate.RSLabelHora();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Start Lifely App");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lifely.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><a href=\"https://www.facebook.com/sijanstu\">Terms and conditions</a></html>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 360, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Read all Terms and Conditions");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 370, -1));

        cont.setText("Continue");
        cont.setBorderPainted(false);
        cont.setDoubleBuffered(true);
        cont.setFocusPainted(false);
        cont.setFocusable(false);
        cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contActionPerformed(evt);
            }
        });
        jPanel1.add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 140, 40));

        agree.setBackground(new java.awt.Color(21, 198, 254));
        agree.setForeground(new java.awt.Color(215, 39, 31));
        agree.setActivado(false);
        agree.setColorBoton(new java.awt.Color(203, 26, 32));
        agree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agreeMouseClicked(evt);
            }
        });
        jPanel1.add(agree, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 30));

        rSLabelHora1.setFont(new java.awt.Font("C059", 1, 18)); // NOI18N
        jPanel1.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/grap.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 360, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/sijanstu"));

        } catch (IOException | URISyntaxException e1) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contActionPerformed
        
        File f1 = new File("user.txt");
        String gett;
        if (f1.exists()) {
            dispose();
            Dash.main();
        } else {
            try {
                tester();
               Login.main();
                dispose();
            } catch (IOException ex) {
                dispose();
                Database.main();
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_contActionPerformed

    private void agreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agreeMouseClicked
        if (agree.isActivado()) {
            agree.setColorBoton(Color.green);
            cont.setVisible(true);
        } else {
            agree.setColorBoton(Color.red);
            cont.setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_agreeMouseClicked

    /**
     * @param args
     */
    public static void main(String[] args) {
        File f1 = new File("user.txt");
        if (f1.exists()) {
            Dash.main();

        } else {
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
                java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                try {
                    new main().setVisible(true);
                } catch (AWTException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSSwitch agree;
    private rojeru_san.rsbutton.RSButtonRound cont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
  void tester() throws MalformedURLException, IOException {
        //URL url = new URL("http://www.google.com");
       // URLConnection connection = url.openConnection();
        //connection.connect();
        //System.out.println("Internet is connected");
    }
}