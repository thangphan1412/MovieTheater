package com.backend.controller;

import com.backend.dto.movieDTO.MovieReponse;
import com.backend.entity.Movie;
import com.backend.service.MovieDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


    @GetMapping("/ListMoview")
    public ResponseEntity<List<MovieReponse>> getAllMovie(){
        return ResponseEntity.ok().body(movieDetailService.getAllMovieDetails());
    }

    @GetMapping("/{id}")
    public Optional<Movie> getMovieDetail(@PathVariable Long id) {
        return movieDetailService.getMovieDetailsByID(id);
    }
}
