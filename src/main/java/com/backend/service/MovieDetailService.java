package com.backend.service;

import com.backend.dto.movieDTO.MovieResponse;
import com.backend.dto.movieDTO.MovieRequest;
import com.backend.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface MovieDetailService {
    List<MovieResponse> getAllMovieDetails();

    MovieResponse getMovieDetailsByID(UUID id);

    MovieResponse create(MovieRequest request);

    MovieResponse update(UUID id, MovieRequest request);

   List<MovieResponse>  searchMovie(String title);
}
