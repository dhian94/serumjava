package tugasakhirpbo2;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author DhIaN
 */
public class vDataUser extends javax.swing.JFrame {
    
    private koneksi con = new koneksi();
   
    
    public vDataUser() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Data User");
        jpEdit.setVisible(false);
    }
    
    public void showData() {
        String query = "SELECT * FROM user";
        DefaultTableModel model = con.select(query);
        jtUser.setModel(model);
    }
    
    private void jtUserMousePressed(java.awt.event.MouseEvent evt) {
        int row = getRowTable();
        String id=(String) getTableValue(row,0);
        String idAdmin="14";
        String UserName = (String) getTableValue(row, 1);
        jtfUserGantiAdmin.setText(UserName);
        String password = (String) getTableValue(row, 2);
        jpfGantiAdmin.setText(password);
        String namaLengkap = (String) getTableValue(row, 3);
        jtfNamaLengkapGantiAdmin.setText(namaLengkap);
        String kelamin = (String) getTableValue(row, 4);
        jtfKelaminGantiAdmin.setText(kelamin);
        String alamat = (String) getTableValue(row, 5);
        jtfAlamatGantiAdmin.setText(alamat);
        if (id.equals(idAdmin)) {
            jtfUserGantiAdmin.setEditable(false);
        }
    }
    
    public Object getTableValue(int a, int b) {
        Object value = jtUser.getValueAt(a, b);
        return value;
    }
    
    public int getRowTable() {
        int row = jtUser.getSelectedRow();
        return row;
    }

//    public int getColumnTable() {
//        int column = jtUser.getSelectedColumn();
//        return column;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpWadahTombol = new javax.swing.JPanel();
        jbRefresh = new javax.swing.JButton();
        jbCreate = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpEdit = new javax.swing.JPanel();
        jbGanti = new javax.swing.JButton();
        jtfUserGantiAdmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNamaLengkapGantiAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpfGantiAdmin = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfKelaminGantiAdmin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfAlamatGantiAdmin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpWadahTombol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbRefresh.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbRefresh.setText("Refresh");
        jbRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRefreshActionPerformed(evt);
            }
        });
        jpWadahTombol.add(jbRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 160, 60));

        jbCreate.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbCreate.setText("Create");
        jbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateActionPerformed(evt);
            }
        });
        jpWadahTombol.add(jbCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 160, 60));

        jbEdit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbEdit.setText("Edit");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });
        jpWadahTombol.add(jbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 160, 60));

        jbDelete.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbDelete.setText("Delete");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });
        jpWadahTombol.add(jbDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, 60));

        jbBack.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jbBack.setText("Back to Admin");
        jbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackActionPerformed(evt);
            }
        });
        jpWadahTombol.add(jbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 60));

        getContentPane().add(jpWadahTombol, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 170, 350));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("TypoUpright BT", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jpEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbGanti.setBackground(new java.awt.Color(0, 153, 153));
        jbGanti.setForeground(new java.awt.Color(0, 0, 0));
        jbGanti.setText("Ganti");
        jbGanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGantiActionPerformed(evt);
            }
        });
        jpEdit.add(jbGanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 277, 89, 40));
        jpEdit.add(jtfUserGantiAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 22, 201, -1));

        jLabel2.setText("User Name");
        jpEdit.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, -1, -1));
        jpEdit.add(jtfNamaLengkapGantiAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 72, 201, -1));

        jLabel3.setText("Password");
        jpEdit.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, -1, -1));
        jpEdit.add(jpfGantiAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 117, 201, -1));

        jLabel4.setText("Nama Lengkap");
        jpEdit.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, -1, -1));

        jLabel5.setText("Jenis Kelamin");
        jpEdit.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 168, -1, -1));
        jpEdit.add(jtfKelaminGantiAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 162, 201, -1));

        jLabel6.setText("Alamat");
        jpEdit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 213, -1, -1));
        jpEdit.add(jtfAlamatGantiAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 207, 201, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/96695-Royalty-Free-RF-Clipart-Illustration-Of-A-Pretty-Brunette-Receptionist-Wearing-Glasses-And-Holding-A-White-Phone.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jpEdit.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 17, 307, -1));

        getContentPane().add(jpEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 810, 340));

        jtUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 158, 630, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateActionPerformed
        this.dispose();
        new vRegisterFromAdmin().setVisible(true);
    }//GEN-LAST:event_jbCreateActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        try {
            jtUserMousePressed(null);
            jbEdit.setEnabled(false);
            jbCreate.setEnabled(false);
            jbRefresh.setEnabled(false);
            jbDelete.setEnabled(false);
            jpEdit.setVisible(true);
            jtfKelaminGantiAdmin.setEditable(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "\nMohon Klik dulu data yang akan diubah");
        }
    }//GEN-LAST:event_jbEditActionPerformed

    private void jbRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRefreshActionPerformed
        try {
            showData();
            jtUser.setVisible(true);
            jpEdit.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jbRefreshActionPerformed

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        this.dispose();
        new vAdmin().setVisible(true);
    }//GEN-LAST:event_jbBackActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        try {
            int row = getRowTable();
            String idUserDelete = (String) getTableValue(row, 0);
            String userName=(String) getTableValue(row, 1);
            System.out.println(userName);
            System.out.println(idUserDelete);
            if (!idUserDelete.equals("14")) {
                String queryDelete = "DELETE FROM `sirum`.`user` WHERE `user`.`idUser` = '" + idUserDelete + "';";
                con.insertUpdateDelete(queryDelete);
                JOptionPane.showMessageDialog(rootPane, "Delete Berhasil!", "Selamat", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Admin tak bisa di delete!", "Maaf", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Delete Gagal!\nMohon klik data yang mau dihapus!", "Maaf", 2);
        }
        showData();
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbGantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGantiActionPerformed
        try {
            int row = getRowTable();
            String idUserGanti = (String) getTableValue(row, 0);
            System.out.println(idUserGanti);
            String queryEdit = "UPDATE `sirum`.`user` SET `username` = '" + jtfUserGantiAdmin.getText() + "', "
                    + " `password` = '" + jpfGantiAdmin.getText() + "',"
                    + " `nama_lengkap` = '" + jtfNamaLengkapGantiAdmin.getText() + "',"
                    + " `jenis_kelamin` = '" + jtfKelaminGantiAdmin.getText() + "',"
                    + " `alamat` = '" + jtfAlamatGantiAdmin.getText() + "'"
                    + " WHERE `user`.`idUser` = '" + idUserGanti + "';";
            con.insertUpdateDelete(queryEdit);
            jpEdit.setVisible(false);
            jtUser.setVisible(true);
            jbCreate.setEnabled(true);
            jbRefresh.setEnabled(true);
            jbDelete.setEnabled(true);
            jbEdit.setEnabled(true);
            showData();
            JOptionPane.showMessageDialog(rootPane, "Edit Data Sukses!", "Selamat", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Edit Data Gagal!", "Maaf", 2);
        }
    }//GEN-LAST:event_jbGantiActionPerformed

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
            java.util.logging.Logger.getLogger(vDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vDataUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBack;
    private javax.swing.JButton jbCreate;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbGanti;
    private javax.swing.JButton jbRefresh;
    private javax.swing.JPanel jpEdit;
    private javax.swing.JPanel jpWadahTombol;
    private javax.swing.JPasswordField jpfGantiAdmin;
    private javax.swing.JTable jtUser;
    private javax.swing.JTextField jtfAlamatGantiAdmin;
    private javax.swing.JTextField jtfKelaminGantiAdmin;
    private javax.swing.JTextField jtfNamaLengkapGantiAdmin;
    private javax.swing.JTextField jtfUserGantiAdmin;
    // End of variables declaration//GEN-END:variables
}
