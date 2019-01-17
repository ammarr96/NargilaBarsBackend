package com.nargilabars.demo.controllers;

import com.nargilabars.demo.models.Rating;
import com.nargilabars.demo.models.User;
import com.nargilabars.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public User getUser(@PathVariable(name = "id") Long userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/getbyemail/{email}")
    public User getUserByEmail(@PathVariable(name = "email") String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping(value="/insertUser")
    public User insertUser(@Valid @RequestBody final User u) {
        return userService.insertUser(u);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable(name = "id") Long id) { userService.deleteUser(id);}

}
