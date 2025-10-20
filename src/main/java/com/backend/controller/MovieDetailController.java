package com.backend.controller;

import com.backend.dto.movieDTO.MovieResponse;
import com.backend.entity.Movie;
import com.backend.enums.Status;
import com.backend.service.MovieDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cinemas")
public class MovieDetailController {
    @Autowired
    private MovieDetailService movieDetailService;


    @GetMapping("/ListMoview")
    public ResponseEntity<List<MovieResponse>> getAllMovie(){
        return ResponseEntity.ok().body(movieDetailService.getAllMovieDetails());
    }

    @GetMapping("/searchMovie")
    public ResponseEntity<List<MovieResponse>> searchMovieByTitle(@RequestParam String title){
        return ResponseEntity.ok().body(movieDetailService.getAllMovieDetails());
    }
}
