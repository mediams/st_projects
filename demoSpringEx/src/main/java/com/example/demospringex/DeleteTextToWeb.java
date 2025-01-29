package com.example.demospringex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTextToWeb {
    @GetMapping("/delete")
    @ResponseBody
    public String deleteTextToWeb() {
        return "textToWeb";
    }

}
