package com.springboot.finapp.service;

import com.springboot.finapp.model.User;
import com.springboot.finapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        // Generate UUID server-side
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }
}