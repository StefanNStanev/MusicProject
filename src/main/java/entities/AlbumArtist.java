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
public class AlbumArtist {
    
    private int albumId;
    private int artistId;
    
    public AlbumArtist(int albumId, int artistId) {
        this.albumId = albumId;
        this.artistId = artistId;
    }
    
    public int getAlbumId(){
        return albumId;
    }
    
    public void setAlbumId (int albumId) {
        this.albumId = albumId;
    }
    
    public int getArtistId() {
        return artistId;
    }
    
    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }
    
}
