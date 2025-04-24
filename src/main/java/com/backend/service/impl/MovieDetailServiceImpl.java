package com.backend.service.impl;

import com.backend.entity.Movie;
import com.backend.reponsitory.MovieDetailRepository;
import com.backend.service.MovieDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class MovieDetailServiceImpl implements MovieDetailService {
    @Autowired
    private MovieDetailRepository movieDetailRepository ;


    @Override
    public List<Movie> getAllMovieDetails() {
        return movieDetailRepository.findAll();
    }

    @Override
    public Optional<Object> getMovieDetailsByID(String id) {
        return Optional.of(movieDetailRepository.findById(Long.valueOf(id)));
    }
}
