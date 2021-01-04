package Uye;


import Ortak.BaglantiSaglandi;
import Ortak.DbHelper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Anasayfa extends javax.swing.JFrame {
    DefaultTableModel model;
    String gelenEposta;
    public static String projeSahibi = "Nilay İnel"; //STATİC DEĞİŞKEN TANIMLAMA
 
    
    public Anasayfa() {
        
            initComponents();
            tabloSinemaGoster();
            tabloFilmGöster();
         
    }
    
    public Anasayfa(String gelenEposta) {
        
            initComponents();
            tabloSinemaGoster();
            tabloFilmGöster();
            this.gelenEposta=gelenEposta;
            this.getContentPane().setBackground(Color.WHITE);
 
    }
    
    
  
    public UyeGiris anasayfa;
    
     public final void tabloSinemaGoster(){
         model = (DefaultTableModel)tblcinema.getModel();
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
     
     public final void tabloFilmGöster(){
         model = (DefaultTableModel)tblFilmler.getModel();
         model.setRowCount(0);
     try{
            ArrayList <Filmler> filmler = getFilmler();
            for (Filmler film : filmler){
                Object [] row={film.getFilm_name(),film.getFilm_category(),film.getDescription(),film.getRelease_date(),film.getLength(),film.getLanguage_type(),film.getRating()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
     }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcinema = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtBilgi = new javax.swing.JLabel();
        cboxSehir = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFilmler = new javax.swing.JTable();
        lblGelenEPosta = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anasayfa");
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sinemalar  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Şehir Arama :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 29, 81, 13);

        tblcinema.setForeground(new java.awt.Color(0, 0, 102));
        tblcinema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sinema_id", "Sinema_Adı", "Adres"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblcinema);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(16, 64, 722, 189);

        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Ara");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(302, 25, 49, 21);

        txtBilgi.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtBilgi);
        txtBilgi.setBounds(402, 25, 336, 20);

        cboxSehir.setForeground(new java.awt.Color(0, 0, 102));
        cboxSehir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Düzce", "Edirne", "Elâzığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkâri", "Hatay", "Iğdır", "Isparta", "İstanbul", "İzmir", "Kahramanmaraş", "Karabük", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kırıkkale", "Kırklareli", "Kırşehir", "Kilis", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Şanlıurfa", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak" }));
        jPanel1.add(cboxSehir);
        cboxSehir.setBounds(115, 26, 158, 19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 753;
        gridBagConstraints.ipady = 285;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 76);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vizyondaki Filmler  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Ayrıntılı incele");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(16, 237, 120, 21);

        tblFilmler.setForeground(new java.awt.Color(0, 0, 102));
        tblFilmler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ad", "Tür", "Açıklama", "VizyonTarihi", "Süre", "Dil Seçeneği", "IMDb"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblFilmler);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(16, 25, 722, 202);
        jPanel3.add(lblGelenEPosta);
        lblGelenEPosta.setBounds(696, 265, 31, 0);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 753;
        gridBagConstraints.ipady = 270;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 70, 29, 76);
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            txtBilgi.setText("");
            String searchKey = cboxSehir.getSelectedItem().toString().toLowerCase();
             Connection connection;
             DbHelper dbHelper = new DbHelper();
             connection = dbHelper.getConnection();
             //---------------------------
             BaglantiSaglandi[] onaylar = new BaglantiSaglandi[]{new DbHelper()}; //POLİMORFİZM
             for (BaglantiSaglandi onay : onaylar){
                 onay.onayMesajı();
             }
             BaglantiSaglandi nesne = new BaglantiSaglandi() {};
             nesne.isimYazdir(projeSahibi); //STATİC METODA STATİC TANIMLANMIŞ DEĞİŞKEN GÖNDERİMİ STATİC KULLANIMI
             
             //----------------------------
             PreparedStatement statement =null;
             String sql ="select * from cities where LOWER(city_name)like \"%\" '"+searchKey+"'\"%\"";
             statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery();
             int id = 0;
             if(rs.next()){
                id= rs.getInt("city_id"); 
             }else{
                 txtBilgi.setText("Maalesef o şehirde sinemamız bulunmamakta!");
             }
             
              model = (DefaultTableModel)tblcinema.getModel();
            model.setRowCount(0);
            
            ArrayList <Sinemalar> sinemalar;
           
                sinemalar = getSinemalar(id);
                for (Sinemalar sinema : sinemalar){
                Object [] row={sinema.getCinema_id(),sinema.getCinema_name(),sinema.getCinema_adress()};
                model.addRow(row);
            
        }} catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     FilmlerListeli pencere = new FilmlerListeli(gelenEposta);
     pencere.setVisible(true);
     dispose();
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
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboxSehir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblGelenEPosta;
    private javax.swing.JTable tblFilmler;
    private javax.swing.JTable tblcinema;
    private javax.swing.JLabel txtBilgi;
    // End of variables declaration//GEN-END:variables
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
    
    
    public ArrayList<Sinemalar> getSinemalar(int id) throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Sinemalar> sinemalar = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from cinemas where cinema_id in (select sinema_id from city_cinemas where şehir_id="+id+")");
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
    
    private ArrayList<Filmler> getFilmler() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Filmler> filmler = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select film_name,film_category,description,release_date,length,language_type,rating from film");
            filmler = new ArrayList<Filmler>();
            while(resultSet.next()){
                filmler.add(new Filmler(resultSet.getString("film_name"),resultSet.getString("film_category"),resultSet.getString("description"),resultSet.getString("release_date"),resultSet.getString("length"),resultSet.getString("language_type"),resultSet.getString("rating")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return filmler;
    }
 
}
