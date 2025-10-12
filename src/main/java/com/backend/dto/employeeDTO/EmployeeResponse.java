package com.backend.dto.employeeDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class EmployeeResponse {
    private Long employeeId;
    private String fullName;
    private String email;
    private String account;
    private String password;
    private String phone;
    private boolean sex;
    private String idCitizenCard;
    private String shift;
}
