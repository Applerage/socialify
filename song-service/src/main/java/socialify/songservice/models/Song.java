package socialify.songservice.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;

@Document(collection = "Songs")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String songId;
    @Field
    private String name;
    @Field
    private String artist;
    @Field
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

    public String getSongId() {
        return songId;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString(){
        return String.format("Song[id='%s', name='%s', artist='%s', album='%s']", songId, name, artist, album);
    }
}
