package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "showtime")
public class Showtime {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String showtimeId;
    private Time startTime;
    private Time endTime;

    // tiket
    @OneToOne(mappedBy = "showtime")
    private Ticket ticket;
    //theater
    @OneToMany(mappedBy = "showtime")
    private List<Theater> theaters;
    //movie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
