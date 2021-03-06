package com.easyidentitygenerator.usergenerator.controller;

import com.easyidentitygenerator.usergenerator.entities.User;
import com.easyidentitygenerator.usergenerator.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<User> getUser(){
        return ResponseEntity.ok(userService.getUser());
    }
}
