package com.backend.service;

import com.backend.dto.userDTO.UserResponse;
import com.backend.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface UserService {
    List<UserResponse> findAllUser();

    UserDetails getUserByEmail(String email);

    UserDetails getUserById(UUID id);

    Optional<User> findById(UUID id);
}
