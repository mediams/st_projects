package com.example.demospringex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAppController {


    @GetMapping("/home")
    public String home() {
        return "Test Text on webPage";
    }
}
