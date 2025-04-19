package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String numberPhone;
}
