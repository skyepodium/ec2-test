package com.example.ec2test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloConrtoller {

    @GetMapping
    public String hello() {
        return "Hello Spring";
    }
}
