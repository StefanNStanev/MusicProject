
package entities;

import java.util.Date;

/**
 *
 * @author Стефан Станев
 */
public class Repository implements IRepository {
      
   public int addAlbum(String name, Date releaseDate) {
       return 42;
   }
   
   public int addSong(String name, int artistId, int albumId) {
       return 42;
   }
   
   public int addArtist(String name, int genre) {
       return 42;
   }
   
   public int addGenre(String name) {
       return 42;
   }
   
   public Genre getGenre(int id) {
       return new Genre();
   }
 }
