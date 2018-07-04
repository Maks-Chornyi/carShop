package education.cursor.carshop.domain.repository;

import education.cursor.carshop.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE login ?", nativeQuery = true)
    User findByLogin(String login);
}
