
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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Filmİslemleri extends javax.swing.JFrame implements IYonetici{

    DefaultTableModel model;
    
    public Filmİslemleri() {
        initComponents();
        tabloGöster();
        this.getContentPane().setBackground(Color.white);
    }
    public YoneticiEkrani filmIslemi;
    
    public final void tabloGöster(){
         model = (DefaultTableModel)tblFilm.getModel();
         model.setRowCount(0);
     try{
            ArrayList <Filmler> filmler = getFilmler();
            for (Filmler film : filmler){
                Object [] row={film.getFilm_id(),film.getFilm_name(),film.getFilm_category(),film.getFilm_description(),film.getRelease_date(),film.getLength(),film.getLanguage_type(),film.getRating()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        cboxKategori = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAçıklama = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtSüre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tur = new javax.swing.JCheckBox();
        dublaj = new javax.swing.JCheckBox();
        orijinal = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtPuan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFilm = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtFilmAra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtBilgilendirme = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Film İşlemleri");
        setPreferredSize(new java.awt.Dimension(900, 630));
        setResizable(false);

        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Film Adı :");

        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Kategori :");

        txtAd.setForeground(new java.awt.Color(0, 51, 102));

        cboxKategori.setForeground(new java.awt.Color(0, 51, 102));
        cboxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilimkurgu", "Gerilim", "Komedi", "Belgesel", "Aksiyon", "Korku", "Romantik", "Macera", "Suç", "Savaş" }));

        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Açıklama :");

        jScrollPane1.setForeground(new java.awt.Color(0, 51, 102));

        txtAçıklama.setColumns(20);
        txtAçıklama.setRows(5);
        jScrollPane1.setViewportView(txtAçıklama);

        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Vizyon Tarihi : ");

        dateChooser.setForeground(new java.awt.Color(0, 51, 102));

        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Süre :");

        txtSüre.setForeground(new java.awt.Color(0, 51, 102));

        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Dil Seçeneği :");

        buttonGroup1.add(tur);
        tur.setForeground(new java.awt.Color(0, 51, 102));
        tur.setText("Türkçe Altyazı");

        buttonGroup1.add(dublaj);
        dublaj.setForeground(new java.awt.Color(0, 51, 102));
        dublaj.setText("Dublaj");

        buttonGroup1.add(orijinal);
        orijinal.setForeground(new java.awt.Color(0, 51, 102));
        orijinal.setText("Orijinal");

        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("IMDb puanı :");

        txtPuan.setForeground(new java.awt.Color(0, 51, 102));

        jScrollPane2.setForeground(new java.awt.Color(0, 51, 102));

        tblFilm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ad", "Tür", "Açıklama", "Vizyon Tarihi", "Süre", "Dil Seçeneği", "IMDb Puanı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFilm);

        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Film Ara :");

        txtFilmAra.setForeground(new java.awt.Color(0, 51, 102));
        txtFilmAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilmAraKeyReleased(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Film Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Film Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("Film Güncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtBilgilendirme.setForeground(new java.awt.Color(0, 51, 102));

        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setText("Yönetici Ekranına Geri Dön");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAd)
                                    .addComponent(cboxKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtSüre, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtPuan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(54, 54, 54)
                                            .addComponent(dublaj, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(orijinal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtBilgilendirme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(96, 96, 96))
                            .addComponent(txtFilmAra, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSüre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tur)
                        .addComponent(dublaj)
                        .addComponent(orijinal))
                    .addComponent(jLabel2)
                    .addComponent(cboxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBilgilendirme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFilmAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilmAraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilmAraKeyReleased
        search();
    }//GEN-LAST:event_txtFilmAraKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtBilgilendirme.setText("");
        add();
        tabloGöster();  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtBilgilendirme.setText("");
        delete();
        tabloGöster();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtBilgilendirme.setText("");
        update();
        tabloGöster();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       YoneticiEkrani pencere = new YoneticiEkrani();
       pencere.setVisible(true);
       this.setVisible(false);
       pencere.filmIslem=this;
    }//GEN-LAST:event_jButton4ActionPerformed
public String getDilS(){
        if(tur.isSelected()){
            return "Türkçe Altyazı";
        }
        else if(dublaj.isSelected()){
            return "Dublaj";
        }
        else{
             return "Orijinal";
        }}
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
            java.util.logging.Logger.getLogger(Filmİslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filmİslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filmİslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filmİslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filmİslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboxKategori;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JCheckBox dublaj;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox orijinal;
    private javax.swing.JTable tblFilm;
    private javax.swing.JCheckBox tur;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextArea txtAçıklama;
    private javax.swing.JLabel txtBilgilendirme;
    private javax.swing.JTextField txtFilmAra;
    private javax.swing.JTextField txtPuan;
    private javax.swing.JTextField txtSüre;
    // End of variables declaration//GEN-END:variables
private ArrayList<Filmler> getFilmler() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Filmler> filmler = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from film");
            filmler = new ArrayList<Filmler>();
            while(resultSet.next()){
                filmler.add(new Filmler(resultSet.getInt("film_id"),resultSet.getString("film_name"),resultSet.getString("film_category"),resultSet.getString("description"),resultSet.getString("release_date"),resultSet.getString("length"),resultSet.getString("language_type"),resultSet.getString("rating")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return filmler;
    }

    @Override
    public void search() {
        String searchKey = txtFilmAra.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblFilm.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }

    @Override
    public void add() {
     Connection connection =null;
     DbHelper dbHelper = new DbHelper();
     
     PreparedStatement statement =null;
     try{
         
        String ad = txtAd.getText();
        String kategori =cboxKategori.getSelectedItem().toString();
        String açıklama = txtAçıklama.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String vizyonT = sdf.format(dateChooser.getDate());
        String süre =txtSüre.getText();
        String dilS = getDilS();
        String puan =txtPuan.getText();
        
         connection = dbHelper.getConnection();
         String sql = "insert into film (film_name,film_category,description,release_date,length,language_type,rating) values(?,?,?,?,?,?,?)";
         statement = connection.prepareStatement(sql);
         
         statement.setString(1,ad);
         statement.setString(2,kategori);
         statement.setString(3,açıklama);
         statement.setString(4,vizyonT);
         statement.setString(5,süre);
         statement.setString(6,dilS);
         statement.setString(7,puan);
         int result = statement.executeUpdate();
         txtBilgilendirme.setText("Film Eklendi.");
     
         
         
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
      int selectedRow =tblFilm.getSelectedRow();
     if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtBilgilendirme.setText("Filmler tablosu boşken silme işlemi yapılamaz.");
         } else{
             txtBilgilendirme.setText("Lütfen silinecek filmi tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Delete from film where film_id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 statement.setInt(1, id);
                 statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtBilgilendirme.setText("Film Silindi.");
         } catch (SQLException ex) {
              System.out.println(ex.getMessage());
         }
     }
    }

    @Override
    public void update() {
        String ad = txtAd.getText();
        String kategori =cboxKategori.getSelectedItem().toString();
        String açıklama = txtAçıklama.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String vizyonT =sdf.format(dateChooser.getDate());
        String süre =txtSüre.getText();
        String dilS = getDilS();
        String puan =txtPuan.getText();
        
        
        int selectedRow = tblFilm.getSelectedRow();
        
         if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtBilgilendirme.setText("Filmler tablosu boşken güncelleme işlemi yapılamaz.");
         } else{
             txtBilgilendirme.setText("Lütfen güncellenecek filmi tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Update film set film_name = ?, film_category = ?, description = ?, release_date=?,length=?,language_type=?,rating=? where film_id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 
                 statement.setString(1, ad);
                 statement.setString(2, kategori);
                 statement.setString(3, açıklama);
                 statement.setString(4, vizyonT);
                 statement.setString(5, süre);
                 statement.setString(6, dilS);
                 statement.setString(7, puan);
                 statement.setInt(8, id);
                 statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtBilgilendirme.setText("Film Güncellendi.");
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         } 
       }
      }
    }

  

