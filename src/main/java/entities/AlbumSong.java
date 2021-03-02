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
public class AlbumSong {
    
    private int albumId;
    private int songId;
    
    public AlbumSong(int albumId, int songId) {
        this.albumId = albumId;
        this.songId = songId;        
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }        
}
