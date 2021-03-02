package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "songs")
public class Song implements Serializable {
    
    private String name;
    private int artistId;
    private int albumId;
    private int id;
    
    public Song() {}
    
    public Song (String name, int artistId, int albumId) {
        this.name = name;
        this.artistId = artistId;
        this.albumId = albumId;
    }
    
    @Id
    @Column (name = "song_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column (name = "name")
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    @Column (name = "artist_id")
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    
    @Column (name = "album_id")
    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
    
    
}
