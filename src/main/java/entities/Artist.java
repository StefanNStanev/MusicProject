package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name= "artists")
public class Artist {
    
    private String name;
    private String genre;
    private int id;
 
    public Artist(){}
    
    public Artist (String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
    
    @Id
    @Column (name="artist_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
    @Column (name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column (name="genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
