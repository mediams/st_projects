package com.example.demospringex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DeleteTextToWeb {
    @GetMapping("/delete")
    @ResponseBody
    public String deleteTextToWeb() {
        return "textToWeb";
    }

    @GetMapping("/greet")
    public String deleteTextToWeb2(@RequestParam(name = "name", required = false, defaultValue = "Gast") String name, Model model) {
        model.addAttribute("message", "Hello " + name  );
        return "textToWeb2";
    }

}
