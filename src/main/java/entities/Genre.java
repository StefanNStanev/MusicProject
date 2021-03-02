package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "genre")
public class Genre {
    
    private String name;
    private int genreId;
    
    public Genre () {}

    @Id
    @Column (name = "genre_id")
    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }
    
    @Column (name = "name")
    public String getName(){
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
}
