package com.liberin.lyttl.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/getmessage")
    @PreAuthorize("hasRole('')")
    public String getMessage(){
        return "Hello, I am your Dashboard Page";
    }
}
