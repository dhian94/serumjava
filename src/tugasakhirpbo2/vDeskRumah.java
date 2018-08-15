/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhirpbo2;

import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author DhIaN
 */
public class vDeskRumah extends javax.swing.JFrame {

    koneksi con = new koneksi();
    String idLog;
    String tpRmh = null;
    String namaLengkap = null;

    /**
     * Creates new form vPertanyaan4User
     */
    public vDeskRumah(String idUser) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cari SIRUM");
        jtaDesk.setEditable(false);
        jtfHarga.setEditable(false);
        jtfLuas.setEditable(false);
        jtfStok.setEditable(false);
        this.idLog = idUser;
        jbSewa.setEnabled(false);
    }

    public String[] getNama(String getId) {
        String queName = "select * from user where idUser=" + getId + "";
        return con.getData(queName, 4);
    }

    public String UserLogin() {
        String[] user = getNama(idLog);
        for (int i = 0; i < user.length; i++) {
            namaLengkap = user[i];
        }
        return this.namaLengkap;
    }

    public void ngisi(String que, JTextField tf) {
        String cari = jtfCari.getText();
        String queCar = "SELECT `" + que + "` FROM `data_rumah` WHERE tipe_rumah=" + cari + "";
        try {
            Statement st = con.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(queCar);
            rs.next();
            tf.setText(rs.getString(1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ngisi(String que, JTextArea ta) {
        String cari = jtfCari.getText();
        String queCar = "SELECT " + que + " FROM data_rumah WHERE tipe_rumah=" + cari + ";";
        try {
            Statement st = con.getKoneksi().createStatement();
            ResultSet rs = st.executeQuery(queCar);
            rs.next();
            ta.setText(rs.getString(1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Isi Kolom Cari Terlebih Dahulu!");
            System.out.println(e);
        }
    }

    public void ngisi(String que, JButton bt) {
        String cari = jtfCari.getText();
        try {
            PreparedStatement statement = con.getKoneksi().
                    prepareStatement("select " + que + " from data_rumah where tipe_rumah=" + cari + "");
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
                    JlWadahGambar.setIcon(icon);
                } catch (IOException e) {
                    System.out.println(e);
                }

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void showText() {
        ngisi("luas_rumah/tanah", jtfLuas);
        ngisi("harga", jtfHarga);
        ngisi("deskripsi", jtaDesk);
        ngisi("gambar", jbCari);
        ngisi("stok", jtfStok);
    }


    /**
     * This method is called from within the st to initialize the form. WARNING:
     * Do NOT modify this code. The content of this method is always regenerated
     * by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbBatal = new javax.swing.JButton();
        jtfCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfLuas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDesk = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jbCari = new javax.swing.JButton();
        JlWadahGambar = new javax.swing.JLabel();
        jbSewa = new javax.swing.JButton();
        jtfStok = new javax.swing.JTextField();
        Stok = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TypoUpright BT", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIRUM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jbBatal.setBackground(new java.awt.Color(0, 153, 153));
        jbBatal.setForeground(new java.awt.Color(0, 0, 0));
        jbBatal.setText("Batal");
        jbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBatalActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipe");

        jLabel3.setText("Luas");

        jLabel4.setText("Harga");

        jtaDesk.setColumns(20);
        jtaDesk.setRows(5);
        jScrollPane1.setViewportView(jtaDesk);

        jLabel5.setText("Deskripsi");

        jbCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/magnifier13.png"))); // NOI18N
        jbCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCariActionPerformed(evt);
            }
        });

        JlWadahGambar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlWadahGambar.setMaximumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar.setMinimumSize(new java.awt.Dimension(49, 15));
        JlWadahGambar.setPreferredSize(new java.awt.Dimension(49, 15));

        jbSewa.setBackground(new java.awt.Color(0, 153, 153));
        jbSewa.setForeground(new java.awt.Color(0, 0, 0));
        jbSewa.setText("sewa");
        jbSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSewaActionPerformed(evt);
            }
        });

        Stok.setText("Stok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JlWadahGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(Stok))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfStok)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(jtfHarga)
                            .addComponent(jtfLuas))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Stok)
                            .addComponent(jtfStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(JlWadahGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBatal)
                    .addComponent(jbSewa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBatalActionPerformed
        this.dispose();
        new vHomeUser(idLog).setVisible(true);
    }//GEN-LAST:event_jbBatalActionPerformed

    private void jbCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCariActionPerformed
        try {
            if (jtfCari.getText().equals("36") || jtfCari.getText().equals("45")
                    || jtfCari.getText().equals("54") || jtfCari.getText().equals("60")
                    || jtfCari.getText().equals("70") || jtfCari.getText().equals("701")) {
                showText();
                tpRmh = jtfCari.getText();
                jbSewa.setEnabled(true);
            } else if (jtfCari.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Kolom Tipe");
                jtfCari.setText("");
                jtfHarga.setText("");
                jtfLuas.setText("");
                jtaDesk.setText("");
                JlWadahGambar.setIcon(null);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Maaf Tipe Rumah Tidak Tersedia");
                jtfCari.setText("");
                jtfHarga.setText("");
                jtfLuas.setText("");
                jtaDesk.setText("");
                JlWadahGambar.setIcon(null);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jbCariActionPerformed

    private void jbSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSewaActionPerformed
        this.dispose();
        String harga = jtfHarga.getText();
        String tipe = jtfLuas.getText();
        new vSewa(idLog, tpRmh, UserLogin(), tipe, harga).setVisible(true);
    }//GEN-LAST:event_jbSewaActionPerformed

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
            java.util.logging.Logger.getLogger(vDeskRumah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vDeskRumah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vDeskRumah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vDeskRumah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new vDeskRumah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlWadahGambar;
    private javax.swing.JLabel Stok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBatal;
    private javax.swing.JButton jbCari;
    private javax.swing.JButton jbSewa;
    private javax.swing.JTextArea jtaDesk;
    private javax.swing.JTextField jtfCari;
    private javax.swing.JTextField jtfHarga;
    private javax.swing.JTextField jtfLuas;
    private javax.swing.JTextField jtfStok;
    // End of variables declaration//GEN-END:variables
}
