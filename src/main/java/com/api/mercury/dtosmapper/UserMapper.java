package com.api.mercury.dtosmapper;

import com.api.mercury.dto.UserDTO;
import com.api.mercury.model.Users;
import org.apache.catalina.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

/*    @Mapping(source = "userId",target = "id")
    @Mapping(source = "userFirstName",target = "firstName")
    @Mapping(source = "userLastName",target = "lastName")
    UserDTO userListToUserDTO(List<Users> users);*/

    @Mapping(source = "userId",target = "id")
    @Mapping(source = "userFirstName",target = "firstName")
    @Mapping(source = "userLastName",target = "lastName")
    Users UserDtoToUser(UserDTO userDTO);

    @Mapping(source = "id",target = "userId")
    @Mapping(source = "firstName",target = "userFirstName")
    @Mapping(source = "lastName",target = "userLastName")
    UserDTO userToUserDTO(Users user);

}
