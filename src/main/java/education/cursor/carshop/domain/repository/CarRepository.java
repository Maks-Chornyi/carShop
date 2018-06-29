package education.cursor.carshop.domain.repository;

import education.cursor.carshop.domain.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
