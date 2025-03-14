package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admin_movie")
@ToString
@Entity
public class AdminMovie {
    @Id
    private int idAdminMovie;
    private String fullName;
    private String email;
    private String userName;
    private String password;
    private String numberPhone;
    private String address;

}
