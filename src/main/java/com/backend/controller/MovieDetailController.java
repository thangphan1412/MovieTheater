package com.backend.controller;

import com.backend.entity.Movie;
import com.backend.service.MovieDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cinemas")
public class MovieDetailController {
    @Autowired
    private MovieDetailService movieDetailService;

    @GetMapping()
    public List<Movie> getAllMovieDetails() {
        return movieDetailService.getAllMovieDetails();
    }

    @GetMapping("/{id}")
    public Optional<Object> getMovieDetail(@PathVariable Long id) {
        return movieDetailService.getMovieDetailsByID(id);
    }
}
