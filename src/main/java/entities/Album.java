package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name= "albums")
public class Album implements Serializable {
   
    private int id;
    private String name;
    private Date releaseDate;

    public Album () {}
    
    public Album (String name, Date releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }
    
    @Id
    @Column (name="album_id")
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

    @Column (name="release_date")
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    
}
