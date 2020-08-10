package com.example.jieun.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/love")
    public String hello() {
        return "loveforyou";
    }

    @GetMapping("/Greetings")
    public String hi() {
        return "greets";
    }
}

