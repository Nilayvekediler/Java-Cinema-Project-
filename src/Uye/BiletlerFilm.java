
package Uye;

public class BiletlerFilm {
    
    private int film_id;
    private String film_name;
    private String language_type;


   
    public BiletlerFilm(String language_type) {
        this.language_type = language_type;
    }

  
    public String getLanguage_type() {
        return language_type;
    }

    
}
