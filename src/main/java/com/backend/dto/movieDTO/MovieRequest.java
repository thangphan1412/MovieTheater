package com.backend.dto.movieDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
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
    private Long userssId;
    private String userName;
}
