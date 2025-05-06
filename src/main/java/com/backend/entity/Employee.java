package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String employeeId;
    private String fullName;
    private String email;
    private String account;
    private String password;
    private String phone;
    private boolean sex;
    private String idCitizenCard;
    private String shift;

    // admin
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id", nullable = false)
    private AdminMovie adminMovie;
    // trasaction
    @OneToMany(mappedBy = "employee")
    private List<Transactiones> transactiones;
}
