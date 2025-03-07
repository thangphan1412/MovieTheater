package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employees {
    @Id
    private int idEmployee;
    private String fullName;
    private String email;
    private String account;
    private String password;
    private String phone;
    private boolean sex;
    private String idCitizenCard;
}
