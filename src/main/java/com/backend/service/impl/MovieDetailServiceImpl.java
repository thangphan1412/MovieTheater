package com.backend.service.impl;

import com.backend.dto.movieDTO.MovieRequest;
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
    public Optional<Movie> getMovieDetailsByID(Long id) {
        return movieDetailRepository.findById(id);
    }

    @Override
    public Movie create(MovieRequest request) {
        Movie movie = new Movie();
        movie.setTitle(request.getTitle());
        movie.setDirector(request.getDirector());
        movie.setReleaseDate(request.getReleaseDate());
        movie.setPerformer(request.getPerformer());
        movie.setCategory(request.getCategory());
        movie.setCountry(request.getCountry());
        movie.setLanguage(request.getLanguage());
        movie.setDuration(request.getDuration());
        movie.setImage(request.getImage());

        return movieDetailRepository.save(movie);
    }

    @Override
    public Movie update(Movie movie, MovieRequest request) {
        movie.setTitle(request.getTitle());
        movie.setDirector(request.getDirector());
        movie.setReleaseDate(request.getReleaseDate());
        movie.setPerformer(request.getPerformer());
        movie.setCategory(request.getCategory());
        movie.setCountry(request.getCountry());
        movie.setLanguage(request.getLanguage());
        movie.setDuration(request.getDuration());
        movie.setImage(request.getImage());

        return movieDetailRepository.save(movie);
    }
}
