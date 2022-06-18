package socialify.postservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import socialify.postservice.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Post findUserByPostId(Long postId);

    Post findByPostId(Long postId);
}
