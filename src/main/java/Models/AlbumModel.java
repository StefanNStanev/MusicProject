package Models;

import entities.Album;
import entities.FakeRepository;
import java.util.Date;
import java.util.List;

public class AlbumModel extends FakeRepository{
    public String name;
    public int id;
    public Date releaseDate;
    
    public List<Album> albumssList = getAlbumsList();
    
    
}
