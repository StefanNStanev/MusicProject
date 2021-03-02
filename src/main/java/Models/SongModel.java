package Models;

import entities.FakeRepository;
import entities.Song;
import java.util.List;

public class SongModel extends FakeRepository {
    
    public String name;
    public int albumId;
    public int artistId;
    public List<Song> songsList = getSongsList();
 
    
}
