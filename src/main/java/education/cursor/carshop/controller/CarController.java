package education.cursor.carshop.controller;

import education.cursor.carshop.controller.dto.CarDTO;
import education.cursor.carshop.controller.dto.Response;
import education.cursor.carshop.service.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.stream.Collectors;

@Validated
@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final ICarService carService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public Response submitNewCar(@RequestBody @NotNull @Valid CarDTO carDTO) {
        carService.saveNewCar(carDTO);
        return Response.
                builder()
                .message("Your Car Was kindly saved")
                .info(Collections.singletonMap("Random value",42)).build();
    }

    @Transactional(readOnly = true)
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Response getAllBeers() {
        return Response.builder()
                .message("Here you have all cars from")
                .info(Collections.singletonMap("cars",carService.getAllCarsAsStream()
                        .collect(Collectors.toList())))
                .build();
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Response getCarById(@PathVariable("id") Long id) {
        return Response.builder()
                .message(String.format("Here what we found by provided id: %d",id))
                .info(Collections.singletonMap("car",carService.getCarById(id)))
                .build();
    }

}
