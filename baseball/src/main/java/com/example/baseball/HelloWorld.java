package com.example.baseball;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {
    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}