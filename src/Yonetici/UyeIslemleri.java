
package Yonetici;

import Ortak.DbHelper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class UyeIslemleri extends javax.swing.JFrame implements IYonetici{
    
    DefaultTableModel model;
   
    public YoneticiEkrani uyeIslemleri;
    public UyeIslemleri() {
        initComponents();
        tabloGöster();
        this.getContentPane().setBackground(Color.white);
    }
    
    public final void tabloGöster(){
         model = (DefaultTableModel)tblUye.getModel();
         model.setRowCount(0);
     try{
            ArrayList <Uyeler> uyeler = getUyeler();
            for (Uyeler uye : uyeler){
                Object [] row={uye.getId(),uye.getUye_ad(),uye.getUye_soyad(),uye.getUye_eposta(),uye.getUye_cepNo(),uye.getUye_dogumT(),uye.getUye_cinsiyet(),uye.getUye_sifre()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUye = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Üye Bilgileri");
        setPreferredSize(new java.awt.Dimension(900, 600));

        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setText("Yönetici Ekranına Geri Dön");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tblUye.setForeground(new java.awt.Color(0, 51, 102));
        tblUye.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad", "E-Posta", "Cep No", "Doğum Tarihi", "Cinsiyet", "Şifre"
            }
        ));
        jScrollPane1.setViewportView(tblUye);

        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Üye Bilgileri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        YoneticiEkrani pencere = new YoneticiEkrani();
        pencere.setVisible(true);
        this.setVisible(false);
        pencere.uyeIslem=this;
        
        Uyeler uye = new Uyeler();
        uye.setProje_sahibi("Nilay İnel");
        System.out.println(uye.getProje_sahibi());
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UyeIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UyeIslemleri().setVisible(true);
            }
        });
    }

    @Override
    public void search() {
     
    }

    @Override
    public void add() {
       
    }

    @Override
    public void delete() {
     
    }

    @Override
    public void update() {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUye;
    // End of variables declaration//GEN-END:variables
private ArrayList<Uyeler> getUyeler() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Uyeler> uyeler = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from uye");
            uyeler = new ArrayList<Uyeler>();
            while(resultSet.next()){
                uyeler.add(new Uyeler(resultSet.getInt("id"),resultSet.getString("uye_ad"),resultSet.getString("uye_soyad"),resultSet.getString("uye_eposta"),resultSet.getString("uye_cepNo"),resultSet.getString("uye_dogumT"),resultSet.getString("uye_cinsiyet"),resultSet.getString("uye_sifre")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return uyeler;
    }
}
