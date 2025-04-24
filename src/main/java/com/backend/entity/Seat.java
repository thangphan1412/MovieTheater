package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="seat")
@ToString
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String seatId;
    private int row;
    private int numberSeat;
    private boolean status;

    //ticket
    @OneToOne(mappedBy = "seat")
    private Ticket ticket;
    //theater
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "theater_id")
    private Theater theater;
}
