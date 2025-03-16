package com.example.demospringex.mapper;

import com.example.demospringex.dto.UserDto;
import com.example.demospringex.entity.User;

public class UserMapper {
    //Convert User JPA into UserDto
    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
        return userDto;
    }

    // Convert  UserDto into User JPA Entity
    public static User mapToUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail()
        );
        return user;
    }
}
