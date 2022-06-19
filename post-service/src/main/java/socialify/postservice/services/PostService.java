package socialify.postservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import socialify.postservice.VO.ResponseTemplateVO;
import socialify.postservice.VO.User;
import socialify.postservice.models.Post;
import socialify.postservice.repositories.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public ResponseTemplateVO getPostWithUser(String postId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Post post = postRepository.findUserByPostId(postId);
        User user =
                restTemplate.getForObject("http://USER-SERVICE/users/" + post.getUserId(),
                        User.class);

        vo.setPost(post);
        vo.setUser(user);

        return vo;
    }

    public Post findPostById(String postId) {
        return postRepository.findByPostId(postId);
    }
}
