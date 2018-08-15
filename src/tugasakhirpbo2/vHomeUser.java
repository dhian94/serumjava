package tugasakhirpbo2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author dhian
 */
public class vHomeUser extends javax.swing.JFrame {

    koneksi con = new koneksi();
    String que;
    boolean stop;
    String lgn;

    /**
     * Creates new form vHome
     */
    public vHomeUser(String id) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("SIRUM");
        panelHome.setVisible(true);
        jpRAB.setVisible(false);
        jbHitung.setVisible(false);
        this.lgn = id;
    }

    public void showGambar(JLabel jl, String queCar) {
        que = queCar;
        try {
            PreparedStatement statement = con.getKoneksi().
                    prepareStatement("select gambar from data_rumah where tipe_rumah=" + queCar);
            // hasil query
            ResultSet resultSet = statement.executeQuery();
            // jika return row > 0 or it has next
            while (resultSet.next()) {
                // get the stream
                InputStream is = resultSet.getBlob("gambar").getBinaryStream();
                try {
                    // create new icon
                    ImageIcon icon = new ImageIcon(// fill this Image with ImageIO and read the stream
                            ImageIO.read(is));
                    // show the image and tara!
                    jl.setIcon(icon);
                } catch (IOException e) {
                    System.out.println(e);
                }

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlHome = new javax.swing.JLabel();
        jlMotto = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        jpWadahHome = new javax.swing.JPanel();
        jpRAB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfHasil = new javax.swing.JTextField();
        jtfhargaTanah = new javax.swing.JTextField();
        jtfLuasTanah = new javax.swing.JTextField();
        jtfBangun = new javax.swing.JTextField();
        jtfLuasBangun = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbHitung = new javax.swing.JButton();
        jlViewGB = new javax.swing.JLabel();
        jlGbRumah = new javax.swing.JLabel();
        panelGalery = new javax.swing.JPanel();
        JlWadahGambar5 = new javax.swing.JLabel();
        JlWadahGambar1 = new javax.swing.JLabel();
        JlWadahGambar6 = new javax.swing.JLabel();
        JlWadahGambar4 = new javax.swing.JLabel();
        JlWadahGambar2 = new javax.swing.JLabel();
        JlWadahGambar3 = new javax.swing.JLabel();
        jpAtas = new javax.swing.JPanel();
        jtSelamatDatang = new javax.swing.JLabel();
        jtJudul = new javax.swing.JLabel();
        jPSampingKiri = new javax.swing.JPanel();
        jbMulai = new javax.swing.JButton();
        jbHitungRab = new javax.swing.JButton();
        jbTentang = new javax.swing.JButton();
        jlLogOut = new javax.swing.JLabel();
        jbGaleri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Home-48.png"))); // NOI18N
        jlHome.setText("jLabel2");
        jlHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlHomeMouseClicked(evt);
            }
        });
        getContentPane().add(jlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 41, 30));

        jlMotto.setFont(new java.awt.Font("TypoUpright BT", 0, 36)); // NOI18N
        jlMotto.setForeground(new java.awt.Color(0, 0, 0));
        jlMotto.setText("Mempermudah Sewa Hunian Anda...!");
        getContentPane().add(jlMotto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 500, 30));

        panelHome.setBackground(new java.awt.Color(153, 153, 153));
        panelHome.setLayout(null);

        jpWadahHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelHome.add(jpWadahHome);
        jpWadahHome.setBounds(180, 560, 620, 40);

        jpRAB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Total Biaya yang Diperlukan");
        jpRAB.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel2.setText("Harga Tanah/m^2");
        jpRAB.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setText("Luas Tanah yang Diinginkan");
        jpRAB.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("Harga Bangun Rumah/m^2");
        jpRAB.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jpRAB.add(jtfHasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 230, 40));
        jpRAB.add(jtfhargaTanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 230, 40));
        jpRAB.add(jtfLuasTanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 230, 40));
        jpRAB.add(jtfBangun, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 230, 40));
        jpRAB.add(jtfLuasBangun, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 230, 40));

        jLabel5.setText("Luas Rumah yang Diinginkan");
        jpRAB.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jbHitung.setText("Hitung");
        jbHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHitungActionPerformed(evt);
            }
        });
        jpRAB.add(jbHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 90, 60));

        jlViewGB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bahan/Optimized-45.jpg"))); // NOI18N
        jlViewGB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlViewGB.setMaximumSize(new java.awt.Dimension(49, 15));
        jlViewGB.setMinimumSize(new java.awt.Dimension(49, 15));
        jlViewGB.setPreferredSize(new java.awt.Dimension(49, 15));
        jpRAB.add(jlViewGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 204, 144));

        panelHome.add(jpRAB);
        jpRAB.setBounds(0, 0, 650, 390);

        jlGbRumah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bahan/Optimized-backgr.jpg"))); // NOI18N
        panelHome.add(jlGbRumah);
        jlGbRumah.setBounds(0, 0, 650, 370);

        getContentPane().add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 650, 390));

        panelGalery.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JlWadahGambar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlWadahGambar5.setMaximumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar5.setMinimumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar5.setPreferredSize(new java.awt.Dimension(49, 15));
        panelGalery.add(JlWadahGambar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 204, 144));

        JlWadahGambar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlWadahGambar1.setMaximumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar1.setMinimumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar1.setPreferredSize(new java.awt.Dimension(49, 15));
        panelGalery.add(JlWadahGambar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 204, 144));

        JlWadahGambar6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlWadahGambar6.setMaximumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar6.setMinimumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar6.setPreferredSize(new java.awt.Dimension(49, 15));
        panelGalery.add(JlWadahGambar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 204, 144));

        JlWadahGambar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlWadahGambar4.setMaximumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar4.setMinimumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar4.setPreferredSize(new java.awt.Dimension(49, 15));
        panelGalery.add(JlWadahGambar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 204, 144));

        JlWadahGambar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlWadahGambar2.setMaximumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar2.setMinimumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar2.setPreferredSize(new java.awt.Dimension(49, 15));
        panelGalery.add(JlWadahGambar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 204, 144));

        JlWadahGambar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlWadahGambar3.setMaximumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar3.setMinimumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar3.setPreferredSize(new java.awt.Dimension(49, 15));
        panelGalery.add(JlWadahGambar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 204, 144));

        getContentPane().add(panelGalery, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 650, 390));

        jpAtas.setBackground(new java.awt.Color(0, 153, 153));
        jpAtas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtSelamatDatang.setFont(new java.awt.Font("Tiranti Solid LET", 0, 36)); // NOI18N
        jtSelamatDatang.setForeground(new java.awt.Color(255, 255, 255));
        jtSelamatDatang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtSelamatDatang.setText("Selamat Datang di");
        jpAtas.add(jtSelamatDatang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 100));

        jtJudul.setFont(new java.awt.Font("TypoUpright BT", 0, 60)); // NOI18N
        jtJudul.setForeground(new java.awt.Color(255, 255, 255));
        jtJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtJudul.setText("Home Sweet Home Application");
        jpAtas.add(jtJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 830, 80));

        getContentPane().add(jpAtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 170));

        jPSampingKiri.setBackground(new java.awt.Color(153, 153, 153));
        jPSampingKiri.setLayout(null);

        jbMulai.setBackground(new java.awt.Color(0, 0, 204));
        jbMulai.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jbMulai.setForeground(new java.awt.Color(255, 255, 255));
        jbMulai.setText("Mulai");
        jbMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMulaiActionPerformed(evt);
            }
        });
        jPSampingKiri.add(jbMulai);
        jbMulai.setBounds(0, 20, 180, 60);

        jbHitungRab.setBackground(new java.awt.Color(0, 0, 204));
        jbHitungRab.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jbHitungRab.setForeground(new java.awt.Color(255, 255, 255));
        jbHitungRab.setText("Hitung RAB");
        jbHitungRab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHitungRabActionPerformed(evt);
            }
        });
        jPSampingKiri.add(jbHitungRab);
        jbHitungRab.setBounds(0, 290, 180, 60);

        jbTentang.setBackground(new java.awt.Color(0, 0, 204));
        jbTentang.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jbTentang.setForeground(new java.awt.Color(255, 255, 255));
        jbTentang.setText("Tentang");
        jbTentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTentangActionPerformed(evt);
            }
        });
        jPSampingKiri.add(jbTentang);
        jbTentang.setBounds(0, 200, 180, 60);

        jlLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Media-Start-48.png"))); // NOI18N
        jlLogOut.setText("Log Out");
        jlLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLogOutMouseClicked(evt);
            }
        });
        jPSampingKiri.add(jlLogOut);
        jlLogOut.setBounds(30, 360, 110, 70);

        jbGaleri.setBackground(new java.awt.Color(0, 0, 204));
        jbGaleri.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jbGaleri.setForeground(new java.awt.Color(255, 255, 255));
        jbGaleri.setText("Galeri");
        jbGaleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGaleriActionPerformed(evt);
            }
        });
        jPSampingKiri.add(jbGaleri);
        jbGaleri.setBounds(0, 110, 180, 60);

        getContentPane().add(jPSampingKiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogOutMouseClicked
        this.dispose();
        new vLogin().setVisible(true);
    }//GEN-LAST:event_jlLogOutMouseClicked

    private void jbHitungRabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHitungRabActionPerformed
        stop = false;
        jpWadahHome.setVisible(false);
        jpRAB.setVisible(true);
        jbHitung.setVisible(true);
//        new Thread() {
//            public void run() {
//                boolean a = true;
//                while (true) {
//                    if (stop) {
//                        break;
//                    }
//                    jlViewGB.setIcon(new javax.swing.ImageIcon(getClass().getResource((a) ? "/bahan/Optimized-36.jpg" : "/bahan/702.jpg" )));
//                    a = !a;
//                    try {
//                        sleep(1000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(vHomeUser.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        }.start();
    }//GEN-LAST:event_jbHitungRabActionPerformed

    private void jbGaleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGaleriActionPerformed
        panelHome.setVisible(false);
        panelGalery.setVisible(true);
        showGambar(JlWadahGambar1, "36");
        showGambar(JlWadahGambar2, "45");
        showGambar(JlWadahGambar3, "54");
        showGambar(JlWadahGambar4, "60");
        showGambar(JlWadahGambar5, "701");
        showGambar(JlWadahGambar6, "70");
    }//GEN-LAST:event_jbGaleriActionPerformed

    private void jlHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlHomeMouseClicked
        panelHome.setVisible(true);
        jpWadahHome.setVisible(true);
        jpRAB.setVisible(false);
        jbHitung.setVisible(false);
        stop = true;
    }//GEN-LAST:event_jlHomeMouseClicked

    private void jbTentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTentangActionPerformed
        JOptionPane.showMessageDialog(panelHome, "SIRUM merupakan Aplikasi untuk membantu pengelola persewaan rumah\n"
                + "kegiatan transaksi penyewaan akan ditangani oleh SIRUM\n"
                + "mulai dari input rumah yang tersedia hingga si user bisa memilih rumah yang ingin disewa.");
    }//GEN-LAST:event_jbTentangActionPerformed

    private void jbMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMulaiActionPerformed
        this.dispose();
        new vDeskRumah(lgn).setVisible(true);
        System.out.println(lgn);
    }//GEN-LAST:event_jbMulaiActionPerformed

    private void jbHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHitungActionPerformed
        jtfHasil.setEditable(false);
        String hrgtnh = jtfhargaTanah.getText();
        String luasTnh = jtfLuasTanah.getText();
        String hrgBgn = jtfBangun.getText();
        String luasBgn = jtfLuasBangun.getText();
        int hasil = (Integer.parseInt(hrgtnh) * Integer.parseInt(luasTnh)) + (Integer.parseInt(hrgBgn) * Integer.parseInt(luasBgn));
        jtfHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_jbHitungActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vHomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vHomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vHomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vHomeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new vHomeUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlWadahGambar1;
    private javax.swing.JLabel JlWadahGambar2;
    private javax.swing.JLabel JlWadahGambar3;
    private javax.swing.JLabel JlWadahGambar4;
    private javax.swing.JLabel JlWadahGambar5;
    private javax.swing.JLabel JlWadahGambar6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPSampingKiri;
    private javax.swing.JButton jbGaleri;
    private javax.swing.JButton jbHitung;
    private javax.swing.JButton jbHitungRab;
    private javax.swing.JButton jbMulai;
    private javax.swing.JButton jbTentang;
    private javax.swing.JLabel jlGbRumah;
    private javax.swing.JLabel jlHome;
    private javax.swing.JLabel jlLogOut;
    private javax.swing.JLabel jlMotto;
    private javax.swing.JLabel jlViewGB;
    private javax.swing.JPanel jpAtas;
    private javax.swing.JPanel jpRAB;
    private javax.swing.JPanel jpWadahHome;
    private javax.swing.JLabel jtJudul;
    private javax.swing.JLabel jtSelamatDatang;
    private javax.swing.JTextField jtfBangun;
    private javax.swing.JTextField jtfHasil;
    private javax.swing.JTextField jtfLuasBangun;
    private javax.swing.JTextField jtfLuasTanah;
    private javax.swing.JTextField jtfhargaTanah;
    private javax.swing.JPanel panelGalery;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables
}
