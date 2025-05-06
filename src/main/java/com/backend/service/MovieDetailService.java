package com.backend.service;

import com.backend.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieDetailService {
    List<Movie> getAllMovieDetails();

    Optional<Object> getMovieDetailsByID(Long id);
}
