
package Uye;
import Ortak.DbHelper;
import java.awt.Color;
import static java.awt.Color.GREEN;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BiletAl extends javax.swing.JFrame { //Final sınıflar: Final olan bir sınıf genişletilerek bir alt sınıf oluşturulamaz.
    
    DefaultTableModel model;
    String eposta;
    int tutar = 0;
 
    public BiletAl() {
        initComponents();
        
       
    }
    
    public BiletAl(String gelenFilmAdi,String gelenEPosta) {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        lblGelenFilmAdi.setText(gelenFilmAdi);
        eposta =gelenEPosta;
        koltukGorunurlukDegistir();
        
    }
    
     public final void tabloGöster(){
         model = (DefaultTableModel)tblRez.getModel();
         String seat = null;
         if(a1.getBackground()==GREEN){
            seat= "a1 ";
        }if(a2.getBackground()==GREEN){
            seat= "a2 ";
        }if(a3.getBackground()==GREEN){
            seat= "a3 ";
        }if(b1.getBackground()==GREEN){
            seat= "b1 ";
        }if(b2.getBackground()==GREEN){
            seat= "b2 ";
        }if(b3.getBackground()==GREEN){
            seat= "b3 ";
        }if(c1.getBackground()==GREEN){
            seat= "c1 ";
        }if(c2.getBackground()==GREEN){
            seat= "c2 ";
        }if(c3.getBackground()==GREEN){
            seat= "c3 ";
        }
         
         model.addRow(new Object[] {lblGelenFilmAdi.getText(),cboxSehir.getSelectedItem(),cboxSinema.getSelectedItem(),cboxDilSecenek.getSelectedItem(),cboxTarih.getSelectedItem(),cboxSeans.getSelectedItem(),cboxSalon.getSelectedItem(),seat,20});
    
     }
   
 
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGelenFilmAdi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboxSinema = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboxDilSecenek = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboxTarih = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboxSeans = new javax.swing.JComboBox<>();
        lblPerde = new javax.swing.JLabel();
        lblDolu = new javax.swing.JLabel();
        lblSeçilebilir = new javax.swing.JLabel();
        lblSeçiminiz = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtToplamTutar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtOdenenTutar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtParaUstu = new javax.swing.JTextField();
        cboxSehir = new javax.swing.JComboBox<>();
        KoltukDuzenGoster = new javax.swing.JButton();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboxSalon = new javax.swing.JComboBox<>();
        lblSalonKapasitesi = new javax.swing.JLabel();
        lblKapasite = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        c4 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        lblGelenUye = new javax.swing.JLabel();
        lblSalon_id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRez = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtBilgi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bilet Al");
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        lblGelenFilmAdi.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(lblGelenFilmAdi);
        lblGelenFilmAdi.setBounds(50, 10, 100, 13);

        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Filmine Bilet Alıyorsunuz.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(163, 10, 150, 13);

        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Şehir");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 60, 109, 13);

        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Sinema");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 100, 142, 13);

        cboxSinema.setForeground(new java.awt.Color(0, 0, 102));
        cboxSinema.setToolTipText("");
        cboxSinema.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxSinemaİtemStateChanged(evt);
            }
        });
        cboxSinema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxSinemaMouseClicked(evt);
            }
        });
        getContentPane().add(cboxSinema);
        cboxSinema.setBounds(230, 100, 119, 21);

        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Dil Seçeneği");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 140, 142, 13);

        cboxDilSecenek.setForeground(new java.awt.Color(0, 0, 102));
        cboxDilSecenek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxDilSecenekMouseClicked(evt);
            }
        });
        getContentPane().add(cboxDilSecenek);
        cboxDilSecenek.setBounds(230, 140, 119, 21);

        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Tarih");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 180, 142, 13);

        cboxTarih.setForeground(new java.awt.Color(0, 0, 102));
        cboxTarih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18 Aralık 2020" }));
        getContentPane().add(cboxTarih);
        cboxTarih.setBounds(230, 180, 119, 19);

        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Seans ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 220, 142, 13);

        cboxSeans.setForeground(new java.awt.Color(0, 0, 102));
        cboxSeans.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxSeansİtemStateChanged(evt);
            }
        });
        cboxSeans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxSeansMouseClicked(evt);
            }
        });
        getContentPane().add(cboxSeans);
        cboxSeans.setBounds(230, 220, 119, 21);

        lblPerde.setText("--------------------Perde--------------------");
        getContentPane().add(lblPerde);
        lblPerde.setBounds(40, 470, 186, 13);

        lblDolu.setForeground(new java.awt.Color(204, 0, 0));
        lblDolu.setText("Kırmızı : Dolu");
        getContentPane().add(lblDolu);
        lblDolu.setBounds(230, 360, 77, 13);

        lblSeçilebilir.setForeground(new java.awt.Color(102, 102, 102));
        lblSeçilebilir.setText("Gri : Seçilebilir");
        getContentPane().add(lblSeçilebilir);
        lblSeçilebilir.setBounds(230, 380, 77, 13);

        lblSeçiminiz.setForeground(new java.awt.Color(0, 204, 51));
        lblSeçiminiz.setText("Yeşil : Seçiminiz");
        getContentPane().add(lblSeçiminiz);
        lblSeçiminiz.setBounds(230, 400, 90, 13);

        jButton13.setForeground(new java.awt.Color(0, 0, 102));
        jButton13.setText("Fatura Çıkar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(20, 520, 220, 21);

        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Toplam Tutar :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(360, 330, 106, 13);

        txtToplamTutar.setEditable(false);
        getContentPane().add(txtToplamTutar);
        txtToplamTutar.setBounds(480, 319, 365, 30);

        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Ödenen Tutar :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(360, 370, 106, 13);
        getContentPane().add(txtOdenenTutar);
        txtOdenenTutar.setBounds(480, 359, 103, 30);

        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Paraüstü :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(360, 440, 75, 13);
        getContentPane().add(txtParaUstu);
        txtParaUstu.setBounds(440, 429, 142, 30);

        cboxSehir.setForeground(new java.awt.Color(0, 0, 102));
        cboxSehir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Düzce", "Edirne", "Elâzığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkâri", "Hatay", "Iğdır", "Isparta", "İstanbul", "İzmir", "Kahramanmaraş", "Karabük", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kırıkkale", "Kırklareli", "Kırşehir", "Kilis", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Şanlıurfa", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak" }));
        cboxSehir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxSehirİtemStateChanged(evt);
            }
        });
        getContentPane().add(cboxSehir);
        cboxSehir.setBounds(230, 60, 119, 19);

        KoltukDuzenGoster.setForeground(new java.awt.Color(0, 0, 102));
        KoltukDuzenGoster.setText("Salonun Koltuk Düzenini Göster");
        KoltukDuzenGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KoltukDuzenGosterActionPerformed(evt);
            }
        });
        getContentPane().add(KoltukDuzenGoster);
        KoltukDuzenGoster.setBounds(50, 280, 300, 21);

        lblA.setForeground(new java.awt.Color(0, 0, 102));
        lblA.setText("A");
        getContentPane().add(lblA);
        lblA.setBounds(30, 350, 30, 13);

        lblB.setForeground(new java.awt.Color(0, 0, 102));
        lblB.setText("B");
        getContentPane().add(lblB);
        lblB.setBounds(30, 390, 30, 13);

        lblC.setForeground(new java.awt.Color(0, 0, 102));
        lblC.setText("C");
        getContentPane().add(lblC);
        lblC.setBounds(30, 440, 20, 13);

        lbl1.setForeground(new java.awt.Color(0, 0, 102));
        lbl1.setText("1");
        getContentPane().add(lbl1);
        lbl1.setBounds(70, 320, 10, 13);

        lbl2.setForeground(new java.awt.Color(0, 0, 102));
        lbl2.setText("2");
        getContentPane().add(lbl2);
        lbl2.setBounds(110, 320, 10, 13);

        lbl3.setForeground(new java.awt.Color(0, 0, 102));
        lbl3.setText("3");
        getContentPane().add(lbl3);
        lbl3.setBounds(150, 320, 10, 13);

        lbl4.setForeground(new java.awt.Color(0, 0, 102));
        lbl4.setText("4");
        getContentPane().add(lbl4);
        lbl4.setBounds(190, 320, 20, 13);

        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Salon");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 250, 36, 13);

        cboxSalon.setForeground(new java.awt.Color(0, 0, 102));
        cboxSalon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxSalonİtemStateChanged(evt);
            }
        });
        cboxSalon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxSalonMouseClicked(evt);
            }
        });
        getContentPane().add(cboxSalon);
        cboxSalon.setBounds(230, 250, 119, 21);

        lblSalonKapasitesi.setForeground(new java.awt.Color(0, 0, 102));
        lblSalonKapasitesi.setText("Salon Kapasitesi :");
        getContentPane().add(lblSalonKapasitesi);
        lblSalonKapasitesi.setBounds(30, 500, 98, 13);

        lblKapasite.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(lblKapasite);
        lblKapasite.setBounds(160, 500, 84, 13);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(c4);
        c4.setBounds(131, 90, 30, 27);

        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel1.add(a1);
        a1.setBounds(10, 10, 33, 28);

        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        jPanel1.add(a3);
        a3.setBounds(90, 10, 31, 28);

        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        jPanel1.add(a2);
        a2.setBounds(49, 10, 31, 28);
        jPanel1.add(a4);
        a4.setBounds(130, 10, 31, 28);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(10, 50, 31, 28);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(50, 50, 31, 28);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(90, 50, 31, 28);
        jPanel1.add(b4);
        b4.setBounds(131, 50, 30, 28);

        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1);
        c1.setBounds(10, 90, 31, 27);

        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel1.add(c2);
        c2.setBounds(50, 90, 31, 27);

        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jPanel1.add(c3);
        c3.setBounds(90, 90, 31, 27);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 330, 170, 130);

        lblGelenUye.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(lblGelenUye);
        lblGelenUye.setBounds(360, 490, 487, 17);
        getContentPane().add(lblSalon_id);
        lblSalon_id.setBounds(320, 300, 31, 13);

        tblRez.setForeground(new java.awt.Color(0, 0, 102));
        tblRez.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Film adı", "Şehir", "Sinema", "Dil Seçeneği", "Tarih", "Seans", "Salon", "Koltuk", "Fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRez.setOpaque(false);
        jScrollPane1.setViewportView(tblRez);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 60, 513, 241);

        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Para Üstü Al");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 400, 227, 21);

        txtBilgi.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(txtBilgi);
        txtBilgi.setBounds(230, 30, 305, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/ssss.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 300, 250);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboxSehirİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxSehirİtemStateChanged
       cboxSinema.removeAllItems();
    }//GEN-LAST:event_cboxSehirİtemStateChanged

    private void cboxSinemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxSinemaMouseClicked
        int cinema_id = 0;
        try {
            txtBilgi.setText("");
            String searchKey = cboxSehir.getSelectedItem().toString();
            
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
                cboxSinema.addItem(sinema.getCinema_name());
              //  cinema_id = sinema.getCinema_id();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BiletAl.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_cboxSinemaMouseClicked

    private void cboxDilSecenekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxDilSecenekMouseClicked

         try {
             ArrayList <BiletlerFilm> biletler;
             
             biletler = getDilSecenekleri();
             for (BiletlerFilm bilet : biletler){
                 cboxDilSecenek.addItem(bilet.getLanguage_type());
             }
         } catch (SQLException ex) {
             Logger.getLogger(BiletAl.class.getName()).log(Level.SEVERE, null, ex);
         }
   
    }//GEN-LAST:event_cboxDilSecenekMouseClicked

    private void cboxSeansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxSeansMouseClicked
        try {
            txtBilgi.setText("");
            
            Connection connection;
            DbHelper dbHelper = new DbHelper();
            connection = dbHelper.getConnection();
            PreparedStatement statement =null;
            String sql ="select * from cities where city_name = '"+cboxSehir.getSelectedItem().toString()+"'";
           
            statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            int city_id = 0;
            if(rs.next()){
                city_id= rs.getInt("city_id");
            }
            //.....................................
             ArrayList <BiletlerTime> biletler;
             
             biletler = getSeanslar(lblGelenFilmAdi.getText(),city_id);
             for (BiletlerTime bilet : biletler){
                 cboxSeans.addItem(bilet.getTime());
             }
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
        
        if(cboxSeans.getItemCount() == 0){
            txtBilgi.setText("Üzgünüz, aradığınız film bu sinemada oynamamaktadır.");
        }
        
    }//GEN-LAST:event_cboxSeansMouseClicked

    private void KoltukDuzenGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KoltukDuzenGosterActionPerformed
       
            try {
                txtBilgi.setText("");
                
                Connection connection;
                DbHelper dbHelper = new DbHelper();
                connection = dbHelper.getConnection();
                PreparedStatement statement =null;
                String sql ="select * from cities where city_name = '"+cboxSehir.getSelectedItem().toString()+"'";
                
                statement = connection.prepareStatement(sql);
                ResultSet rs = statement.executeQuery();
                int city_id = 0;
                if(rs.next()){
                    city_id= rs.getInt("city_id");
                }
                
                //.....................................
                ArrayList <BiletlerSalon> biletler;
                
                
                biletler = getSalonlar(lblGelenFilmAdi.getText(),city_id);
                for (BiletlerSalon bilet : biletler){
                    lblKapasite.setText(String.valueOf(bilet.getSalon_kapasite()));
                    //salon_id = bilet.getSalon_id();
                    
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
            if(String.valueOf(4).equals(lblKapasite.getText())){
                a1.setVisible(true);
                a2.setVisible(true);
                b1.setVisible(true);
                b2.setVisible(true);
                
                lblPerde.setVisible(true);
                lblA.setVisible(true);
                lblB.setVisible(true);
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lblSalonKapasitesi.setVisible(true);
                lblKapasite.setVisible(true);
                lblDolu.setVisible(true);
                lblSeçilebilir.setVisible(true);
                lblSeçiminiz.setVisible(true);
            }
            else if(String.valueOf(6).equals(lblKapasite.getText())){
                a1.setVisible(true);
                a2.setVisible(true);
                a3.setVisible(true);
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                
                lblPerde.setVisible(true);
                lblA.setVisible(true);
                lblB.setVisible(true);
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(true);
                lblSalonKapasitesi.setVisible(true);
                lblKapasite.setVisible(true);
                lblDolu.setVisible(true);
                lblSeçilebilir.setVisible(true);
                lblSeçiminiz.setVisible(true);
            }
            else if(String.valueOf(9).equals(lblKapasite.getText())){
                a1.setVisible(true);
                a2.setVisible(true);
                a3.setVisible(true);
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                c1.setVisible(true);
                c2.setVisible(true);
                c3.setVisible(true);
                
                lblPerde.setVisible(true);
                lblA.setVisible(true);
                lblB.setVisible(true);
                lblC.setVisible(true);
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(true);
                lblSalonKapasitesi.setVisible(true);
                lblKapasite.setVisible(true);
                lblDolu.setVisible(true);
                lblSeçilebilir.setVisible(true);
                lblSeçiminiz.setVisible(true);
            }
            
         try {                                                  
            int rezTablosundakiSalonId = 0;
            ArrayList<String> rezTablosundakiDoluSeat = new ArrayList<String>();
            ArrayList <Rezervasyon> rezler = getRezervasyon();
            for (Rezervasyon rez : rezler){
                if(secilenSalonIdDondurucu()== rez.getSalon_id() && cboxSeans.getSelectedItem().equals(rez.getSeans())){
                    if("a1".equals(rez.getSeat())){ 
                         a1.setBackground(Color.RED);
                    }if("a2".equals(rez.getSeat())){ 
                         a2.setBackground(Color.RED);
                    }if("a3".equals(rez.getSeat())){ 
                         a3.setBackground(Color.RED);
                    }if("b1".equals(rez.getSeat())){ 
                         b1.setBackground(Color.RED);
                    }if("b2".equals(rez.getSeat())){ 
                         b2.setBackground(Color.RED);
                    }if("b3".equals(rez.getSeat())){ 
                         b3.setBackground(Color.RED);
                    }if("c1".equals(rez.getSeat())){ 
                         c1.setBackground(Color.RED);
                    }if("c2".equals(rez.getSeat())){ 
                         c2.setBackground(Color.RED);                     
                    }if("c3".equals(rez.getSeat())){ 
                         c3.setBackground(Color.RED);
                    }
            }    
            
        }} catch (SQLException ex) {
             Logger.getLogger(BiletAl.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        

    }//GEN-LAST:event_KoltukDuzenGosterActionPerformed

    private void cboxSalonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxSalonMouseClicked
         try {
            txtBilgi.setText("");
            
            Connection connection;
            DbHelper dbHelper = new DbHelper();
            connection = dbHelper.getConnection();
            PreparedStatement statement =null;
            String sql ="select * from cities where city_name = '"+cboxSehir.getSelectedItem().toString()+"'";
           
            statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            int city_id = 0;
            if(rs.next()){
                city_id= rs.getInt("city_id");
            }
            //.....................................
             ArrayList <BiletlerSalon> biletler;
             
             biletler = getSalonlar(lblGelenFilmAdi.getText(),city_id);
             for (BiletlerSalon bilet : biletler){
                 cboxSalon.addItem(bilet.getSalon_name());
             }
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
         
    }//GEN-LAST:event_cboxSalonMouseClicked

    private void cboxSinemaİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxSinemaİtemStateChanged
        cboxSeans.removeAllItems();
    }//GEN-LAST:event_cboxSinemaİtemStateChanged

    private void cboxSeansİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxSeansİtemStateChanged
        cboxSalon.removeAllItems();
    }//GEN-LAST:event_cboxSeansİtemStateChanged

    private void cboxSalonİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxSalonİtemStateChanged
        koltukGorunurlukDegistir();
     
    }//GEN-LAST:event_cboxSalonİtemStateChanged

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        a1.setBackground(Color.GREEN);
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        a2.setBackground(Color.GREEN);
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        a3.setBackground(Color.GREEN);
    }//GEN-LAST:event_a3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        b1.setBackground(Color.GREEN);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        b2.setBackground(Color.GREEN);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        b3.setBackground(Color.GREEN);
    }//GEN-LAST:event_b3ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        c1.setBackground(Color.GREEN);
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        c2.setBackground(Color.GREEN);
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        c3.setBackground(Color.GREEN);
    }//GEN-LAST:event_c3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        tutar += 20;
        
        try {
            Connection connection;
            DbHelper dbHelper = new DbHelper();
            connection = dbHelper.getConnection();
            PreparedStatement statement =null;
            String sql ="select * from cities where city_name = '"+cboxSehir.getSelectedItem().toString()+"'";
           
            statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            int city_id = 0;
            if(rs.next()){
                city_id= rs.getInt("city_id");
            }
            
            add(secilenSalonIdDondurucu());
            tabloGöster();
            if(a1.getBackground()==GREEN){
                a1.setBackground(Color.RED);
            }if(a2.getBackground()==GREEN){
                a2.setBackground(Color.RED);
            }if(a3.getBackground()==GREEN){
                a3.setBackground(Color.RED);
            }if(b1.getBackground()==GREEN){
                b1.setBackground(Color.RED);
            }if(b2.getBackground()==GREEN){
                b2.setBackground(Color.RED);
            }if(b3.getBackground()==GREEN){
                b3.setBackground(Color.RED);
            }if(c1.getBackground()==GREEN){
                c1.setBackground(Color.RED);
            }if(c2.getBackground()==GREEN){
                c2.setBackground(Color.RED);
            }if(c3.getBackground()==GREEN){
                c3.setBackground(Color.RED);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BiletAl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtToplamTutar.setText(String.valueOf(tutar));
       
   
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         txtParaUstu.setText(String.valueOf(Integer.parseInt(txtOdenenTutar.getText())-Integer.parseInt(txtToplamTutar.getText())));
    }//GEN-LAST:event_jButton1ActionPerformed
 //4. kısım şuanda kullanılır durumda değil en fazla 9 kişilik salonumuz olduğu için eğer 12 kişilik salon olursa kodlara kolayca eklenebilir.
                
    
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
            java.util.logging.Logger.getLogger(BiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiletAl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiletAl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KoltukDuzenGoster;
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JComboBox<String> cboxDilSecenek;
    private javax.swing.JComboBox<String> cboxSalon;
    private javax.swing.JComboBox<String> cboxSeans;
    private javax.swing.JComboBox<String> cboxSehir;
    private javax.swing.JComboBox<String> cboxSinema;
    private javax.swing.JComboBox<String> cboxTarih;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblDolu;
    private javax.swing.JLabel lblGelenFilmAdi;
    private javax.swing.JLabel lblGelenUye;
    private javax.swing.JLabel lblKapasite;
    private javax.swing.JLabel lblPerde;
    private javax.swing.JLabel lblSalonKapasitesi;
    private javax.swing.JLabel lblSalon_id;
    private javax.swing.JLabel lblSeçilebilir;
    private javax.swing.JLabel lblSeçiminiz;
    private javax.swing.JTable tblRez;
    private javax.swing.JLabel txtBilgi;
    private javax.swing.JTextField txtOdenenTutar;
    private javax.swing.JTextField txtParaUstu;
    private javax.swing.JTextField txtToplamTutar;
    // End of variables declaration//GEN-END:variables
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
                sinemalar.add(new Sinemalar(resultSet.getString("cinema_name")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return sinemalar;
    }

public ArrayList<BiletlerFilm> getDilSecenekleri() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<BiletlerFilm> biletler = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from film where film_name='"+lblGelenFilmAdi.getText()+"'");
            biletler = new ArrayList<BiletlerFilm>();
            while(resultSet.next()){
                biletler.add(new BiletlerFilm(resultSet.getString("language_type")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return biletler;
    }
    
public ArrayList<BiletlerTime> getSeanslar(String film_name,int id) throws SQLException{ //id de yukarıdaki city_id. Satır 361.
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<BiletlerTime> biletler = null;
        //--------------------------------------------------------------
             connection = dbHelper.getConnection();
             PreparedStatement ps =null;
             String sql ="select * from film where film_name='"+film_name+"'";
             ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             int film_id = 0;
             if(rs.next()){
                film_id= rs.getInt("film_id"); 
             }
            // System.out.println(film_id);
        //film id elde ettik
        //------------------------------------------------------------
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select time from seans where seans_id in (select seans_id from cinemas_saloon_seans  where id in (select css_id from film_css where film_id="+film_id+") AND cinema_id=(select id from city_cinemas where şehir_id="+id+" AND sinema_id in(select cinema_id from cinemas where cinema_name='"+cboxSinema.getSelectedItem().toString()+"')) )");
            biletler = new ArrayList<BiletlerTime>();
            while(resultSet.next()){
                biletler.add(new BiletlerTime(resultSet.getString("time")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return biletler;
    }
    
public ArrayList<BiletlerSalon> getSalonlar(String film_name,int id) throws SQLException{ //id de yukarıdaki city_id. Satır 361.
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<BiletlerSalon> biletler = null;
        //--------------------------------------------------------------
             connection = dbHelper.getConnection();
             PreparedStatement ps =null;
             String sql ="select * from film where film_name='"+film_name+"'";
             ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             int film_id = 0;
             if(rs.next()){
                film_id= rs.getInt("film_id"); 
             }
             
        //film id elde ettik
        //------------------------------------------------------------
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from saloon where saloon_id in (select saloon_id from cinemas_saloon_seans where (seans_id= (select seans_id from seans where time='"+cboxSeans.getSelectedItem().toString()+"') AND id in (select id from cinemas_saloon_seans where (id in (select css_id from film_css where film_id= "+film_id+") AND cinema_id= (select id from city_cinemas where (şehir_id = "+id+" AND sinema_id in (select cinema_id from cinemas where cinema_name= '"+cboxSinema.getSelectedItem().toString()+"')))))))");

     
            biletler = new ArrayList<BiletlerSalon>();
            while(resultSet.next()){
                biletler.add(new BiletlerSalon(resultSet.getString("saloon_name"),resultSet.getInt("kapasite"),resultSet.getInt("saloon_id")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return biletler;
    }
    private ArrayList<UyeBilgileri> getUyeBilgileri() throws SQLException{
        Connection connection =null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<UyeBilgileri> uyeBilgileri = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet= statement.executeQuery("select * from uye where uye_eposta='"+eposta+"'");
            uyeBilgileri = new ArrayList<UyeBilgileri>();
            while(resultSet.next()){
                uyeBilgileri.add(new UyeBilgileri(resultSet.getInt("id"),resultSet.getString("uye_ad"),resultSet.getString("uye_soyad"),resultSet.getString("uye_eposta"),resultSet.getString("uye_cepNo"),resultSet.getString("uye_dogumT"),resultSet.getString("uye_cinsiyet")));
            }
            
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
        return uyeBilgileri;
    }
    
    private int getSalonId(String film_name,int id) {
        
        int salon_id = 0;
        try{
            
            Connection connection =null;
            DbHelper dbHelper = new DbHelper();
            Statement statement = null;
            ResultSet resultSet;
            
            
            //--------------------------------------------------------------
            connection = dbHelper.getConnection();
            PreparedStatement ps =null;
            String sql ="select * from film where film_name='"+film_name+"'";
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int film_id = 0;
            if(rs.next()){
                film_id= rs.getInt("film_id");
            }
            
            //film id elde ettik
            //------------------------------------------------------------
            try{
                connection = dbHelper.getConnection();
                statement = connection.createStatement();
                resultSet= statement.executeQuery("select saloon_id from cinemas_saloon_seans where (seans_id= (select seans_id from seans where time='"+cboxSeans.getSelectedItem().toString()+"') AND id in (select id from cinemas_saloon_seans where (id in (select css_id from film_css where film_id= "+film_id+") AND cinema_id= (select id from city_cinemas where (şehir_id = "+id+" AND sinema_id in (select cinema_id from cinemas where cinema_name= '"+cboxSinema.getSelectedItem().toString()+"'))))))");
                
                while(resultSet.next()){
                    salon_id=resultSet.getInt("saloon_id");
                }
               
                
            }catch(SQLException exception){
                dbHelper.showErrorMessage(exception);
            }finally{
                statement.close();
                connection.close();
            }
            
           
        }catch(SQLException ex){
            Logger.getLogger(BiletAl.class.getName()).log(Level.SEVERE, null,ex);
        }
        return salon_id;
        
         
       }
    
    private int secilenSalonIdDondurucu(){
        int city_id = 0;
        try {
            Connection connection;
            DbHelper dbHelper = new DbHelper();
            connection = dbHelper.getConnection();
            PreparedStatement statement =null;
            String sql ="select * from cities where city_name = '"+cboxSehir.getSelectedItem().toString()+"'";
           
            statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            if(rs.next()){
                city_id= rs.getInt("city_id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BiletAl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getSalonId(lblGelenFilmAdi.getText(),city_id);
    }
    
    
    
    public void add(int salon_id) {
     Connection connection =null;
     DbHelper dbHelper = new DbHelper();
     
     PreparedStatement statement =null;
        try{
             
             String film_name2 =lblGelenFilmAdi.getText();
             String city = cboxSehir.getSelectedItem().toString();
             String cinema = cboxSinema.getSelectedItem().toString();
             String seans = cboxSeans.getSelectedItem().toString();
             
             //String seat = cboxSehir.getSelectedItem().toString();
             int price = 20;
             String seat = null;
             int seat_station = 1;
             
             ArrayList <UyeBilgileri> uyeBilgileri = getUyeBilgileri();
             int uye_id = 0;
             for (UyeBilgileri uyeBilgisi : uyeBilgileri){
                 uye_id = uyeBilgisi.getId();
                 if(uyeBilgisi.getUye_cinsiyet().equals("Kadın")){
                     lblGelenUye.setText("Bizi tercih ettiğiniz için teşekkür ederiz "+uyeBilgisi.getUye_ad()+" "+uyeBilgisi.getUye_soyad()+" hanım.");
                 }else{
                     lblGelenUye.setText("Bizi tercih ettiğiniz için teşekkür ederiz "+uyeBilgisi.getUye_ad()+" "+uyeBilgisi.getUye_soyad()+" bey.");
                 }
             }
             
            
             
             if(a1.getBackground()==GREEN){
                 seat= "a1";
             }if(a2.getBackground()==GREEN){
                 seat= "a2";
             }if(a3.getBackground()==GREEN){
                 seat= "a3";
             }if(b1.getBackground()==GREEN){
                 seat= "b1";
             }if(b2.getBackground()==GREEN){
                 seat= "b2";
             }if(b3.getBackground()==GREEN){
                 seat= "b3";
             }if(c1.getBackground()==GREEN){
                 seat= "c1";
             }if(c2.getBackground()==GREEN){
                 seat= "c2";
             }if(c3.getBackground()==GREEN){
                 seat= "c3";
             }
             
             
             
             
             connection = dbHelper.getConnection();
             String sql = "insert into reservation (film_name,city,cinema,seans,salon_id,seat,price,seat_station,uye_id) values(?,?,?,?,?,?,?,?,?)";
             try {
                 statement = connection.prepareStatement(sql);
             } catch (SQLException ex) {
                 dbHelper.showErrorMessage(ex);
             }
             
             statement.setString(1,film_name2);
             statement.setString(2,city);
             statement.setString(3,cinema);
             statement.setString(4,seans);
             statement.setInt(5,salon_id);
             statement.setString(6,seat);
             statement.setInt(7,price);
             statement.setInt(8,seat_station);
             statement.setInt(9,uye_id);
             
             
             int result = statement.executeUpdate();
             
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
    
    public void koltukGorunurlukDegistir(){
        a1.setVisible(false);
        a2.setVisible(false);
        a3.setVisible(false);
        a4.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lblA.setVisible(false);
        lblB.setVisible(false);
        lblC.setVisible(false);
        lblPerde.setVisible(false);
        lblSalonKapasitesi.setVisible(false);
        lblKapasite.setVisible(false);
        lblDolu.setVisible(false);
        lblSeçilebilir.setVisible(false);
        lblSeçiminiz.setVisible(false);
    }
    
}
