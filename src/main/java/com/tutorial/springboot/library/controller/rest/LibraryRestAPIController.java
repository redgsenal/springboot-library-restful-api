package com.tutorial.springboot.library.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping("/api/v1")
public class LibraryRestAPIController {

    @GetMapping("/hello")
    public String hello(){
        return "hello there!";
    }

    @PostMapping("/author/{authorId}/publisher/{publisherId}/book")
    public String addNewBook(@PathVariable Long authorId, @PathVariable Long publisherId){
        log.log(Level.INFO, "author id: {}, publisher id: {}", authorId, publisherId);
        return "add new book here! ";
    }
}
