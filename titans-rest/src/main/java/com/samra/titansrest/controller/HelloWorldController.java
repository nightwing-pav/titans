package com.samra.titansrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping
    public String sayHello() {
        return "Hello Jaspreet how are you ?";
    }

    @GetMapping("/response")
    public String response() {
        return "I am fine how are you ?";
    }
}
