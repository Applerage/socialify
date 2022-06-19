package socialify.postservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import socialify.postservice.models.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    Post findUserByPostId(String postId);

    Post findByPostId(String postId);
}
