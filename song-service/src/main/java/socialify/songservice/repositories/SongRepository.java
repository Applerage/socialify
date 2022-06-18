package socialify.songservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import socialify.songservice.models.Song;

public interface SongRepository extends JpaRepository<Song, Long> {
    Song findBySongId(Long songId);
}
