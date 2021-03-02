package Services;

import entities.Genre;
import entities.IRepository;
import Models.GenreModel;

/**
 *
 * @author Стефан Станев
 */
public class GenreService {
    private IRepository _repository;
    
    
    public GenreModel getGenre(int id){
       Genre genre = _repository.getGenre(id);
       GenreModel result = new GenreModel();
       
       result.genreId = genre.getGenreId();
       result.name = genre.getName();
       
       return result;
    }
    
    public GenreService(IRepository repository) {
        _repository = repository;
    }
}
