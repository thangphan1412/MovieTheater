package com.backend.reponsitory;

import com.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeReposotory extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmployeeId(Long employeeID);
    Employee save(Employee employee);
}
