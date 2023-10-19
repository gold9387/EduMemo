package com.edu.memo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/test1")
    public String home() {
        return "Home Page";
    }

    @GetMapping("/test2")
    public String home2() {
        return "Home Page2";
    }
}
