package com.backend.dto.movieDTO;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
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
