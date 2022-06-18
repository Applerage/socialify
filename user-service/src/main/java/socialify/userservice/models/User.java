package socialify.userservice.models;

import javax.persistence.*;

@Entity
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

   // @Column(name = "id")
    private Long userId;
    //@Column(name = "username")
    private String username;
    //@Column(name="email")
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

    public Long getUserId() {
        return userId;
    }
}
