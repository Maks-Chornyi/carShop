package education.cursor.carshop.domain.repository;

import education.cursor.carshop.domain.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;

public interface CarRepository extends JpaRepository<Car,Long> {

    @Query(value = "SELECT * FROM cars", nativeQuery = true)
    Stream<Car> getAll();
}
