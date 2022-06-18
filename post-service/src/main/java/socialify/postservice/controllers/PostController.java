package socialify.postservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import socialify.postservice.VO.ResponseTemplateVO;
import socialify.postservice.models.Post;
import socialify.postservice.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/save")
    public Post savePost(@RequestBody Post post){
        return postService.savePost(post);
    }

    @GetMapping("/user/{id}")
    public ResponseTemplateVO getPostWithUser(@PathVariable("id") Long postId){
        return postService.getPostWithUser(postId);
    }

    @GetMapping("/{id}")
    public Post findPostById(@PathVariable("id") Long postId){ return postService.findPostById(postId); }

}
