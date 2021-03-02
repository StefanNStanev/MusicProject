package entities;

import java.util.Date;

/**
 *
 * @author Стефан Станев
 */
public interface IRepository {
    
   public int addAlbum(String name, Date releaseDate);
   public int addSong(String name, int artistId, int albumId);
   public int addArtist(String name, int genre);
   public int addGenre(String name);
   public Genre getGenre(int id);
}
