package com.nargilabars.demo.controllers;

import com.nargilabars.demo.models.User;
import com.nargilabars.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getRating(@PathVariable(name = "id") Long userId) {
        return userService.getUserById(userId);
    }

}
