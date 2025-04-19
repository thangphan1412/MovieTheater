package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
@ToString
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;
    private double price;
    private Date purchaseDate;
    private Boolean status;

    // one to one with user
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_User", referencedColumnName = "userId")
    private User users;
    // foot
    @OneToMany(mappedBy = "ticket")
    private List<Foots> foots;
    //transaction
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id")
    private Transactiones transactiones;
    //showtim
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "showtime_id", referencedColumnName = "showtimeId")
    private Showtime showtime;
    //seat
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seat_id", referencedColumnName = "seatId")
    private Seat seat;
}
