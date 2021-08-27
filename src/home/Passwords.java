/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.io.File;
import java.awt.AWTException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author prabinkokali
 */
public final class Passwords extends javax.swing.JFrame {

    int id;
    int[] shid = new int[2000];
    int cid[] = new int[5];
    int rcount = 0;

    /**
     * Creates new form Passwords
     */
    public Passwords() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icons/icon.png")).getImage());
        initComponents();
        isv[1]=true;isv[2]=true;isv[3]=true;isv[4]=true;
        ps1.setVisible(false);
        ps2.setVisible(false);
        ps3.setVisible(false);
        ps4.setVisible(false);
        id = UserDB.getUserID();
        FetchDBs();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roboto1 = new rojeru_san.efectos.Roboto();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        rSButtonRound1 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound7 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound6 = new rojeru_san.rsbutton.RSButtonRound();
        jLabel1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        sel4 = new rojerusan.RSRadioButton();
        eye4 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ps4 = new javax.swing.JLabel();
        ps4i = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        sel2 = new rojerusan.RSRadioButton();
        eye2 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ps2 = new javax.swing.JLabel();
        ps2i = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        eye1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        ps1i = new javax.swing.JLabel();
        ps1 = new javax.swing.JLabel();
        sel1 = new rojerusan.RSRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rSButtonRound3 = new rojeru_san.rsbutton.RSButtonRound();
        no = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        sel3 = new rojerusan.RSRadioButton();
        eye3 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ps3 = new javax.swing.JLabel();
        ps3i = new javax.swing.JLabel();
        rSButtonRound17 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound21 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound4 = new rojeru_san.rsbutton.RSButtonRound();
        passt = new RSMaterialComponent.RSTextFieldMaterial();
        sitet = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonRound5 = new rojeru_san.rsbutton.RSButtonRound();
        rSButtonRound8 = new rojeru_san.rsbutton.RSButtonRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRound1.setText("Log Out");
        rSButtonRound1.setBorderPainted(false);
        rSButtonRound1.setFocusable(false);
        rSButtonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 90, 30));

        rSButtonRound7.setText("Contact Us");
        rSButtonRound7.setBorderPainted(false);
        rSButtonRound7.setFocusable(false);
        rSButtonRound7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound7ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 110, 30));

        rSButtonRound6.setText("Back");
        rSButtonRound6.setBorderPainted(false);
        rSButtonRound6.setFocusable(false);
        rSButtonRound6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lifely.png"))); // NOI18N
        jLabel1.setText("Version 1.0");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 50));

        p2.setBackground(new java.awt.Color(254, 254, 254));
        p2.setForeground(new java.awt.Color(62, 157, 254));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p2MouseEntered(evt);
            }
        });
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel4ActionPerformed(evt);
            }
        });
        p2.add(sel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 50));

        eye4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eye4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eyeoff.png"))); // NOI18N
        eye4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye4MouseClicked(evt);
            }
        });
        p2.add(eye4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 50));

        s4.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        s4.setForeground(new java.awt.Color(39, 144, 250));
        p2.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 320, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/passi.png"))); // NOI18N
        p2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel9.setForeground(new java.awt.Color(62, 1, 1));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        p2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-430, 30, 1140, -1));

        ps4.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        ps4.setForeground(new java.awt.Color(39, 144, 250));
        p2.add(ps4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 160, 40));

        ps4i.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        ps4i.setForeground(new java.awt.Color(39, 144, 250));
        ps4i.setText("*********************************");
        p2.add(ps4i, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 230, 40));

        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 700, 60));

        p3.setBackground(new java.awt.Color(254, 254, 254));
        p3.setForeground(new java.awt.Color(62, 157, 254));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3MouseEntered(evt);
            }
        });
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel2ActionPerformed(evt);
            }
        });
        p3.add(sel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 50));

        eye2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eye2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eyeoff.png"))); // NOI18N
        eye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye2MouseClicked(evt);
            }
        });
        p3.add(eye2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 50));

        s2.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        s2.setForeground(new java.awt.Color(39, 144, 250));
        p3.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 320, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/passi.png"))); // NOI18N
        p3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jLabel14.setForeground(new java.awt.Color(62, 1, 1));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        p3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, 30, 1110, -1));

        ps2.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        ps2.setForeground(new java.awt.Color(39, 144, 250));
        p3.add(ps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 170, 40));

        ps2i.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        ps2i.setForeground(new java.awt.Color(39, 144, 250));
        ps2i.setText("*********************************");
        p3.add(ps2i, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 240, 40));

        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 700, 60));

        p1.setBackground(new java.awt.Color(254, 254, 254));
        p1.setForeground(new java.awt.Color(62, 157, 254));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p1MouseEntered(evt);
            }
        });
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eye1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eyeoff.png"))); // NOI18N
        eye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye1MouseClicked(evt);
            }
        });
        p1.add(eye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/passi.png"))); // NOI18N
        p1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, -1, 50));

        jLabel3.setForeground(new java.awt.Color(62, 1, 1));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        p1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 30, 1060, 20));

        s1.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        s1.setForeground(new java.awt.Color(39, 144, 250));
        p1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 320, 40));

        ps1i.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        ps1i.setForeground(new java.awt.Color(39, 144, 250));
        ps1i.setText("*********************************");
        p1.add(ps1i, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 170, 40));

        ps1.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        ps1.setForeground(new java.awt.Color(39, 144, 250));
        p1.add(ps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 240, 40));

        sel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel1ActionPerformed(evt);
            }
        });
        p1.add(sel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 30, 50));

        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 700, 60));

        jLabel5.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(39, 144, 250));
        jLabel5.setText("Password Manager");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 190, 50));

        jLabel6.setForeground(new java.awt.Color(62, 1, 1));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 50, 1310, 20));

        rSButtonRound3.setText("Add Password");
        rSButtonRound3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 130, 30));

        no.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        no.setForeground(new java.awt.Color(39, 144, 250));
        no.setText("0 Sites And Apps");
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 140, 50));

        p5.setBackground(new java.awt.Color(254, 254, 254));
        p5.setForeground(new java.awt.Color(62, 157, 254));
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p5MouseEntered(evt);
            }
        });
        p5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel3ActionPerformed(evt);
            }
        });
        p5.add(sel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 50));

        eye3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eye3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eyeoff.png"))); // NOI18N
        eye3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eye3MouseClicked(evt);
            }
        });
        p5.add(eye3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 50));

        s3.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        s3.setForeground(new java.awt.Color(39, 144, 250));
        p5.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 320, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/passi.png"))); // NOI18N
        p5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel20.setForeground(new java.awt.Color(62, 1, 1));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/line.png"))); // NOI18N
        p5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-430, 30, 1140, -1));

        ps3.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        ps3.setForeground(new java.awt.Color(39, 144, 250));
        p5.add(ps3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 170, 40));

        ps3i.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        ps3i.setForeground(new java.awt.Color(39, 144, 250));
        ps3i.setText("*********************************");
        p5.add(ps3i, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 230, 40));

        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 700, 60));

        rSButtonRound17.setText("Previous");
        rSButtonRound17.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSButtonRound17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound17ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 110, 30));

        rSButtonRound21.setText("Next");
        rSButtonRound21.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSButtonRound21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound21ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound21, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 90, 30));

        rSButtonRound4.setText("Update");
        rSButtonRound4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, 30));

        passt.setPlaceholder("Password");
        passt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtActionPerformed(evt);
            }
        });
        jPanel1.add(passt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 40));

        sitet.setPlaceholder("Site");
        sitet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sitetActionPerformed(evt);
            }
        });
        jPanel1.add(sitet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 40));

        rSButtonRound5.setText("Refresh");
        rSButtonRound5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 90, 30));

        rSButtonRound8.setText("Delete");
        rSButtonRound8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound8ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 90, 30));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String[] pass = new String[2000];

    String[] site = new String[2000];
    int i = 0;

    void FetchDBs() {
        try {
            PreparedStatement pss;
            String queryString = "SELECT * FROM passwords Where UID=" + UserDB.getUserID();
            pss = DB.getConnection().prepareStatement(queryString);
            try (ResultSet results = pss.executeQuery()) {
                while (results.next()) {

                    pass[i] = results.getString("password");
                    site[i] = results.getString("SiteName");
                    shid[i] = results.getInt("ID");
                    i++;

                }

            }
            no.setText(i + "Sites And Apps");
            if (i >= 1) {
                ps1.setText(pass[0]);
                s1.setText(site[0]);
                cid[1] = shid[0];
                rcount++;
            }
            if (i >= 1) {
                ps2.setText(pass[1]);
                s2.setText(site[1]);
                cid[2] = shid[1];
                rcount++;
            }
            if (i >= 2) {
                ps3.setText(pass[2]);
                s3.setText(site[2]);
                cid[3] = shid[2];
                rcount++;
            }
            if (i >= 3) {
                ps4.setText(pass[3]);
                s4.setText(site[3]);
                cid[4] = shid[3];
                rcount++;
            }
            i = 0;
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    private void rSButtonRound6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound6ActionPerformed
        Dash.main();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound6ActionPerformed

    private void rSButtonRound7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound7ActionPerformed
        Contact.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound7ActionPerformed

    private void rSButtonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound1ActionPerformed
        File f = new File("user.txt");
        f.delete();
        TrayIco t = new TrayIco();
        t.mes = "Logged Out";
        try {
            t.main();
        } catch (AWTException ex) {
            Logger.getLogger(Dash.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login.main();
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound1ActionPerformed


    private void rSButtonRound3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound3ActionPerformed
        try {
            Statement stmt = DB.getConnection().createStatement();
            stmt.execute("INSERT INTO `passwords`(`UID`, `SiteName`, `Password`) VALUES (" + UserDB.getUserID() + ",'" + sitet.getText() + "','" + passt.getText() + "')");
            JOptionPane.showMessageDialog(this, "Password Added");
            FetchDBs();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_rSButtonRound3ActionPerformed
    void AddPass() {

    }

    private void rSButtonRound17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound17ActionPerformed

    private void rSButtonRound21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound21ActionPerformed

    private void rSButtonRound4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound4ActionPerformed
        try {
            Statement stmt = DB.getConnection().createStatement();
            stmt.execute("INSERT INTO `passwords`(`UID`, `SiteName`, `Password`) VALUES (" + UserDB.getUserID() + ",'" + sitet.getText() + "','" + passt.getText() + "')");
            stmt.execute("UPDATE `passwords` SET `SiteName`='" + sitet.getText() + "',`Password`='" + passt.getText() + "' WHERE ID=");
            JOptionPane.showMessageDialog(this, "Password Added");
            FetchDBs();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound4ActionPerformed

    private void sel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel2ActionPerformed
        selectpass(2);  // TODO add your handling code here:
    }//GEN-LAST:event_sel2ActionPerformed

    private void sel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel3ActionPerformed
        selectpass(3);  // TODO add your handling code here:
    }//GEN-LAST:event_sel3ActionPerformed

    private void sel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel4ActionPerformed
        selectpass(4);   // TODO add your handling code here:
    }//GEN-LAST:event_sel4ActionPerformed

    private void sel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel1ActionPerformed
        selectpass(1);
        sitet.setText(s1.getText());
        passt.setText(ps1.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_sel1ActionPerformed
    void selectpass(int num) {
        switch (num) {
            case 1:
                removeSelection();
                sel1.setSelected(true);
                break;
            case 2:
                removeSelection();
                sel2.setSelected(true);
                break;
            case 3:
                removeSelection();
                sel3.setSelected(true);
                break;
            case 4:
                removeSelection();
                sel4.setSelected(true);
                break;
            default:
                removeSelection();

        }

    }

    void removeSelection() {
        sel1.setSelected(false);
        sel2.setSelected(false);
        sel3.setSelected(false);
        sel4.setSelected(false);
    }
    private void p1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseEntered
        
    }//GEN-LAST:event_p1MouseEntered

    private void p3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p3MouseEntered

    private void p5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseEntered
      // TODO add your handling code here:
    }//GEN-LAST:event_p5MouseEntered

    private void p2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseEntered
      // TODO add your handling code here:
    }//GEN-LAST:event_p2MouseEntered

    void passinvisible(int n) {
        ImageIcon image = new ImageIcon(getClass().getResource("/icons/eyeon.png"));
        ImageIcon image1 = new ImageIcon(getClass().getResource("/icons/eyeoff.png"));
        switch (n) {
            case 1:
                passinvisible(0);
                ps1i.setVisible(false);
                ps1.setVisible(true);
                eye1.setIcon(image);
                
                break;
            case 2:
                 passinvisible(0);
                 ps2i.setVisible(false);
                ps2.setVisible(true);
                eye2.setIcon(image);
               
                break;
            case 3:
                 passinvisible(0);
                 ps3i.setVisible(false);
                ps3.setVisible(true);
                eye3.setIcon(image);
               
                break;
            case 4:
                passinvisible(0);
                ps4i.setVisible(false);
                ps4.setVisible(true);
                eye4.setIcon(image);
                
                break;
            default:
                ps1i.setVisible(true);
                ps1.setVisible(false);
                ps2i.setVisible(true);
                ps2.setVisible(false);
                ps3i.setVisible(true);
                ps3.setVisible(false);
                ps4i.setVisible(true);
                ps4.setVisible(false);
                eye1.setIcon(image1);
                eye2.setIcon(image1);
                eye3.setIcon(image1);
                eye4.setIcon(image1);
                break;
        }
    }
    private void eye1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye1MouseClicked
        if(isv[1]){
        passinvisible(1);
        isv[1]=false;
        }
        else{
            isv[1]=true;
            passinvisible(0);
        }

    }//GEN-LAST:event_eye1MouseClicked
    boolean[] isv=new boolean[5];
    
    private void passtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtActionPerformed

    private void sitetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sitetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sitetActionPerformed

    private void rSButtonRound5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound5ActionPerformed
        Passwords.main();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound5ActionPerformed

    private void rSButtonRound8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRound8ActionPerformed

    private void eye2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye2MouseClicked
if(isv[2]){
        passinvisible(2);
        isv[2]=false;
        }
        else{
            isv[2]=true;
            passinvisible(0);
        }
    }//GEN-LAST:event_eye2MouseClicked

    private void eye3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye3MouseClicked
if(isv[3]){
        passinvisible(3);
        isv[3]=false;
        }
        else{
            isv[3]=true;
            passinvisible(0);
        }
    }//GEN-LAST:event_eye3MouseClicked

    private void eye4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eye4MouseClicked
if(isv[4]){
        passinvisible(4);
        isv[4]=false;
        }
        else{
            isv[4]=true;
            passinvisible(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_eye4MouseClicked

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked

selectpass(1);
        sitet.setText(s1.getText());
        passt.setText(ps1.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_p1MouseClicked

    private void p3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseClicked
selectpass(2);
        sitet.setText(s2.getText());
        passt.setText(ps2.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_p3MouseClicked

    private void p5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseClicked
  selectpass(3);
        sitet.setText(s3.getText());
        passt.setText(ps3.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_p5MouseClicked

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
  selectpass(4);
        sitet.setText(s4.getText());
        passt.setText(ps4.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_p2MouseClicked

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
            java.util.logging.Logger.getLogger(Passwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Passwords().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eye1;
    private javax.swing.JLabel eye2;
    private javax.swing.JLabel eye3;
    private javax.swing.JLabel eye4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel no;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p5;
    private RSMaterialComponent.RSTextFieldMaterial passt;
    private javax.swing.JLabel ps1;
    private javax.swing.JLabel ps1i;
    private javax.swing.JLabel ps2;
    private javax.swing.JLabel ps2i;
    private javax.swing.JLabel ps3;
    private javax.swing.JLabel ps3i;
    private javax.swing.JLabel ps4;
    private javax.swing.JLabel ps4i;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound1;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound17;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound21;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound3;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound4;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound5;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound6;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound7;
    private rojeru_san.rsbutton.RSButtonRound rSButtonRound8;
    private rojeru_san.efectos.Roboto roboto1;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private rojerusan.RSRadioButton sel1;
    private rojerusan.RSRadioButton sel2;
    private rojerusan.RSRadioButton sel3;
    private rojerusan.RSRadioButton sel4;
    private RSMaterialComponent.RSTextFieldMaterial sitet;
    // End of variables declaration//GEN-END:variables
}
