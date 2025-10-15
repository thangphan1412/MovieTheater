package com.backend.service.impl;

import com.backend.dto.employeeDTO.EmployeeRequest;
import com.backend.dto.employeeDTO.EmployeeResponse;
import com.backend.entity.AdminMovie;
import com.backend.entity.Employee;
import com.backend.reponsitory.AdminMovieRepository;
import com.backend.reponsitory.EmployeeReposotory;
import com.backend.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeReposotory employeeReposotory;
    @Autowired
    private AdminMovieRepository adminMovieRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeReposotory.findAll();
    }

    @Override
    public Optional<Employee> findById(UUID employeeId) {
//        return employeeReposotory.findByEmployeeId(employeeId);
        return null;
    }

   @Override
    public EmployeeResponse create(EmployeeRequest employeeRequest) {
        Employee employee = modelMapper.map(employeeRequest, Employee.class);
        Employee saved =    employeeReposotory.save(employee);
       EmployeeResponse response = modelMapper.map(saved, EmployeeResponse.class);
       response.setEmail("Created successfully!");
       return response;
   }

//    @Override
//    public Employee create(EmployeeRequest request) {
//        // kiem tra xem amin đã tồn tại trong database
//        AdminMovie adminMovie = adminMovieRepository.findById(request.getAdminMovieId())
//                .orElseThrow(() -> new RuntimeException("AdminMovie not found with ID" ));
//        Employee employee = new Employee();
//        employee.setFullName(request.getFullName());
//        employee.setEmail(request.getEmail());
//        employee.setAccount(request.getAccount());
//        employee.setPassword(request.getPassword());
//        employee.setPhone(request.getPhone());
//        employee.setSex(request.isSex());
//        employee.setIdCitizenCard(request.getIdCitizenCard());
//        employee.setShift(request.getShift());
//        employee.setAdminMovie(adminMovie);
//        return employeeReposotory.save(employee);
//    }

    @Override
    public Employee updateEmployee(Employee employee,EmployeeRequest request) {

        employee.setFullName(request.getFullName());
        employee.setEmail(request.getEmail());
        employee.setAccount(request.getAccount());
        employee.setPassword(request.getPassword());
        employee.setPhone(request.getPhone());
        employee.setSex(request.isSex());
        employee.setIdCitizenCard(request.getIdCitizenCard());
        employee.setShift(request.getShift());
        return employeeReposotory.save(employee);
    }

    @Override
    public void deteleEmployee(Employee employee) {
//        AdminMovie adminMovie = adminMovieRepository.findById(employee.getEmployeeId());
        employeeReposotory.delete(employee);
    }

//    @Override
//    public Employee delete(EmployeeRequest request) {
//        // kiem tra admin
//        AdminMovie adminMovie = adminMovieRepository.findById(request.getAdminMovieId())
//                .orElseThrow(() -> new RuntimeException("AdminMovie not found with ID" ));
//        employeeReposotory.delete(request);
//        return null;
//    }
}
