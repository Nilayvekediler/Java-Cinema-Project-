
package Ortak;

public abstract class BaglantiSaglandi { //POLİMORFİZM İÇİN 
    
    public void onayMesajı(){
        System.out.println("Bağlantı sağlandı.");
    }
    
    public static void isimYazdir(String isim){ //STATİC KULLANIM ÖRNEĞİ
        System.out.println("Proje Sahibi:"+isim);
    }
}


