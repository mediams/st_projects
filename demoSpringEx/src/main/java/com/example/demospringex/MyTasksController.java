package com.example.demospringex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyTasksController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        return "hello";
    }
}
