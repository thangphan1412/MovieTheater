package com.backend.service.impl;

import com.backend.entity.User;
import com.backend.reponsitory.UserRepository;
import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDetails getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }

    @Override
    public UserDetails getUserById(String id) {
        return null;
    }
}
