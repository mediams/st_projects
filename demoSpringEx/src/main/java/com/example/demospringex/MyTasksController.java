package com.example.demospringex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyTasksController {

    ClientController c = new ClientController();

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("messageh2", "First Message");
        return "hello";
    }

    @GetMapping("/test")
    @ResponseBody
    public List<Client> test(@RequestParam String name) {
        return c.clients.stream()
                .filter(client -> client.getLastName().equals(name)).findFirst().stream().toList();
    }

    @GetMapping("/test/{id}")
    @ResponseBody
    public List<Client> testId(@PathVariable String id) {
//        ClientController c = new ClientController();
        return c.clients.stream()
                .filter(client -> client.getId().equals(id)).findFirst().stream().toList();
    }
}
