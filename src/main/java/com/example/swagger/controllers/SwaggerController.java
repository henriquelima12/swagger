package com.example.swagger.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @GetMapping("/swagger")
    public ResponseEntity<String> HelloWorld() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/teste")
    public ResponseEntity<String> Teste() {
        return new ResponseEntity<>("Teste!", HttpStatus.OK);
    }
    
}
