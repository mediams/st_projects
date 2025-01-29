package com.example.demospringex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    List<User> users = new ArrayList<User>(List.of(
            new User("Alice", 30, "alice@example.com"),
            new User("Bob", 25, "bob@example.com"),
            new User("Charlie", 35, "charlie@example.com")
    ));

    @GetMapping("/users")
//    – вернуть список всех пользователей.
    public List<User> getUsers() {
        return users;
    }


}
