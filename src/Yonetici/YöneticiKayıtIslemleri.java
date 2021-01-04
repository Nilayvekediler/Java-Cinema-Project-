
package Yonetici;

import Ortak.DbHelper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class YöneticiKayıtIslemleri extends javax.swing.JFrame implements IYonetici{

    DefaultTableModel model;
   
    public YöneticiKayıtIslemleri() {
     
            initComponents(); 
            tabloGöster();
            this.getContentPane().setBackground(Color.white);
          
    }
     public YoneticiEkrani yoneticiEkrani;
     
     public final void tabloGöster(){
         model = (DefaultTableModel)tblYonetici.getModel();
         model.setRowCount(0);
     try{
            ArrayList <Yoneticiler> yoneticiler = getYonetici();
            for (Yoneticiler yonetici : yoneticiler){
                Object [] row={yonetici.getId(),yonetici.getYonetici_ad(),yonetici.getYonetici_soyad(),yonetici.getYonetici_eposta(),yonetici.getYonetici_cepNo(),yonetici.getYonetici_dogumT(),yonetici.getYonetici_cinsiyet(),yonetici.getYonetici_sifre()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
           
        }
     }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblYonetici = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        txtSoyad = new javax.swing.JTextField();
        txtEposta = new javax.swing.JTextField();
        txtCepNo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBilgilendirme = new javax.swing.JLabel();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        dateChooser = new com.toedter.calendar.JDateChooser();
        sifre_yonetici = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici Kayıt İşlemleri");
        setPreferredSize(new java.awt.Dimension(910, 610));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblYonetici.setForeground(new java.awt.Color(0, 51, 102));
        tblYonetici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Yönetici Ad", "Yönetici Soyad", "Yönetici E-Posta", "Yönetici Cep No", "Yönetici Doğum T.", "Yönetici Cinsiyet", "Yönetici Şifre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblYonetici);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 365, 700, 170));

        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Ara :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 55, 19));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 640, -1));

        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Soyad :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 55, -1));

        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("E-Posta :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 55, -1));

        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Cep No :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 55, -1));

        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Doğum Tarihi :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Cinsiyet :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 159, -1));

        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Şifre :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 69, -1));

        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Ad :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 55, -1));
        getContentPane().add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 241, -1));
        getContentPane().add(txtSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 241, -1));
        getContentPane().add(txtEposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 241, -1));
        getContentPane().add(txtCepNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 241, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Yeni Yönetici Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Yönetici Güncelle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("Yönetici Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 114, -1, 150));
        getContentPane().add(txtBilgilendirme, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 224, 16));

        buttonGroup1.add(chk1);
        chk1.setForeground(new java.awt.Color(0, 51, 102));
        chk1.setText("Kadın");
        getContentPane().add(chk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 79, -1));

        buttonGroup1.add(chk2);
        chk2.setForeground(new java.awt.Color(0, 51, 102));
        chk2.setText("Erkek");
        getContentPane().add(chk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 79, -1));

        buttonGroup1.add(chk3);
        chk3.setForeground(new java.awt.Color(0, 51, 102));
        chk3.setText("Diğer");
        getContentPane().add(chk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 79, -1));

        dateChooser.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 241, -1));
        getContentPane().add(sifre_yonetici, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 241, -1));

        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setText("Yönetici Ekranına Geri Dön");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtBilgilendirme.setText("");
        add();
        tabloGöster();  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtBilgilendirme.setText("");
        delete();
        tabloGöster();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtBilgilendirme.setText("");
        update();
        tabloGöster();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        search();
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       YoneticiEkrani pencere = new YoneticiEkrani();
       pencere.setVisible(true);
       this.setVisible(false);
       pencere.yoneticiKayıt=this;
    }//GEN-LAST:event_jButton4ActionPerformed
public String getCinsiyet(){
        if(chk1.isSelected()){
            return "Kadın";
        }
        else if(chk2.isSelected()){
            return "Erkek";
        }
        else{
             return "Diğer";
        }}
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
            java.util.logging.Logger.getLogger(YöneticiKayıtIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YöneticiKayıtIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YöneticiKayıtIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YöneticiKayıtIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YöneticiKayıtIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField sifre_yonetici;
    private javax.swing.JTable tblYonetici;
    private javax.swing.JTextField txtAd;
    private javax.swing.JLabel txtBilgilendirme;
    private javax.swing.JTextField txtCepNo;
    private javax.swing.JTextField txtEposta;
    private javax.swing.JTextField txtSoyad;
    // End of variables declaration//GEN-END:variables
private ArrayList<Yoneticiler> getYonetici() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Yoneticiler> yonetici = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from yonetici");
            yonetici = new ArrayList<Yoneticiler>();
            while(resultSet.next()){
                yonetici.add(new Yoneticiler(resultSet.getInt("id"),resultSet.getString("yonetici_ad"),resultSet.getString("yonetici_soyad"),resultSet.getString("yonetici_eposta"),resultSet.getString("yonetici_cepNo"),resultSet.getString("yonetici_dogumT"),resultSet.getString("yonetici_cinsiyet"),resultSet.getString("yonetici_sifre")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return yonetici;
    }

    @Override
    public void search() {
        String searchKey = jTextField1.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblYonetici.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
       
    }

    @Override
    public void add() {
     Connection connection =null;
     DbHelper dbHelper = new DbHelper();
     
     PreparedStatement statement =null;
     try{
         
        String ad = txtAd.getText();
        String soyad = txtSoyad.getText();
        String ePosta = txtEposta.getText();
        String cepNo = txtCepNo.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dogumT =sdf.format(dateChooser.getDate());
        String sifre = new String(sifre_yonetici.getPassword());
        
         connection = dbHelper.getConnection();
         String sql = "insert into yonetici (yonetici_ad,yonetici_soyad,yonetici_eposta,yonetici_cepNo,yonetici_dogumT,yonetici_cinsiyet,yonetici_sifre) values(?,?,?,?,?,?,?)";
         statement = connection.prepareStatement(sql);
         statement.setString(1,ad);
         statement.setString(2,soyad);
         statement.setString(3,ePosta);
         statement.setString(4,cepNo);
         statement.setString(5,dogumT);
         statement.setString(6,getCinsiyet());
         statement.setString(7,String.valueOf(sifre.hashCode()));
         int result = statement.executeUpdate();
         txtBilgilendirme.setText("Yönetici Eklendi.");
     
         
         
     }catch(SQLException exception){
         dbHelper.showErrorMessage(exception);   
     }finally{
         try {
             statement.close();
             connection.close();
         } catch (SQLException ex) {
            
         }
     }
        
    }

    @Override
    public void delete() {
   
     int selectedRow =tblYonetici.getSelectedRow();
     if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtBilgilendirme.setText("Yönetici tablosu boşken silme işlemi yapılamaz.");
         } else{
             txtBilgilendirme.setText("Lütfen silinecek yöneticiyi tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Delete from yonetici where id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 statement.setInt(1, id);
                 statement.executeUpdate();
                 txtBilgilendirme.setText("Yönetici Silindi.");
             } catch (SQLException ex) {
                 
             }     
         } catch (SQLException ex) {
             Logger.getLogger(YöneticiKayıtIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
         }
     }
    }

    @Override
    public void update() {
        String ad = txtAd.getText();
        String soyad = txtSoyad.getText();
        String ePosta = txtEposta.getText();
        String cepNo = txtCepNo.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dogumT =sdf.format(dateChooser.getDate());
        String sifre = new String(sifre_yonetici.getPassword());
        
        
        int selectedRow = tblYonetici.getSelectedRow();
        
         if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtBilgilendirme.setText("Yönetici tablosu boşken güncelleme işlemi yapılamaz.");
         } else{
             txtBilgilendirme.setText("Lütfen güncellenecek yöneticiyi tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Update yonetici set yonetici_ad = ?, yonetici_soyad = ?,yonetici_eposta = ?,yonetici_cepNo = ?,yonetici_dogumT = ?,yonetici_cinsiyet = ?,yonetici_sifre = ? where id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 
                 statement.setString(1, ad);
                 statement.setString(2, soyad);
                 statement.setString(3, ePosta);
                 statement.setString(4, cepNo);
                 statement.setString(5, dogumT);
                 statement.setString(6, getCinsiyet());
                 statement.setString(7, String.valueOf(sifre.hashCode()));
                 
                 statement.setInt(8, id);

                 statement.executeUpdate();
             } catch (SQLException ex) {
                 
             }
             
             
             txtBilgilendirme.setText("Yönetici Güncellendi.");
         } catch (SQLException ex) {
            
         }
        
       
    }
}
}
