package socialify.postservice.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //@Column (name = "id")
    private Long postId;
    //@Column (name = "userId")
    private String userId;
    //@Column (name = "song")
    private String song;
    //@Column (name = "text")
    private String text;
    //@Column (name = "timestamp")
    private Timestamp time;

    public Post(){

    }


    public Post(String user, String song, String text, Timestamp time) {
        this.userId = user;
        this.song = song;
        this.text = text;
        this.time = time;
    }

    public String getSong() {
        return song;
    }

    public String getText() {
        return text;
    }

    public Timestamp getTime() {
        return time;
    }

    public String getUserId() {
        return userId;
    }

    public Long getPostId() {
        return postId;
    }
}
