package com.example.demospringex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTaskControlleeRest {
    @RequestMapping("/hello2")
    public String hello() {
        return "Hello World!";
    }
}

