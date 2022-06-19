package socialify.userservice.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;

@Document(collection = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Field
    private String userId;
    @Field
    private String username;
    @Field
    private String email;

    public User(){

    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }
    @Override
    public String toString(){
        return String.format("Post[id='%s', username='%s', email='%s']", userId, username, email);
    }
}
