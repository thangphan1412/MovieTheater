package com.backend.dto.movieDTO;

import lombok.*;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MovieRequest {
    private String title;
    private String director;
    private Date releaseDate;
    private String performer;
    private String category;
    private String country;
    private String language;
    private int duration;
    private String image;
    private UUID userId;
    private String userName;
}
