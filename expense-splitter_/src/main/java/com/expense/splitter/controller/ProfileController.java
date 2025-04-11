package com.expense.splitter.controller;

import com.expense.splitter.model.User; // Import the User class
import com.expense.splitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication; // Import the Authentication class
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private UserRepository userRepository;

    @PutMapping
    public ResponseEntity<String> updateProfile(@RequestBody User updatedUser, Authentication authentication) {
        String username = authentication.getName();
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found!"));

        user.setEmail(updatedUser.getEmail());
        user.setPhoneNumber(updatedUser.getPhoneNumber());
        userRepository.save(user);

        return ResponseEntity.ok("Profile updated successfully!");
    }
}