package education.cursor.carshop.service.impl;

import education.cursor.carshop.controller.dto.CarDTO;
import education.cursor.carshop.domain.model.Car;
import education.cursor.carshop.domain.repository.CarRepository;
import education.cursor.carshop.service.ICarService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class CarService implements ICarService {

    private final CarRepository repository;

    @SneakyThrows
    @Override
    public void saveNewCar(CarDTO carDTO) {
        repository.save(Car.builder()
                .countryOfRegistration(carDTO.getCountryOfRegistration())
                .description(carDTO.getDescription())
                .mark(carDTO.getMark())
                .model(carDTO.getModel())
                .price(carDTO.getPrice())
                .type(carDTO.getType())
                .year(carDTO.getYear())
                .build());
    }

    @Override
    public Stream<Car> getAllCarsAsStream() {
        return repository.getAll();
    }

    @Override
    public Car getCarById(Long carId) {
        return repository
                .findById(carId)
                .orElseThrow(() -> new RuntimeException(String.format("Car with id %d not found",carId)));
    }

}