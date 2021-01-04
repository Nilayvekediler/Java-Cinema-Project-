
package Uye;


public class BiletlerSalon{
    private final int salon_id;
    private final String salon_name;
    private final int salon_kapasite;

    public BiletlerSalon(String salon_name, int salon_kapasite,int salon_id) {
        this.salon_name = salon_name;
         this.salon_kapasite = salon_kapasite;
         this.salon_id = salon_id;
  
    }
 
    public String getSalon_name() {
        return salon_name;
    }
    
    public int getSalon_kapasite() {
        return salon_kapasite;
    }
 
    public int getSalon_id() {
        return salon_id;
    }

}
