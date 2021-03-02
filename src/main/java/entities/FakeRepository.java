package entities;

import Hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

public class FakeRepository extends HibernateUtil implements IRepository {
      
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
       Genre result = new Genre();
       result.setGenreId(id);
       
       return result;
   }
   
   public List<Album> getAlbumsList() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();   
        
    return session.createQuery("SELECT a FROM Album a", Album.class).getResultList();
   }
   
   public List<Song> getSongsList() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();   
    
    return session.createQuery("SELECT s FROM Song s", Song.class).getResultList();
   }
   
   public List<Genre> getGenresList() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();   
        
    return session.createQuery("SELECT g FROM Genre g", Genre.class).getResultList();
   }
   
   public List<Artist> getArtistsList() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();   
        
    return session.createQuery("SELECT a FROM Artist a", Artist.class).getResultList();
   }
 }
