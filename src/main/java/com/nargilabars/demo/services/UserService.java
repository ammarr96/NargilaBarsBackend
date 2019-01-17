package com.nargilabars.demo.services;

import com.nargilabars.demo.models.User;
import com.nargilabars.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.FileSystemNotFoundException;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new FileSystemNotFoundException("User not found"));
    }

    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    public User insertUser(User user) {
        if (userRepository.findUserByEmail(user.getEmail()) == null) {
            return userRepository.save(user);
        }
        else {
            return userRepository.findUserByEmail(user.getEmail());
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
