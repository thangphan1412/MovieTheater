package com.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID movieId;
    private String title;
    private String director;
    private Date releaseDate;
    private String performer;
    private String category;
    private String country;
    private String language;
    private int duration;
    private String image;


    //showtime
    @OneToMany(mappedBy = "movie")
    private List<Showtime> showtimes;

    // user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
