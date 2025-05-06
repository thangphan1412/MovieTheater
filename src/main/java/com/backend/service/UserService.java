package com.backend.service;

import com.backend.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> findAll();

    UserDetails getUserByEmail(String email);

    UserDetails getUserById(Long id);

    Optional<User> findById(Long id);
}
