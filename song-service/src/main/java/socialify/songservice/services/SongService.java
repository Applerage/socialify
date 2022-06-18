package socialify.songservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import socialify.songservice.models.Song;
import socialify.songservice.repositories.SongRepository;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    public Song findSongById(Long songId) {
        return songRepository.findBySongId(songId);
    }
}
