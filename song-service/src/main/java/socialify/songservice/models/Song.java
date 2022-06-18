package socialify.songservice.models;

import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //@Column(name = "id")
    private Long songId;
    //@Column(name = "name")
    private String name;
    //@Column(name = "artist")
    private String artist;
    //@Column(name = "album")
    private String album;

    public Song(){

    }

    public Song(String name, String artist, String album) {
        this.name = name;
        this.artist = artist;
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public Long getSongId() {
        return songId;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }
}
