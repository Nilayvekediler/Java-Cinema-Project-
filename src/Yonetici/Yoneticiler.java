package Yonetici;


public class Yoneticiler implements IYonetici {
    private int id;
    private String yonetici_ad;
    private String yonetici_soyad;
    private String yonetici_eposta;
    private String yonetici_cepNo;
    private String yonetici_dogumT;
    private String yonetici_cinsiyet;
    private String yonetici_sifre;

    public Yoneticiler(int id,String yonetici_ad, String yonetici_soyad, String yonetici_eposta, String yonetici_cepNo, String yonetici_dogumT, String yonetici_cinsiyet, String yonetici_sifre) {
        this.id = id;
        this.yonetici_ad = yonetici_ad;
        this.yonetici_soyad = yonetici_soyad;
        this.yonetici_eposta = yonetici_eposta;
        this.yonetici_cepNo = yonetici_cepNo;
        this.yonetici_dogumT = yonetici_dogumT;
        this.yonetici_cinsiyet = yonetici_cinsiyet;
        this.yonetici_sifre = yonetici_sifre;
    }
    
    
    @Override
    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
     public void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     public String getYonetici_ad() {
        return yonetici_ad;
    }

    public void setYonetici_ad(String yonetici_ad) {
        this.yonetici_ad = yonetici_ad;
    }
    
     public String getYonetici_soyad() {
        return yonetici_soyad;
    }

    public void setYonetici_soyad(String yonetici_soyad) {
        this.yonetici_soyad = yonetici_soyad;
    }

    public String getYonetici_eposta() {
        return yonetici_eposta;
    }

    public void setYonetici_eposta(String yonetici_eposta) {
        this.yonetici_eposta = yonetici_eposta;
    }

    public String getYonetici_cepNo() {
        return yonetici_cepNo;
    }

    public void setYonetici_cepNo(String yonetici_cepNo) {
        this.yonetici_cepNo = yonetici_cepNo;
    }

    public String getYonetici_dogumT() {
        return yonetici_dogumT;
    }

    public void setYonetici_dogumT(String yonetici_dogumT) {
        this.yonetici_dogumT = yonetici_dogumT;
    }

    public String getYonetici_cinsiyet() {
        return yonetici_cinsiyet;
    }

    public void setYonetici_cinsiyet(String yonetici_cinsiyet) {
        this.yonetici_cinsiyet = yonetici_cinsiyet;
    }

    public String getYonetici_sifre() {
        return yonetici_sifre;
    }

    public void setYonetici_sifre(String yonetici_sifre) {
        this.yonetici_sifre = yonetici_sifre;
    }
    
    
    
    
}
