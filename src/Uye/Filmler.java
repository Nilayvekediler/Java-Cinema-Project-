
package Uye;

public class Filmler {

    private String film_name;
    private String film_category;
    private String description;
    private String release_date;
    private String length;
    private String language_type;
    private String rating;
    
     public Filmler(String film_name, String film_category, String description, String release_date, String length, String language_type, String rating) {

        this.film_name = film_name;
        this.film_category = film_category;
        this.description = description;
        this.release_date = release_date;
        this.length = length;
        this.language_type = language_type;
        this.rating = rating;
    }


    public String getFilm_name() {
        return film_name;
    }

    public String getFilm_category() {
        return film_category;
    }

    public String getDescription() {
        return description;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getLength() {
        return length;
    }

    public String getLanguage_type() {
        return language_type;
    }

    public String getRating() {
        return rating;
    }
    
}
