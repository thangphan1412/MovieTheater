package com.backend.reponsitory;

import com.backend.dto.employeeDTO.EmployeeRequest;
import com.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface EmployeeReposotory extends JpaRepository<Employee, UUID> {
    Optional<Employee> findByEmployeeId(UUID employeeID);
    Employee save(Employee employee);

//    void delete(EmployeeRequest request);
}
