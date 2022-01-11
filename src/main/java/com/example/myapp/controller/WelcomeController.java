package com.example.myapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    private String welcome(){
        return "Hello!!!";
    }

    @GetMapping(value = "/about")
    private Integer getAge(){
        return 5;
    }
}
