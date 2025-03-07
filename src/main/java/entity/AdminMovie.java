package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
