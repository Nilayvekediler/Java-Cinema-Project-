
package Yonetici;
import Ortak.DbHelper;
import Uye.Rezervasyon;
import Uye.Sinemalar;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class RezervasyonIslemleri extends javax.swing.JFrame implements IYonetici{
    DefaultTableModel model;
    YoneticiEkrani rezervasyonIslemleri;
    
    public RezervasyonIslemleri() {
        initComponents();
        tabloGoster();
        this.getContentPane().setBackground(Color.white);
    }
    
    public final void tabloGoster(){
         model = (DefaultTableModel)tblRez.getModel();
         model.setRowCount(0);
     try{
            ArrayList <Rezervasyon> rezler = getRezervasyon();
            for (Rezervasyon rez : rezler){
                Object [] row={rez.getRez_id(),rez.getFilm_name(),rez.getCity(),rez.getCinema(),rez.getSeans(),rez.getSalon_id(),rez.getSeat(),rez.getPrice(),rez.getUye_id()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRezAra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFilmAdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboxSehir4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboxSinema2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRez = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtSeans = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboxKoltuk = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtFiyat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUyeId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtBilgi = new javax.swing.JLabel();
        spinSalonId = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rezervasyon İşlemleri");
        setPreferredSize(new java.awt.Dimension(960, 650));

        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Rezervasyonlarda Ara : ");

        txtRezAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRezAraKeyReleased(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Film  Adı :");

        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Şehir       :");

        cboxSehir4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Düzce", "Edirne", "Elâzığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkâri", "Hatay", "Iğdır", "Isparta", "İstanbul", "İzmir", "Kahramanmaraş", "Karabük", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kırıkkale", "Kırklareli", "Kırşehir", "Kilis", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Şanlıurfa", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak" }));
        cboxSehir4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxSehir4İtemStateChanged(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Sinema    :");

        cboxSinema2.setToolTipText("");
        cboxSinema2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxSinema2MouseClicked(evt);
            }
        });

        tblRez.setForeground(new java.awt.Color(0, 51, 102));
        tblRez.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rez id", "Film Adı", "Şehir ", "Sinema", "Seans", "Salon id", "Koltuk", "Ücret", "Üye id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRez);

        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Seans      :");

        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Salon id             :");

        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Koltuk                 :");

        cboxKoltuk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a1", "a2", "a3", "a4", "b1", "b2", "b3", "b4", "c1", "c2", "c3", "c4", " " }));

        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Fiyat                  :");

        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Uye id                :");

        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Rezervasyon Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Rezervasyon Güncelle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtBilgi.setForeground(new java.awt.Color(0, 51, 102));

        jButton4.setForeground(new java.awt.Color(0, 51, 102));
        jButton4.setText("Yönetici Ekranına Geri Dön");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 51, 102));
        jButton3.setText("Seans Tablosu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 51, 102));
        jButton5.setText("Salon Tablosu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setForeground(new java.awt.Color(0, 51, 102));
        jButton6.setText("Sinema-Salon-Seans Bağlantı Tablosu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRezAra))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFilmAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSeans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxSinema2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxSehir4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxKoltuk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFiyat)
                            .addComponent(txtUyeId)
                            .addComponent(spinSalonId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4)
                    .addComponent(jScrollPane1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFilmAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButton1)
                            .addComponent(spinSalonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboxSehir4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cboxKoltuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboxSinema2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton2)))
                .addGap(2, 2, 2)
                .addComponent(txtBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtSeans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtUyeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRezAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboxSinema2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxSinema2MouseClicked
        try {
            txtBilgi.setText("");
            String searchKey = cboxSehir4.getSelectedItem().toString();

            Connection connection;
            DbHelper dbHelper = new DbHelper();
            connection = dbHelper.getConnection();
            PreparedStatement statement =null;
            String sql ="select * from cities where city_name = '"+searchKey+"'";
            statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            int id = 0;
            if(rs.next()){
                id= rs.getInt("city_id");
            }else{
                txtBilgi.setText("Maalesef o şehirde sinemamız bulunmamakta!");
            }

            ArrayList <Sinemalar> sinemalar;

            sinemalar = getSinemalar(id);
            for (Sinemalar sinema : sinemalar){
                cboxSinema2.addItem(sinema.getCinema_name());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_cboxSinema2MouseClicked

    private void cboxSehir4İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxSehir4İtemStateChanged
        cboxSinema2.removeAllItems();
    }//GEN-LAST:event_cboxSehir4İtemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtBilgi.setText("");
        delete();
        tabloGoster();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtBilgi.setText("");
        update();
        tabloGoster();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtRezAraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRezAraKeyReleased
       search();
    }//GEN-LAST:event_txtRezAraKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        YoneticiEkrani pencere = new YoneticiEkrani();
        pencere.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Seanslar pencere = new Seanslar();
        pencere.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Salonlar pencere = new Salonlar();
        pencere.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SinemaSalonSeansBağlantı pencere = new SinemaSalonSeansBağlantı();
        pencere.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(RezervasyonIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RezervasyonIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RezervasyonIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RezervasyonIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RezervasyonIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxKoltuk;
    private javax.swing.JComboBox<String> cboxSehir4;
    private javax.swing.JComboBox<String> cboxSinema2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinSalonId;
    private javax.swing.JTable tblRez;
    private javax.swing.JLabel txtBilgi;
    private javax.swing.JTextField txtFilmAdi;
    private javax.swing.JTextField txtFiyat;
    private javax.swing.JTextField txtRezAra;
    private javax.swing.JTextField txtSeans;
    private javax.swing.JTextField txtUyeId;
    // End of variables declaration//GEN-END:variables
private ArrayList<Rezervasyon> getRezervasyon() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Rezervasyon> rezervasyonlar = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from reservation");
            rezervasyonlar = new ArrayList<Rezervasyon>();
            while(resultSet.next()){
                rezervasyonlar.add(new Rezervasyon(resultSet.getInt("rez_id"),resultSet.getString("film_name"),resultSet.getString("city"),resultSet.getString("cinema"),resultSet.getString("seans"),resultSet.getInt("salon_id"),resultSet.getString("seat"),resultSet.getInt("price"),resultSet.getString("uye_id")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return rezervasyonlar;
    }
    private ArrayList<Uye.Sinemalar> getSinemalar(int id) {
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Uye.Sinemalar> sinemalar = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from cinemas where cinema_id in (select sinema_id from city_cinemas where şehir_id="+id+")");
            sinemalar = new ArrayList<Uye.Sinemalar>();
            while(resultSet.next()){
                sinemalar.add(new Uye.Sinemalar(resultSet.getString("cinema_name")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(RezervasyonIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return sinemalar;
    }

    @Override
    public void search() {
        String searchKey = txtRezAra.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        tblRez.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
       int selectedRow =tblRez.getSelectedRow();
     if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtBilgi.setText("Rezervasyon tablosu boşken silme işlemi yapılamaz.");
         } else{
             txtBilgi.setText("Lütfen silinecek rezervasyonu tabloda seçiniz.");
         }
     }else{
         try {
             int id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Delete from reservation where rez_id = ?";
             try {
                 statement = connection.prepareStatement(sql);
                 statement.setInt(1, id);
                 statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtBilgi.setText("Rezervasyon Silindi.");
         } catch (SQLException ex) {
              System.out.println(ex.getMessage());
         }
     }
     
    }

    @Override
    public void update() {
        String film_adi =txtFilmAdi.getText();
        String sehir = cboxSehir4.getSelectedItem().toString();
        String sinema =cboxSinema2.getSelectedItem().toString();
        String seans = txtSeans.getText();
        int salon_id =(Integer)spinSalonId.getValue();
        String koltuk = cboxKoltuk.getSelectedItem().toString();
        int fiyat = Integer.parseInt(txtFiyat.getText());
        String uye_id = txtUyeId.getText();
        
        
        int selectedRow = tblRez.getSelectedRow();
        
         if(selectedRow == -1){
         if(model.getRowCount()==0){
             txtBilgi.setText("Rezervasyonlar tablosu boşken güncelleme işlemi yapılamaz.");
         } else{
             txtBilgi.setText("Lütfen güncellenecek rezervasyonu tabloda seçiniz.");
         }
     }else{
         try {
             int guncellencek_id = (int)model.getValueAt(selectedRow,0);
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             
             PreparedStatement statement =null;
             String sql ="Update reservation set film_name = ?, city = ?, cinema = ?, seans = ?, salon_id = ?, seat =?, price =?, uye_id=? where rez_id = ?";
             try {
                 statement = connection.prepareStatement(sql);

                 statement.setString(1,film_adi);
                 statement.setString(2, sehir);
                 statement.setString(3, sinema);
                 statement.setString(4, seans);
                 statement.setInt(5, salon_id);
                 statement.setString(6,koltuk);
                 statement.setInt(7,fiyat); 
                 statement.setString(8,uye_id);
                 
                 statement.setInt(9,guncellencek_id); 
                 
                
                 statement.executeUpdate();
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             txtBilgi.setText("Rezervasyon Güncellendi.");
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
        
       
    }
    }
}
