package com.example.demo;   // 👈 SAME package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Elastic Beanstalk new version v1!";
    }
}
