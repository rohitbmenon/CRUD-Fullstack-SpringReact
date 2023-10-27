package com.examplemenon.userbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examplemenon.userbackend.model.User;
import com.examplemenon.userbackend.repo.UserRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    
    @Autowired
    private UserRepo userRepo;

    // Sending the data into the database
    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return this.userRepo.save(newUser);
    }

    // Getting all the users in the database
    @GetMapping("/user")
    List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/user/{id}")
    Optional<User> getUserById (@PathVariable Long id) {
        return userRepo.findById(id);    
    }

    @PutMapping("/user/{id}")
    Optional<Object> updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepo.findById(id)
            .map(user -> {
                user.setName(newUser.getName());
                user.setEmail(newUser.getEmail());
                user.setUsername(newUser.getUsername());
                return userRepo.save(user);
            });
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        userRepo.deleteById(id);
        return "User with id" + id+ "has been deleted";
    }


}
