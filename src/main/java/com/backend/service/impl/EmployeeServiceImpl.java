package com.backend.service.impl;

import com.backend.dto.employeeDTO.EmployeeRequest;
import com.backend.entity.AdminMovie;
import com.backend.entity.Employee;
import com.backend.reponsitory.AdminMovieRepository;
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
    @Autowired
    private AdminMovieRepository adminMovieRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeReposotory.findAll();
    }

    @Override
    public Optional<Employee> findById(Long employeeId) {
        return employeeReposotory.findByEmployeeId(employeeId);
    }

    @Override
    public Employee create(EmployeeRequest request) {
        // kiem tra xem amin đã tồn tại trong database
        AdminMovie adminMovie = adminMovieRepository.findById(request.getAdminMovieId())
                .orElseThrow(() -> new RuntimeException("AdminMovie not found with ID" ));
        Employee employee = new Employee();
        employee.setFullName(request.getFullName());
        employee.setEmail(request.getEmail());
        employee.setAccount(request.getAccount());
        employee.setPassword(request.getPassword());
        employee.setPhone(request.getPhone());
        employee.setSex(request.isSex());
        employee.setIdCitizenCard(request.getIdCitizenCard());
        employee.setShift(request.getShift());
        employee.setAdminMovie(adminMovie);
        return employeeReposotory.save(employee);
    }
}
