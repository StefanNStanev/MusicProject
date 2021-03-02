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
public class ArtistGenre {
    
    private int artistId;
    private int genreId;
    
    public ArtistGenre(int artistId, int genreId) {
        this.artistId = artistId;
        this.genreId = genreId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }       
}
