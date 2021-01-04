
package Uye;

public class UyeBilgileri {
    private int id;
    private String uye_ad;
    private String uye_soyad;
    private String uye_eposta;
    private String uye_cepNo;
    private String uye_dogumT;
    private String uye_cinsiyet;


    

    public UyeBilgileri(int id, String uye_ad, String uye_soyad, String uye_eposta, String uye_cepNo, String uye_dogumT, String uye_cinsiyet) {
        this.id = id;
        this.uye_ad = uye_ad;
        this.uye_soyad = uye_soyad;
        this.uye_eposta = uye_eposta;
        this.uye_cepNo = uye_cepNo;
        this.uye_dogumT = uye_dogumT;
        this.uye_cinsiyet = uye_cinsiyet;
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
    
  
    
    
}
