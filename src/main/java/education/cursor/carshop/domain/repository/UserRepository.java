package education.cursor.carshop.domain.repository;

import education.cursor.carshop.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
