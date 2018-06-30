package education.cursor.carshop.controller.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
public class CarDTO {

    @NotNull(message = "Price can not be null")
    private Double price;

    @NotNull(message = "Year can not be null")
    private Integer year;

    @Size(min = 1, max = 255, message = "From 1 to 255 chars")
    @NotNull(message = "Type can not be null")
    private String type;

    @Size(min = 1, max = 255, message = "From 1 to 255 chars")
    @NotNull(message = "MOdel can not be null")
    private String model;

    @Size(min = 1, max = 255, message = "From 1 to 255 chars")
    @NotNull(message = "Mark can not be null")
    private String mark;

    @Size(min = 1, max = 255, message = "From 1 to 255 chars")
    @NotNull(message = "Country of Registration can not be null")
    private String countryOfRegistration;

    @Size(min = 1, max = 255, message = "From 1 to 255 chars")
    @NotNull(message = "Price can not be null")
    private String description;
}
