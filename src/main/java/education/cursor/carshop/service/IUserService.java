package education.cursor.carshop.service;

import education.cursor.carshop.controller.dto.UserDTO;
import education.cursor.carshop.domain.model.User;

public interface IUserService {

    void saveNewUser(UserDTO userDTO);
}
