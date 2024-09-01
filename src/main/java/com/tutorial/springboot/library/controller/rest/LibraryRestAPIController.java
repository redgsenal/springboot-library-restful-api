package com.tutorial.springboot.library.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LibraryRestAPIController {

    @GetMapping("/hello")
    public String hello(){
        return "hello there!";
    }
}
