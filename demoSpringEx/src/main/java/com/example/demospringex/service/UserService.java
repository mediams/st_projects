package com.example.demospringex.service;

import com.example.demospringex.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User findById(Long id);

    List<User> getAllUsers();

    User update(User user);

    void deleteUser(Long id);
}
