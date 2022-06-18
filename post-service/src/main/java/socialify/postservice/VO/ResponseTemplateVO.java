package socialify.postservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import socialify.postservice.models.Post;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Post post;

    public void setUser(User user){
        this.user = user;
    }

    public void setPost(Post post){
        this.post = post;
    }

}
