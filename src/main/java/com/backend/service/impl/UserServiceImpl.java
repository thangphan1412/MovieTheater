//package com.backend.service.impl;
//
//import com.backend.dto.userDTO.UserResponse;
//import com.backend.entity.User;
//import com.backend.reponsitory.UserRepository;
//import com.backend.service.UserService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @Override
//    public List<UserResponse> findAllUser() {
//        return userRepository.findAll().stream()
//                .map(user -> {
//                    UserResponse userResponse = modelMapper.map(user, UserResponse.class);
//                    return userResponse;
//                }).toList();
//    }
//
//    @Override
//    public UserDetails getUserByEmail(String email) {
//        return userRepository.getUserByEmail(email);
//    }
//
//    @Override
//    public UserDetails getUserById(Long id) {
//        return userRepository.findById(id).orElseThrow(()->new RuntimeException("User Not Found"));
//    }
//
//    @Override
//    public Optional<User> findById(Long id) {
//        return userRepository.findById(id);
//    }
//}
