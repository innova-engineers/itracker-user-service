package com.innova.userservice.service.impl;

import com.innova.userservice.beans.User;
import com.innova.userservice.repository.UserRepository;
import com.innova.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findById(email).orElse(null);
    }
}
