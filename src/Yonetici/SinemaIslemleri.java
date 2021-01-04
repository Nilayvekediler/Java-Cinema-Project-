
package Yonetici;

import Ortak.DbHelper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SinemaIslemleri extends javax.swing.JFrame implements IYonetici{

    DefaultTableModel model;
    
    public SinemaIslemleri() {
        initComponents();
        tabloSehirGoster();
        tabloSinemaGoster();
        tabloBaglantiGoster();
        this.getContentPane().setBackground(Color.white);
    }
    public YoneticiEkrani yoneticiEkran;
    
    public final void tabloSehirGoster(){
         model = (DefaultTableModel)tblSehir.getModel();
         model.setRowCount(0);
     try{
            ArrayList <Sinemalar> sehirler = getSehirler();
            for (Sinemalar sehir : sehirler){
                Object [] row={sehir.getCity_id(),sehir.getCity_name()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
     }
    public final void tabloSinemaGoster(){
         model = (DefaultTableModel)tblSinema.getModel();
         model.setRowCount(0);
     try{
            ArrayList <Sinemalar> sinemalar = getSinemalar();
            for (Sinemalar sinema : sinemalar){
                Object [] row={sinema.getCinema_id(),sinema.getCinema_name(),sinema.getCinema_adress()};
                model.addRow(row);
                
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
          
        }
     }
    
    public final void tabloBaglantiGoster(){
         model = (DefaultTableModel)tblBaglantı.getModel();
         model.setRowCount(0);
     try{
            ArrayList <Sinemalar> baglantilar = getBaglantilar();
            for (Sinemalar baglanti : baglantilar){
                Object [] row={baglanti.getId(),baglanti.getŞehir_id(),baglanti.getSinema_id()};
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
        jLabel1 = new javax.swing.JLabel();
        cboxSehir = new javax.swing.JComboBox<>();
        btnSehirEkle = new javax.swing.JButton();
        btnSehirSil = new javax.swing.JButton();
        btnSehirGuncelle = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSehir = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSinemaAdi = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSinemaAdresi = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSinema = new javax.swing.JTable();
        btnSinemaEkle = new javax.swing.JButton();
        btnSinemaSil = new javax.swing.JButton();
        btnSinemaGüncelle = new javax.swing.JButton();
        txtSehirBilgi = new javax.swing.JLabel();
        txtSinemaBilgi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBaglantı = new javax.swing.JTable();
        txtBaglantı = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinSehir_id = new javax.swing.JSpinner();
        spinSinema_id = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinema İşlemleri");
        setPreferredSize(new java.awt.Dimension(980, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setText("Yönetici Ekranına Geri Dön");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Şehir :");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 90, -1));

        cboxSehir.setForeground(new java.awt.Color(0, 51, 102));
        cboxSehir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adana", "Adıyaman\t", "Afyonkarahisar", "Ağrı\t", "Aksaray", "Amasya", "Ankara\t", "Antalya\t", "Ardahan\t", "Artvin\t", "Aydın\t", "Balıkesir\t", "Bartın\t", "Batman\t", "Bayburt\t", "Bilecik", "Bingöl", "Bitlis", "Bolu\t", "Burdur", "Bursa\t", "Çanakkale\t", "Çankırı\t", "Çorum\t", "Denizli", "Diyarbakır\t", "Düzce\t", "Edirne\t", "Elâzığ\t", "Erzincan\t", "Erzurum\t", "Eskişehir\t", "Gaziantep\t", "Giresun\t", "Gümüşhane\t", "Hakkâri\t", "Hatay\t", "Iğdır\t", "Isparta\t", "İstanbul\t", "İzmir\t", "Kahramanmaraş\t", "Karabük\t", "Karaman\t", "Kars\t", "Kastamonu\t", "Kayseri\t", "Kırıkkale\t", "Kırklareli\t", "Kırşehir\t", "Kilis\t", "Kocaeli\t", "Konya\t", "Kütahya\t", "Malatya\t", "Manisa\t", "Mardin", "Mersin\t", "Muğla\t", "Muş\t", "Nevşehir\t", "Niğde\t", "Ordu\t", "Osmaniye\t", "Rize\t", "Sakarya", "Samsun\t", "Siirt\t", "Sinop\t", "Sivas\t", "Şanlıurfa\t", "Şırnak\t", "Tekirdağ\t", "Tokat\t", "Trabzon\t", "Tunceli\t", "Uşak\t", "Van\t", "Yalova\t", "Yozgat\t", "Zonguldak", " " }));
        cboxSehir.setToolTipText("");
        getContentPane().add(cboxSehir, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 108, 85, -1));

        btnSehirEkle.setForeground(new java.awt.Color(0, 51, 102));
        btnSehirEkle.setText("Şehir Ekle");
        btnSehirEkle.setToolTipText("");
        btnSehirEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSehirEkleActionPerformed(evt);
            }
        });
        getContentPane().add(btnSehirEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 67, 99, -1));

        btnSehirSil.setForeground(new java.awt.Color(0, 51, 102));
        btnSehirSil.setText("Şehir Sil");
        btnSehirSil.setToolTipText("");
        btnSehirSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSehirSilActionPerformed(evt);
            }
        });
        getContentPane().add(btnSehirSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 106, 99, -1));

        btnSehirGuncelle.setForeground(new java.awt.Color(0, 51, 102));
        btnSehirGuncelle.setText("Şehir Güncelle");
        btnSehirGuncelle.setToolTipText("");
        btnSehirGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSehirGuncelleActionPerformed(evt);
            }
        });
        getContentPane().add(btnSehirGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 151, -1, -1));

        tblSehir.setForeground(new java.awt.Color(0, 51, 102));
        tblSehir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Şehir id", "Şehirler"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSehir);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 338, 182));

        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Sinema Adı :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 71, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Sinema Adresi :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 140, -1, -1));
        getContentPane().add(txtSinemaAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 68, 166, -1));

        txtSinemaAdresi.setColumns(20);
        txtSinemaAdresi.setRows(5);
        jScrollPane4.setViewportView(txtSinemaAdresi);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 140, 165, 57));

        tblSinema.setForeground(new java.awt.Color(0, 51, 102));
        tblSinema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sinema id", "Sinema Adı", "Sinema Adresi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblSinema);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 260, 370, 182));

        btnSinemaEkle.setForeground(new java.awt.Color(0, 51, 102));
        btnSinemaEkle.setText("Sinema Ekle");
        btnSinemaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinemaEkleActionPerformed(evt);
            }
        });
        getContentPane().add(btnSinemaEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 109, -1));

        btnSinemaSil.setForeground(new java.awt.Color(0, 51, 102));
        btnSinemaSil.setText("Sinema Sil");
        btnSinemaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinemaSilActionPerformed(evt);
            }
        });
        getContentPane().add(btnSinemaSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 109, -1));

        btnSinemaGüncelle.setForeground(new java.awt.Color(0, 51, 102));
        btnSinemaGüncelle.setText("Sinema Güncelle");
        btnSinemaGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinemaGüncelleActionPerformed(evt);
            }
        });
        getContentPane().add(btnSinemaGüncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));
        getContentPane().add(txtSehirBilgi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 493, 338, 18));
        getContentPane().add(txtSinemaBilgi, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 493, 358, 18));

        tblBaglantı.setForeground(new java.awt.Color(0, 51, 102));
        tblBaglantı.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Şehir id", "Sinema id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBaglantı);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 187, 228));
        getContentPane().add(txtBaglantı, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 493, 133, 18));

        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Şehir id :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Sinema id :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, -1, -1));
        getContentPane().add(spinSehir_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 82, -1));
        getContentPane().add(spinSinema_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 82, -1));

        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Güncelle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        YoneticiEkrani pencere = new YoneticiEkrani();
        pencere.setVisible(true);
        this.setVisible(false);
        pencere.sinemaIslem=this;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSehirEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSehirEkleActionPerformed
       txtSehirBilgi.setText("");
       add();
       tabloSehirGoster();
    }//GEN-LAST:event_btnSehirEkleActionPerformed

    private void btnSehirSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSehirSilActionPerformed
        txtSehirBilgi.setText("");
        delete();
        tabloSehirGoster();
    }//GEN-LAST:event_btnSehirSilActionPerformed

    private void btnSehirGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSehirGuncelleActionPerformed
        txtSehirBilgi.setText("");
        update();
        tabloSehirGoster();
    }//GEN-LAST:event_btnSehirGuncelleActionPerformed

    private void btnSinemaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinemaEkleActionPerformed
       txtSinemaBilgi.setText("");
       add2();
       tabloSinemaGoster();
    }//GEN-LAST:event_btnSinemaEkleActionPerformed

    private void btnSinemaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinemaSilActionPerformed
        txtSinemaBilgi.setText("");
        delete2();
        tabloSinemaGoster();
    }//GEN-LAST:event_btnSinemaSilActionPerformed

    private void btnSinemaGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinemaGüncelleActionPerformed
        txtSinemaBilgi.setText("");
        update2();
        tabloSinemaGoster();
    }//GEN-LAST:event_btnSinemaGüncelleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       txtBaglantı.setText("");
       add3();
       tabloBaglantiGoster();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtBaglantı.setText("");
        delete3();
        tabloBaglantiGoster();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtBaglantı.setText("");
        update3();
        tabloBaglantiGoster();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SinemaIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinemaIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinemaIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinemaIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinemaIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSehirEkle;
    private javax.swing.JButton btnSehirGuncelle;
    private javax.swing.JButton btnSehirSil;
    private javax.swing.JButton btnSinemaEkle;
    private javax.swing.JButton btnSinemaGüncelle;
    private javax.swing.JButton btnSinemaSil;
    private javax.swing.JComboBox<String> cboxSehir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner spinSehir_id;
    private javax.swing.JSpinner spinSinema_id;
    private javax.swing.JTable tblBaglantı;
    private javax.swing.JTable tblSehir;
    private javax.swing.JTable tblSinema;
    private javax.swing.JLabel txtBaglantı;
    private javax.swing.JLabel txtSehirBilgi;
    private javax.swing.JTextField txtSinemaAdi;
    private javax.swing.JTextArea txtSinemaAdresi;
    private javax.swing.JLabel txtSinemaBilgi;
    // End of variables declaration//GEN-END:variables
private ArrayList<Sinemalar> getSehirler() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Sinemalar> sehirler = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from cities"); //ORDER BY city_name
            sehirler = new ArrayList<Sinemalar>();
            while(resultSet.next()){
                sehirler.add(new Sinemalar(resultSet.getInt("city_id"),resultSet.getString("city_name")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return sehirler;
    }

private ArrayList<Sinemalar> getSinemalar() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Sinemalar> sinemalar = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from cinemas");
            sinemalar = new ArrayList<Sinemalar>();
            while(resultSet.next()){
                sinemalar.add(new Sinemalar(resultSet.getInt("cinema_id"),resultSet.getString("cinema_name"),resultSet.getString("cinema_adress")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return sinemalar;
    }

private ArrayList<Sinemalar> getBaglantilar() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Sinemalar> baglantilar = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from city_cinemas");
            baglantilar = new ArrayList<Sinemalar>();
            while(resultSet.next()){
                baglantilar.add(new Sinemalar(resultSet.getInt("id"),resultSet.getInt("şehir_id"),resultSet.getInt("sinema_id")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return baglantilar;
    }
    

    @Override
    public void add() {
     
    Connection connection =null;
     DbHelper dbHelper = new DbHelper();
     
     PreparedStatement statement =null;
     try{
       
        String ad =cboxSehir.getSelectedItem().toString();
       
        
         connection = dbHelper.getConnection();
         String sql = "insert into cities (city_name) values(?)";
        try {
            statement = connection.prepareStatement(sql);
        } catch (SQLException ex) {
            dbHelper.showErrorMessage(ex);
        }
    
         statement.setString(1,ad);
         
         int result = statement.executeUpdate();
         txtSehirBilgi.setText("Şehir Eklendi.");
        }catch(SQLException exception){
         dbHelper.showErrorMessage(exception);   
     }finally{
         try {
             statement.close();
             connection.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
     }
    }
    
    public void add2() {
     Connection connection =null;
     DbHelper dbHelper = new DbHelper();
     
     PreparedStatement statement =null;
     try{
       
        String ad =txtSinemaAdi.getText();
        String adres =txtSinemaAdresi.getText();
        
         connection = dbHelper.getConnection();
         String sql = "insert into cinemas (cinema_name,cinema_adress) values(?,?)";
        try {
            statement = connection.prepareStatement(sql);
        } catch (SQLException ex) {
            dbHelper.showErrorMessage(ex);
        }
    
         statement.setString(1,ad);
         statement.setString(2,adres);
         
         int result = statement.executeUpdate();
         txtSinemaBilgi.setText("Sinema Eklendi.");
        }catch(SQLException exception){
         dbHelper.showErrorMessage(exception);   
     }finally{
         try {
             statement.close();
             connection.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
     }
    }
    
    public void add3() {
     Connection connection =null;
     DbHelper dbHelper = new DbHelper();
     
     PreparedStatement statement =null;
     try{
       
        int sehir_id =Integer.parseInt(spinSehir_id.getValue().toString());
        int sinema_id =Integer.parseInt(spinSinema_id.getValue().toString());
        
         connection = dbHelper.getConnection();
         String sql = "insert into city_cinemas (şehir_id,sinema_id) values(?,?)";
        try {
            statement = connection.prepareStatement(sql);
        } catch (SQLException ex) {
            dbHelper.showErrorMessage(ex);
        }
    
         statement.setInt(1,sehir_id);
         statement.setInt(2,sinema_id);
         
         int result = statement.executeUpdate();
         txtBaglantı.setText("Yeni bağlantı eklendi.");
        }catch(SQLException exception){
         dbHelper.showErrorMessage(exception);   
     }finally{
         try {
             statement.close();
             connection.close();
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
     }
    }

 
    @Override
    public void delete() {
        int selectedRow =tblSehir.getSelectedRow();
     if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtSehirBilgi.setText("Şehirler tablosu boşken silme işlemi yapılamaz.");
         } else{
             txtSehirBilgi.setText("Lütfen silinecek şehirler tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Delete from cities where city_id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 statement.setInt(1, id);
                 statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtSehirBilgi.setText("Şehir Silindi.");
         } catch (SQLException ex) {
              System.out.println(ex.getMessage());
         }
     }
      
    }
    
    public void delete2() {
        int selectedRow =tblSinema.getSelectedRow();
     if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtSinemaBilgi.setText("Sinemalar tablosu boşken silme işlemi yapılamaz.");
         } else{
             txtSinemaBilgi.setText("Lütfen silinecek sinemayı tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Delete from cinemas where cinema_id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 statement.setInt(1, id);
                 statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtSinemaBilgi.setText("Sinema Silindi.");
         } catch (SQLException ex) {
              System.out.println(ex.getMessage());
         }
     } 
    }
    
    public void delete3() {
        int selectedRow =tblBaglantı.getSelectedRow();
     if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtBaglantı.setText("Bağlantılar tablosu boşken silme işlemi yapılamaz.");
         } else{
             txtBaglantı.setText("Lütfen silinecek bağlantıyı tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Delete from city_cinemas where id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 statement.setInt(1, id);
                 statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtBaglantı.setText("Bağlantı koparıldı.");
         } catch (SQLException ex) {
              System.out.println(ex.getMessage());
         }
     }
        
    }
    
    @Override
    public void update() {
  
        String ad =cboxSehir.getSelectedItem().toString();
        
        
        int selectedRow = tblSehir.getSelectedRow();
        
         if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtSehirBilgi.setText("Şehirler tablosu boşken güncelleme işlemi yapılamaz.");
         } else{
             txtSehirBilgi.setText("Lütfen güncellenecek şehri tabloda seçiniz.");
         }
     }else{
         try {
             int guncellencek_id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Update cities set city_name = ? where city_id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 
   
                 statement.setString(1, ad);
                
                 
                 statement.setInt(2, guncellencek_id);
                
                 statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtSehirBilgi.setText("Şehir Güncellendi.");
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
        
       
    }
        
       
    }
    
    public void update2() {
        String ad =txtSinemaAdi.getText();
        String adres =txtSinemaAdresi.getText();
        
        
        int selectedRow = tblSinema.getSelectedRow();
        
         if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtSinemaBilgi.setText("Sinemalar tablosu boşken güncelleme işlemi yapılamaz.");
         } else{
             txtSinemaBilgi.setText("Lütfen güncellenecek sinemayı tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Update cinemas set cinema_name = ?,cinema_adress = ? where cinema_id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 
   
                statement.setString(1, ad);
                statement.setString(2, adres);
                 
                statement.setInt(3, id);
                
                statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtSinemaBilgi.setText("Sinema Güncellendi.");
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
    }   
    }  
    
    public void update3() {
        int sehir_id =Integer.parseInt(spinSehir_id.getValue().toString());
        int sinema_id =Integer.parseInt(spinSinema_id.getValue().toString());
        
        
        int selectedRow = tblBaglantı.getSelectedRow();
        
         if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtBaglantı.setText("Bağlantılar tablosu boşken güncelleme işlemi yapılamaz.");
         } else{
             txtBaglantı.setText("Lütfen güncellenecek bağlantıyı tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Update city_cinemas set şehir_id = ?,sinema_id = ? where id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 
   
                statement.setInt(1, sehir_id);
                statement.setInt(2, sinema_id);
                 
                statement.setInt(3, id);
                
                statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtBaglantı.setText("Bağlantı Güncellendi.");
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
    }   
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
