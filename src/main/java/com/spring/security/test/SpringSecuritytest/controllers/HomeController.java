package com.spring.security.test.SpringSecuritytest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {


    @GetMapping("/normal")
    public ResponseEntity<String> normalUser(){
        return ResponseEntity.ok("Yes i am a normal user!");

    }
    @GetMapping("/public")
    public ResponseEntity<String> publicUser(HttpStatus httpStatus){
        return ResponseEntity.status(HttpStatus.CREATED).body("Yes, I am a public user!");
    }
    @GetMapping("/admin")
    public ResponseEntity<String> AdminUser(){
        return ResponseEntity.ok("Yes i am  admin!");
    }



}
