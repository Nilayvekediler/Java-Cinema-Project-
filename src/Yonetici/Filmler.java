
package Yonetici;


public class Filmler implements IYonetici{
    
    private int film_id;
    private String film_name;
    private String film_category;
    private String description;
    private String release_date;
    private String length;
    private String language_type;
    private String rating;
    
     public Filmler(int film_id, String film_name, String film_category, String description, String release_date, String length, String language_type, String rating) {
        this.film_id = film_id;
        this.film_name = film_name;
        this.film_category = film_category;
        this.description = description;
        this.release_date = release_date;
        this.length = length;
        this.language_type = language_type;
        this.rating = rating;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getFilm_category() {
        return film_category;
    }

    public void setFilm_category(String film_category) {
        this.film_category = film_category;
    }

    public String getFilm_description() {
        return description;
    }

    public void setFilm_description(String description) {
        this.description = description;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getLanguage_type() {
        return language_type;
    }

    public void setLanguage_type(String language_type) {
        this.language_type = language_type;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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
