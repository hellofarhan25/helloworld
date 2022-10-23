package com.example.helloworld.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> insert() {
        return new ResponseEntity<>("Hello Farhan", HttpStatus.OK);
    }

}
