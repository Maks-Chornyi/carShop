package education.cursor.carshop.domain.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "CARS")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "YEAR")
    private Integer year;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "MARK")
    private String mark;

    @Column(name = "COUNTRY_OF_REGISTRATION")
    private String countryOfRegistration;

    @Column(name = "DESCRIPTION")
    private String description;
}
