package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "adminMovie")
@ToString
@Entity
public class AdminMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID movieAdminId;
    private String fullName;
    private String email;
    private String userName;
    private String password;
    private String numberPhone;
    private String address;

    // employee
    @OneToMany(mappedBy = "adminMovie")
    private List<Employee> employees;
}
