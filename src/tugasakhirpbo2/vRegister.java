package tugasakhirpbo2;

/**
 *
 * @author dhian
 */
import javax.swing.*;

public class vRegister extends javax.swing.JFrame {

    private koneksi con = new koneksi();

    /**
     * Creates new form vRegister
     */
    public vRegister() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Form Register");
        getKelamin();
    }

    public String getKelamin() {
        String[] jenisKelamin = {"Laki-Laki", "Perempuan"};
        for (int i = 0; i < jenisKelamin.length; i++) {
            jcbGender.addItem(jenisKelamin[i]);
        }
        String kelamin = jcbGender.getSelectedItem().toString();
        return kelamin;
    }

    public String getUser() {
        String userName = jtfUser.getText();
//        char[] pecah = userName.toCharArray();
//        for (int i = 0; i < pecah.length; i++) {
//            if (i > 30) {
//                JOptionPane.showMessageDialog(rootPane, "Username Maksimal 30 Karakter!", "Peringatan", 0);
//                break;
//            }
//        }
        return userName;
    }

    public String getPassword() {
        String password = jpfPasswd.getText();
        return password;
    }

    public String getNamaLengkap() {
        String namaLengkap = jtfNamaLengkap.getText();
        return namaLengkap;
    }

    public String getAlamat() {
        String alamat = jtfAlamat.getText();
        return alamat;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlUserName = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jlpasswd = new javax.swing.JLabel();
        jpfPasswd = new javax.swing.JPasswordField();
        jlNamaLengkap = new javax.swing.JLabel();
        jtfNamaLengkap = new javax.swing.JTextField();
        jlGender = new javax.swing.JLabel();
        jcbGender = new javax.swing.JComboBox();
        jlAlamat = new javax.swing.JLabel();
        jtfAlamat = new javax.swing.JTextField();
        jbSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jlUserName.setText("User Name");

        jlpasswd.setText("Password");

        jlNamaLengkap.setText("Nama Lengkap");

        jlGender.setText("Jenis Kelamin");

        jlAlamat.setText("Alamat");

        jbSubmit.setBackground(new java.awt.Color(0, 153, 153));
        jbSubmit.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jbSubmit.setForeground(new java.awt.Color(0, 0, 0));
        jbSubmit.setText("Submit");
        jbSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubmitActionPerformed(evt);
            }
        });

        jLabel1.setText("*Semua Field Wajib Diisi!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUserName)
                            .addComponent(jlpasswd)
                            .addComponent(jlNamaLengkap)
                            .addComponent(jlGender)
                            .addComponent(jlAlamat))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfUser)
                            .addComponent(jpfPasswd)
                            .addComponent(jtfNamaLengkap)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 93, Short.MAX_VALUE))
                            .addComponent(jtfAlamat)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUserName)
                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlpasswd)
                    .addComponent(jpfPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNamaLengkap)
                    .addComponent(jtfNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGender)
                    .addComponent(jcbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlamat)
                    .addComponent(jtfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubmitActionPerformed
        System.out.println("user = " + getUser());
        System.out.println("password =" + getPassword());
        System.out.println("nama lengkap = " + getNamaLengkap());
        System.out.println("jenis kelamin = " + getKelamin());
        System.out.println("alamat = " + getAlamat());
        try {
            if (getUser().equals("") || getPassword().equals("") || getNamaLengkap().equals("") || getAlamat().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Data Not Inserted\nMohon Isi Semua Form!");
            } else {
                String query = "INSERT INTO `sirum`.`user` (`idUser`,`username`, `password`, `nama_lengkap`, `jenis_kelamin`, `alamat`) "
                        + "VALUES (NULL, '" + getUser() + "', '"
                        + getPassword() + "', '"
                        + getNamaLengkap() + "', '"
                        + getKelamin() + "', '"
                        + getAlamat() + "');";
                con.insertUpdateDelete(query);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan!");
                this.dispose();
                new vLogin().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Dimasukkan", "Maaf", 2);

        }
    }//GEN-LAST:event_jbSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(vRegister.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vRegister.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vRegister.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vRegister.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbSubmit;
    private javax.swing.JComboBox jcbGender;
    private javax.swing.JLabel jlAlamat;
    private javax.swing.JLabel jlGender;
    private javax.swing.JLabel jlNamaLengkap;
    private javax.swing.JLabel jlUserName;
    private javax.swing.JLabel jlpasswd;
    private javax.swing.JPasswordField jpfPasswd;
    private javax.swing.JTextField jtfAlamat;
    private javax.swing.JTextField jtfNamaLengkap;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
