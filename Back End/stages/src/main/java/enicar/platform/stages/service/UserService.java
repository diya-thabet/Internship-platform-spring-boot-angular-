package enicar.platform.stages.service;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.UserDTO;
import enicar.platform.stages.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return DTOConverter.toUserDTOList(userRepository.findAll());
    }
}