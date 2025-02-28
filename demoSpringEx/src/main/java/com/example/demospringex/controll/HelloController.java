package com.example.demospringex.controll;

import com.example.demospringex.ClientStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "\"Привет, Spring Boot!\"";
    }

    @GetMapping("/hello/{name}")
    public String greetUser(@PathVariable String name) {
        return "Привет, " + name + "!";
    }

    @GetMapping("/greet")
    public String greetWithParam(@RequestParam(name = "name", defaultValue = "Гость") String name) {
        return "Привет, " + name + "!";
    }

    public void test() {
        ClientStatus running = ClientStatus.ACTIVE;
    }
}
