package com.example.demospringex.service;

import com.example.demospringex.dto.UserDto;
import com.example.demospringex.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto findById(Long id);

    List<UserDto> getAllUsers();

    UserDto update(UserDto user);

    void deleteUser(Long id);
}
