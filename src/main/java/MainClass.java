
import Hibernate.HibernateUtil;
import Models.GenreModel;
import entities.Album;
import entities.FakeRepository;
import entities.Genre;
import java.text.ParseException;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author Стефан Станев
 */
public class MainClass extends FakeRepository{
  
    public static void main(String[] args) throws ParseException {
      
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

       //Album addNewAlbum = new Album("Whitesnake", null);
        //Artist addNewArtist = new Artist ("Yelawolf", "Rap");
        //Song addNewSong = new Song("Children of the night", 8, 9);
        //Genre addNewGenre = new Genre("Soul");

        //session.save(addNewGenre);        
        //System.out.println("Object successfully committed!!");
        
        List<Album> albList = session.createQuery("SELECT a FROM Album a", Album.class).getResultList();
        
        GenreModel gModel = new GenreModel();
                
        for (Genre a : gModel.genresList) {
            System.out.println("Genre - " + a.getName());
        }
        
        //session.getTransaction().commit();
        HibernateUtil.shutdown();         
    } 
      
}
