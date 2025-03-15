package entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admin_movie")
@ToString
@Entity
public class AdminMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieAdminId;
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
