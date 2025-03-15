package entity;

import jakarta.persistence.*;
import lombok.*;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String password;

    private String fullName;
    private String email;
    private String numberPhone;



    // one to one with ticket
    @OneToOne(mappedBy = "users")
    private Ticket ticket;
    // one to one payment
    @OneToOne(mappedBy = "users")
    private Payment payment;
    //transaction
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private Transactiones transactionss;
}
