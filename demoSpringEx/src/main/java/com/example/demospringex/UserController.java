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

//    @PostMapping("/users")
////    – добавить нового пользователя (использовать @RequestBody).
//    public String addUser(@ModelAttribute("user") User user) {
//        users.add(user);
//        return "redirect:/users";
//    }

    @GetMapping("/users/{id}")
//    – вернуть пользователя по id.
    public String getUser(@PathVariable int id) {
        return "redirect:/users/" + id;
    }
    
    @DeleteMapping("/users/{id}")
//    – удалить пользователя по id.
    public String deleteUser(@PathVariable int id) {
        users.remove(id);
        return "redirect:/users";
    }



}
