package Uye;


import Ortak.DbHelper;
import javax.swing.DefaultListModel;
import java.sql.*;
import java.text.SimpleDateFormat;


public class UyeOl extends javax.swing.JFrame {
    
    DefaultListModel model;

    public UyeOl() {
        initComponents();
        model = new DefaultListModel();
    
        
    }
     public UyeGiris parent;

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtUOSoyad = new javax.swing.JTextField();
        lblAdınız = new javax.swing.JLabel();
        txtUOEposta = new javax.swing.JTextField();
        lblSoyadınız = new javax.swing.JLabel();
        txtUOTel = new javax.swing.JTextField();
        lblEpostanız = new javax.swing.JLabel();
        lblCepTelNo = new javax.swing.JLabel();
        lblDoğumT = new javax.swing.JLabel();
        lblCinsiyetiniz = new javax.swing.JLabel();
        lblSifreniz = new javax.swing.JLabel();
        UOsifreniz = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        txtUOAd = new javax.swing.JTextField();
        cboxCinsiyet = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Üye ol");
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Üye Ol  "));
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);

        txtUOSoyad.setText("Örn. İnel");

        lblAdınız.setText("Adınız :");

        txtUOEposta.setText("Örn. nilayvekediler@gmail.com");

        lblSoyadınız.setText("Soyadınız :");

        txtUOTel.setText("Örn. 0550 945 82 25");

        lblEpostanız.setText("E-posta Adresiniz :");

        lblCepTelNo.setText("Cep Telefonunuz :");

        lblDoğumT.setText("Doğum Tarihiniz :");

        lblCinsiyetiniz.setText("Cinsiyetiniz :");

        lblSifreniz.setText("Şifreniz :");

        UOsifreniz.setText("jPasswordField1");

        jButton1.setText("Üye Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtUOAd.setText("Örn. Nilay ");

        cboxCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kadın", "Erkek", "Diğer" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAdınız, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSoyadınız, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEpostanız, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(lblCepTelNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDoğumT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCinsiyetiniz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSifreniz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUOTel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUOEposta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                            .addComponent(txtUOSoyad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                            .addComponent(cboxCinsiyet, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUOAd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UOsifreniz)))
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdınız)
                    .addComponent(txtUOAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSoyadınız)
                    .addComponent(txtUOSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpostanız)
                    .addComponent(txtUOEposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCepTelNo)
                    .addComponent(txtUOTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDoğumT)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCinsiyetiniz)
                    .addComponent(cboxCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSifreniz)
                    .addComponent(UOsifreniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 810, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/aaaa.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, -20, 1130, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Connection connection =null;
     DbHelper dbHelper = new DbHelper();
     
     PreparedStatement statement =null;
     try{ 
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         String date = sdf.format(jDateChooser1.getDate());
         String sifre= new String(UOsifreniz.getPassword());
        
         connection = dbHelper.getConnection();
         String sql = "insert into uye (uye_ad,uye_soyad,uye_eposta,uye_cepNo,uye_dogumT,uye_cinsiyet,uye_sifre) values(?,?,?,?,?,?,?)";
         statement = connection.prepareStatement(sql);
         statement.setString(1,txtUOAd.getText());
         statement.setString(2,txtUOSoyad.getText());
         statement.setString(3,txtUOEposta.getText());
         statement.setString(4,txtUOTel.getText());
         statement.setString(5,date);
         statement.setString(6, (String) cboxCinsiyet.getSelectedItem());
         statement.setString(7,String.valueOf(sifre.hashCode()));
         int result = statement.executeUpdate();
         
     }catch(SQLException exception){
         dbHelper.showErrorMessage(exception);   
     }finally{
         try {
             statement.close();
             connection.close();
         } catch (SQLException ex) {
            dbHelper.showErrorMessage(ex);
         }
     }
        
        
        
     UyeGiris pencere = new UyeGiris ();
     pencere.setVisible(true);
     this.setVisible(false);
     pencere.ana=this;
  
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UyeOl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField UOsifreniz;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboxCinsiyet;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdınız;
    private javax.swing.JLabel lblCepTelNo;
    private javax.swing.JLabel lblCinsiyetiniz;
    private javax.swing.JLabel lblDoğumT;
    private javax.swing.JLabel lblEpostanız;
    private javax.swing.JLabel lblSifreniz;
    private javax.swing.JLabel lblSoyadınız;
    private javax.swing.JTextField txtUOAd;
    private javax.swing.JTextField txtUOEposta;
    private javax.swing.JTextField txtUOSoyad;
    private javax.swing.JTextField txtUOTel;
    // End of variables declaration//GEN-END:variables
}
