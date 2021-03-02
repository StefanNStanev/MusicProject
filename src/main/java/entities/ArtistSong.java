/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Стефан Станев
 */
public class ArtistSong {
    
    private int artistId;
    private int songId;
    
    public ArtistSong(int artistId, int songId) {
        this.artistId = artistId;
        this.songId = songId;
    }
    
    public int getArtistId() {
        return artistId;
    }
    
    public void setArtistId(int artistId) {
        this.artistId = artistId;                
    }
    
    public int getSongId() {
        return songId;
    }
    
    public void setSongId(int songId) {
        this.songId = songId;
    }
    
}
