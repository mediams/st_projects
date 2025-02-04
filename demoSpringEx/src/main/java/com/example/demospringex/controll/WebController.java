package com.example.demospringex.controll;

import com.example.demospringex.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("welcome")
public class WebController {
    List<User> users = new ArrayList<User>(List.of(
            new User("Alice", 30, "alice@example.com"),
            new User("Bob", 25, "bob@example.com"),
            new User("Charlie", 35, "charlie@example.com")
    ));

    @GetMapping("/")
    public String welcome() {
        return "Добро пожаловать в Spring Boot!";
    }

    @GetMapping("/greetings")
    public String greet(@RequestParam(name = "name", defaultValue = "Гость!") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/userses")
    public List<User> getUsers() {
        return users;
    }

    @GetMapping("/userses/{name}")
    public ResponseEntity<User> getUser(@PathVariable String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/userses/{name}")
    public ResponseEntity<User> updateUser(@PathVariable String name, @RequestBody User user) {
        for (User user1 : users) {
            if (user1.getName().equals(name)) {
                user1.setAge(user.getAge());
                user1.setEmail(user.getEmail());
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
