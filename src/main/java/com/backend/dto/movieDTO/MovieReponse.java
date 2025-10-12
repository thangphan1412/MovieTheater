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
public class MovieReponse {
  private int movieId;
  private String title;
  private String director;
  private Date releaseDate;
  private String category;
  private String country;
  private String language;
  private String userName;
}
