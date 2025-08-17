package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Builder
//@Table(name = "ROLE")
public enum  Role {
    ADMIN, EMPLOYEE, CUSTOMER
}