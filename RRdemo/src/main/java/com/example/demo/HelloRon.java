package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRon {

    @RequestMapping ("/")
    public String home() {
        return "Hello Beautiful Spring Boot!!";
    }
}
