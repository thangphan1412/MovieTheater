package com.backend.service;

import com.backend.dto.employeeDTO.EmployeeRequest;
import com.backend.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
     List<Employee> getAllEmployees();
    Optional<Employee> findById(Long employeeId);
    Employee create(EmployeeRequest request);
    Employee updateEmployee(Employee employee,EmployeeRequest request);

    void deteleEmployee(Employee employee);
//    Employee delete(EmployeeRequest request);
}
