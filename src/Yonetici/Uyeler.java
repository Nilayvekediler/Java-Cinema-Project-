
package Yonetici;


public class Uyeler implements IYonetici{
    
    private int id;
    private String uye_ad;
    private String uye_soyad;
    private String uye_eposta;
    private String uye_cepNo;
    private String uye_dogumT;
    private String uye_cinsiyet;
    private String uye_sifre;
    
    private String proje_sahibi;

    public Uyeler(int id, String uye_ad, String uye_soyad, String uye_eposta, String uye_cepNo, String uye_dogumT, String uye_cinsiyet, String uye_sifre) {
        this.id = id;
        this.uye_ad = uye_ad;
        this.uye_soyad = uye_soyad;
        this.uye_eposta = uye_eposta;
        this.uye_cepNo = uye_cepNo;
        this.uye_dogumT = uye_dogumT;
        this.uye_cinsiyet = uye_cinsiyet;
        this.uye_sifre = uye_sifre;
    }
    Uyeler() {  
    }
    public void setProje_sahibi(String proje_sahibi) {
        this.proje_sahibi = proje_sahibi;
    }
    public String getProje_sahibi() {
        return proje_sahibi;
    }

    public int getId() {
        return id;
    }

    public String getUye_ad() {
        return uye_ad;
    }


    public String getUye_soyad() {
        return uye_soyad;
    }


    public String getUye_eposta() {
        return uye_eposta;
    }

  

    public String getUye_cepNo() {
        return uye_cepNo;
    }

    
    public String getUye_dogumT() {
        return uye_dogumT;
    }

    

    public String getUye_cinsiyet() {
        return uye_cinsiyet;
    }

   

    public String getUye_sifre() {
        return uye_sifre;
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

   
    
}
