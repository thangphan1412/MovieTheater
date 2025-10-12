package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "theater")
@ToString
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID theaterId;
    private String theaterName;
    private int totalNumberOfSeats;

    //seat
    @OneToMany(mappedBy = "theater")
    private List<Seat> seats;
    //showtime
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "showtime_id")
    private Showtime showtime;
}
