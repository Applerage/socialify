package socialify.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import socialify.userservice.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUserId(String userId);
}
