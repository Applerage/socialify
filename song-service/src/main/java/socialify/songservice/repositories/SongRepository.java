package socialify.songservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import socialify.songservice.models.Song;

public interface SongRepository extends MongoRepository<Song, String> {
    Song findBySongId(String id);
}
