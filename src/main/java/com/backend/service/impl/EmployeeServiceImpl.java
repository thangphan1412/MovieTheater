package com.backend.service.impl;

import com.backend.entity.Employee;
import com.backend.reponsitory.EmployeeReposotory;
import com.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeReposotory employeeReposotory;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeReposotory.findAll();
    }

    @Override
    public Optional<Employee> findById(String employeeId) {
        return employeeReposotory.findByEmployeeId(employeeId);
    }

    @Override
    public Employee creat(Employee employee) {
        return employeeReposotory.save(employee);
    }
}
