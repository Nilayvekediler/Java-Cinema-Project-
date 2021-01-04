
package Yonetici;

public class Sinemalar implements IYonetici{

    private int city_id;
    private String city_name;
    
    private int cinema_id;
    private String cinema_name;
    private String cinema_adress;
    
    private int id;
    private int şehir_id;
    private int sinema_id;
    

    public Sinemalar(int city_id, String city_name) {
        this.city_id = city_id;
        this.city_name = city_name;
    }

    public Sinemalar(int cinema_id, String cinema_name, String cinema_adress) {
        this.cinema_id = cinema_id;
        this.cinema_name = cinema_name;
        this.cinema_adress = cinema_adress;
    }
    
     public Sinemalar(int id, int şehir_id, int sinema_id) {
        this.id = id;
        this.şehir_id = şehir_id;
        this.sinema_id = sinema_id;
    }
     
   
   
    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    
     public int getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(int cinema_id) {
        this.cinema_id = cinema_id;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public String getCinema_adress() {
        return cinema_adress;
    }

    public void setCinema_adress(String cinema_adress) {
        this.cinema_adress = cinema_adress;
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getŞehir_id() {
        return şehir_id;
    }

    public void setŞehir_id(int şehir_id) {
        this.şehir_id = şehir_id;
    }

    public int getSinema_id() {
        return sinema_id;
    }

    public void setSinema_id(int sinema_id) {
        this.sinema_id = sinema_id;
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
    

  
  
   
    
}