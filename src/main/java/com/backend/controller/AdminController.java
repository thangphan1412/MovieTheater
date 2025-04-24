package com.backend.controller;

import com.backend.entity.User;

import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/allUser")
    public List<User> getAllUsers() {
        return userService.findAll();
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<User> getUserDetails(@PathVariable String id) {
//        return ResponseEntity.ok((User) userService.getUserById(id));
//    }
}
