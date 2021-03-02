package Models;

import entities.Artist;
import entities.FakeRepository;
import java.util.List;

public class ArtistModel extends FakeRepository{
    
    public String name;
    public String genre;
    public List<Artist> artistsList = getArtistsList();
  
    
}
