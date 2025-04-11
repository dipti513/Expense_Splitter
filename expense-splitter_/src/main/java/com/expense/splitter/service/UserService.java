package com.expense.splitter.service;

import com.expense.splitter.model.User;
import com.expense.splitter.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Add this method to UserService
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Other methods in UserService
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}