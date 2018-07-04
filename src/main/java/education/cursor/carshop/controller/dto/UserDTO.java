package education.cursor.carshop.controller.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserDTO {

    @NotNull(message = "First Name can not be null")
    private String firstName;

    @NotNull(message = "Last Name can not be null")
    private String lastName;

    @Size(min = 5, max = 255, message = "From 5 to 255 chars")
    @NotNull(message = "Login can not be null")
    private String login;

    @Size(min = 5, max = 20, message = "From 5 to 20 chars")
    @NotNull(message = "Password can not be null")
    private String password;

    @Size(min = 9, max = 14, message = "telephone length should be from 9 to 14 chars")
    @NotNull(message = "Anyone will want contact with you. So telephone can not be null")
    private String telephone;

}
