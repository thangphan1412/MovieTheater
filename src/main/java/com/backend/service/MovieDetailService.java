package com.backend.service;

import com.backend.dto.movieDTO.MovieRequest;
import com.backend.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieDetailService {
    List<Movie> getAllMovieDetails();

    Optional<Movie> getMovieDetailsByID(Long id);

    Movie create(MovieRequest request);

    Movie update(Movie movie, MovieRequest request);
}
