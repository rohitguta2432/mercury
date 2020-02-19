package com.api.mercury.service;

import com.api.mercury.dto.UserDTO;
import com.api.mercury.dtosmapper.UserMapper;
import com.api.mercury.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserDTO save(UserDTO userDTO) {
        log.info("save user");
        return UserMapper.INSTANCE.userToUserDTO(userRepository.save(UserMapper.INSTANCE.UserDtoToUser(userDTO)));
    }
    public UserDTO get(UUID id){
        log.info("fetch user by id");
        return UserMapper.INSTANCE.userToUserDTO(userRepository.findById(id).get());
    }
}
