package education.cursor.carshop.service.impl;

import education.cursor.carshop.controller.dto.UserDTO;
import education.cursor.carshop.domain.model.User;
import education.cursor.carshop.domain.repository.UserRepository;
import education.cursor.carshop.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    @Autowired
    UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveNewUser(UserDTO userDTO) {
        userRepository.save(User.builder()
                .firstName(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .login(userDTO.getLogin())
                .password(userDTO.getPassword())
                .telephone(userDTO.getTelephone())
            .build());
    }
}
