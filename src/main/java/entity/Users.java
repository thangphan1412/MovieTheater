package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Users {
    @Id
    private int idUser;
    private String username;
    private String password;
    private String confirmPassword;
    private String fullName;
    private String email;
    private String numberPhone;
    private Date dateOfBirth;
    private double sex;
}
