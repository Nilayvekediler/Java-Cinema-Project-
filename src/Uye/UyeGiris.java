package Uye;


import Ortak.DbHelper;
import Ortak.IlkEkran;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UyeGiris extends javax.swing.JFrame {

    public UyeGiris() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
 
    }
    
     DefaultTableModel model = new DefaultTableModel();
     Connection connection =null;
     DbHelper dbHelper = new DbHelper();
     
     PreparedStatement statement =null;
    
 
    public IlkEkran parent;
    public UyeOl ana;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        lblUyeCepOrEposta = new javax.swing.JLabel();
        lblUyeSifre = new javax.swing.JLabel();
        txtUyeEPosta = new javax.swing.JTextField();
        btnUyeGiris = new javax.swing.JButton();
        pswrdUyeGırıs = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Üye Giriş");
        setBackground(new java.awt.Color(255, 102, 255));
        setForeground(new java.awt.Color(255, 153, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Eğer henüz üye değilseniz üye olunuz.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 284;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 150, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("ÜYE OL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 150, 179, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        panel.setBackground(new java.awt.Color(0, 51, 102));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Üye Giriş  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        panel.setToolTipText("");

        lblUyeCepOrEposta.setForeground(new java.awt.Color(255, 255, 255));
        lblUyeCepOrEposta.setText("E-Posta :");

        lblUyeSifre.setForeground(new java.awt.Color(255, 255, 255));
        lblUyeSifre.setText("Şifre :");

        btnUyeGiris.setForeground(new java.awt.Color(0, 0, 102));
        btnUyeGiris.setText("Giriş Yap");
        btnUyeGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUyeGirisActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/bvv.jpg"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUyeCepOrEposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUyeSifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUyeEPosta, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(pswrdUyeGırıs))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addComponent(btnUyeGiris)
                        .addGap(111, 111, 111))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUyeCepOrEposta)
                            .addComponent(txtUyeEPosta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUyeSifre)
                            .addComponent(pswrdUyeGırıs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(btnUyeGiris)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -1;
        gridBagConstraints.ipady = 82;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 150, 0, 184);
        getContentPane().add(panel, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
     UyeOl pencere = new UyeOl ();
     pencere.setVisible(true);
     this.setVisible(false);
     pencere.parent=this;
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUyeGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUyeGirisActionPerformed
 
     try{
        
         connection = dbHelper.getConnection();
         
         String üyeGirisDeger = txtUyeEPosta.getText();
         String parola= new String(pswrdUyeGırıs.getPassword());
        
         
         String sql = "select * from uye where uye_eposta = ? and uye_sifre = ?";
         statement = connection.prepareStatement(sql);
        
         statement.setString(1,üyeGirisDeger);
         statement.setString(2,String.valueOf(parola.hashCode()));
         
         ResultSet result = statement.executeQuery();
         
         if(result.next() == false){
            JOptionPane.showMessageDialog(null,"Yanlış giriş yaptınız. Lütfen tekrar deneyiniz!");
         }else{
              JOptionPane.showMessageDialog(null,"Giriş başarılı. Yönlendiriliyorsunuz...");
              Anasayfa pencere = new Anasayfa(txtUyeEPosta.getText());
              pencere.setVisible(true);
              this.setVisible(false);
              pencere.anasayfa=this;
              
         }
       
     }catch(SQLException exception){
         dbHelper.showErrorMessage(exception);   
     }finally{
         try {
             statement.close();
             connection.close();
         } catch (SQLException ex) {
            
         }
     }
        
    }//GEN-LAST:event_btnUyeGirisActionPerformed

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
            java.util.logging.Logger.getLogger(UyeGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UyeGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUyeGiris;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblUyeCepOrEposta;
    private javax.swing.JLabel lblUyeSifre;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField pswrdUyeGırıs;
    private javax.swing.JTextField txtUyeEPosta;
    // End of variables declaration//GEN-END:variables

}
