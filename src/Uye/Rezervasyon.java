
package Uye;

public class Rezervasyon {
    private int rez_id;
    private String film_name;
    private String city;
    private String cinema;
    private String seans;
    private int salon_id;
    private String seat;
    private int price;
    private String uye_id;
    private int seans_id;
    private String salon_name;
    private int salon_kapasite;
    private int css_id;
    private int cinema_id;
    private int film_id;

   

    public Rezervasyon(int rez_id, String film_name, String city, String cinema, String seans, int salon_id, String seat, int price, String uye_id) {
        this.rez_id = rez_id;
        this.film_name = film_name;
        this.city = city;
        this.cinema = cinema;
        this.seans = seans;
        this.salon_id = salon_id;
        this.seat = seat;
        this.price = price;
        this.uye_id = uye_id;
    }

    public Rezervasyon(int seans_id, String seans) {
        this.seans_id =seans_id;
        this.seans = seans;
       
    }
    public Rezervasyon(int salon_id, String salon_name, int salon_kapasite) {
        this.salon_id = salon_id;
        this.salon_name = salon_name;
        this.salon_kapasite = salon_kapasite;
    }
     public Rezervasyon(int css_id, int cinema_id, int salon_id, int seans_id) {
        this.salon_id = salon_id;
        this.seans_id = seans_id;
        this.css_id = css_id;
        this.cinema_id = cinema_id;
    }
     
      public Rezervasyon( int film_id,int css_id) {
        this.css_id = css_id;
        this.film_id = film_id;
    }

    Rezervasyon(int film_id) {
        this.film_id = film_id;
    }

 
      
     
    public int getFilm_id() {
        return film_id;
    }
 
    public int getCss_id() {
        return css_id;
    }

    public int getCinema_id() {
        return cinema_id;
    }

    public String getSalon_name() {
        return salon_name;
    }

    public int getSalon_kapasite() {
        return salon_kapasite;
    }

      public int getSeans_id() {
        return seans_id;
    }

    public int getRez_id() {
        return rez_id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public String getCity() {
        return city;
    }

    public String getCinema() {
        return cinema;
    }

    public String getSeans() {
        return seans;
    }

    public int getSalon_id() {
        return salon_id;
    }

    public String getSeat() {
        return seat;
    }

    public int getPrice() {
        return price;
    }

    public String getUye_id() {
        return uye_id;
    }
    
    
    
}
