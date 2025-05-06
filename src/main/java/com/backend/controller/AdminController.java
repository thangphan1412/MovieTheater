package com.backend.controller;

import com.backend.entity.Employee;
import com.backend.entity.User;
import com.backend.service.EmployeeService;
import com.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Optional<User> getUserById(@PathVariable String id) {
        return userService.findById(id);
    }


    //// lay nhan vien
    @GetMapping("/allEmployee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return employeeService.findById(id);
    }
    // tao nhan vien
    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.creat(employee);
    }

}
