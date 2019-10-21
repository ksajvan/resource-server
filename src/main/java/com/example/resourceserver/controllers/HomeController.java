package com.example.resourceserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/public")
    public String publicHello() {
        return "Hi there";
    }

    @GetMapping(value = "/private")
    public String privateHello() {
        return "Hi from inside";
    }
}
