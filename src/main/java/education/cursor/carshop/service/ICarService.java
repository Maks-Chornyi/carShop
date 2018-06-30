package education.cursor.carshop.service;

import education.cursor.carshop.controller.dto.CarDTO;
import education.cursor.carshop.domain.model.Car;

import java.util.stream.Stream;
//import org.springframework.security.core.userdetails.UserDetailsService;

public interface ICarService {
    void saveNewCar(CarDTO carDTO);

    Stream<Car> getAllCarsAsStream();

    Car getCarById(Long carId);
}
