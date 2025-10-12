package com.backend.service;

import com.backend.dto.employeeDTO.EmployeeRequest;
import com.backend.dto.employeeDTO.EmployeeResponse;
import com.backend.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface EmployeeService {
    // Employee
     List<Employee> getAllEmployees();
    Optional<Employee> findById(UUID employeeId);
    EmployeeResponse create(EmployeeRequest request);
    Employee updateEmployee(Employee employee,EmployeeRequest request);
    void deteleEmployee(Employee employee);
//    Employee delete(EmployeeRequest request);
}
