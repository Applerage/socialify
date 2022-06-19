package socialify.postservice.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.sql.Timestamp;

@Document(collection = "Posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String postId;
    @Field
    private String userId;
    @Field
    private String song;
    @Field
    private String text;
    @Field
    private String time;

    public Post(){

    }


    public Post(String user, String song, String text) {
        this.userId = user;
        this.song = song;
        this.text = text;
        this.time = String.valueOf(new Timestamp(System.currentTimeMillis()));
    }

    public String getSong() {
        return song;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    public String getUserId() {
        return userId;
    }

    public String getPostId() {
        return postId;
    }

    @Override
    public String toString(){
        return String.format("Post[id='%s', song='%s', text='%s', time='%s', userId='%s']", postId, song, text, time, userId);
    }
}
