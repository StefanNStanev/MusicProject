package Models;

import entities.FakeRepository;
import entities.Genre;
import java.util.List;

/**
 *
 * @author Стефан Станев
 */
public class GenreModel extends FakeRepository{
    public String name;
    public int genreId;   
    
    public List<Genre> genresList = getGenresList();


}
