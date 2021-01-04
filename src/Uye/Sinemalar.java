
package Uye;

public class Sinemalar {
    
    private int cinema_id;
    private String cinema_name;
    private String cinema_adress;

    

    public Sinemalar(int cinema_id, String cinema_name, String cinema_adress) {
        this.cinema_id = cinema_id;
        this.cinema_name = cinema_name;
        this.cinema_adress = cinema_adress;
    }

    public Sinemalar(String cinema_name) {
       this.cinema_name = cinema_name;
    }

    Sinemalar(String string, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCinema_id() {
        return cinema_id;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public String getCinema_adress() {
        return cinema_adress;
    }

    
}
