package com.example.demospringex.service;

import com.example.demospringex.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void addUser(User bean) {
        System.out.println("UserService addUser");
    }
}
