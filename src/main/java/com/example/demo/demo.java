package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @GetMapping
    public String demo(){
        System.out.println("good start");
        return "Hello World";
    }
}
