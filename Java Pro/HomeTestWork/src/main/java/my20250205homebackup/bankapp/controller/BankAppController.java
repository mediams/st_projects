package de.telran.bankapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAppController {

    @GetMapping("/home")
    public String welcomeMessage() {
        return "Welcome to my bank app main page!";
    }

}
