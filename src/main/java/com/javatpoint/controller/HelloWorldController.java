package com.javatpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloWorldController {


    @GetMapping("/app")
    public String hello() {
        return "Hello Divyaraj welcome to DevOps world !!!!!";
    }
}
