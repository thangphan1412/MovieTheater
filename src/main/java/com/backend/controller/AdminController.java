package com.backend.controller;

import com.backend.dto.employeeDTO.EmployeeRequest;
import com.backend.entity.AdminMovie;
import com.backend.entity.Employee;
import com.backend.entity.User;
import com.backend.service.EmployeeService;
import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeService employeeService;


    // lay user
    @GetMapping("/allUser")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }


    //// lay nhan vien
    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.findById(id);
    }
    // tao nhan vien
    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeRequest request) {
        Employee savedEmployee = employeeService.create(request);
        return ResponseEntity.ok(savedEmployee);
    }
    // xoa nhan vien
//    @DeleteMapping("/employee/{id}")
//    public ResponseEntity<Employee> deleteEmployee(@RequestBody EmployeeRequest request) {
//        Employee deEmployee = employeeService.delete(request);
//        return ResponseEntity.ok(deEmployee);
//    }
}
