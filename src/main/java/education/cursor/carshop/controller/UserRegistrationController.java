package education.cursor.carshop.controller;

import education.cursor.carshop.controller.dto.CarDTO;
import education.cursor.carshop.controller.dto.Response;
import education.cursor.carshop.controller.dto.UserDTO;
import education.cursor.carshop.domain.model.Role;
import education.cursor.carshop.domain.model.User;
import education.cursor.carshop.domain.repository.UserRepository;
import education.cursor.carshop.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.Map;

@Validated
@RequestMapping("/registration")
@Controller
@RequiredArgsConstructor
public class UserRegistrationController {

    private final IUserService userService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public Response submitNewUser(@RequestBody @NotNull @Valid UserDTO userDTO) {
        userService.saveNewUser(userDTO);
        return Response.builder()
                .message(String.format("User with login %s successfully registered",userDTO.getLogin()))
                .info(Collections.singletonMap("I don't know why we are using","this shit"))
                .build();
    }
}
