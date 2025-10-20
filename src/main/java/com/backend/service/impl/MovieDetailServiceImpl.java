package com.backend.service.impl;

import com.backend.dto.movieDTO.MovieResponse;
import com.backend.dto.movieDTO.MovieRequest;
import com.backend.entity.Movie;
import com.backend.entity.User;
import com.backend.reponsitory.MovieDetailRepository;
import com.backend.reponsitory.UserRepository;
import com.backend.service.MovieDetailService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Component
public class MovieDetailServiceImpl implements MovieDetailService {
    @Autowired
    private MovieDetailRepository movieDetailRepository ;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<MovieResponse> getAllMovieDetails() {
        return movieDetailRepository.findAll().stream()
                .map(movie -> {
                    MovieResponse movieReponse = modelMapper.map(movie, MovieResponse.class);
                    return movieReponse;
                }
                ).toList();
    }

    @Override
    public MovieResponse getMovieDetailsByID(UUID id) {
        Movie movie = movieDetailRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("movie not found"));
        MovieResponse movieResponse = modelMapper.map(movie, MovieResponse.class);
        return movieResponse;
    }


    @Override
    public MovieResponse create(MovieRequest request) {
        if (request.getTitle() == null || request.getTitle().trim().isEmpty()) {
            throw new RuntimeException("Movie title cannot be empty");
        }

        if(request.getUserId() == null ){
            throw new RuntimeException(("user id can not be null"));
        }

        Movie movie = modelMapper.map(request, Movie.class);

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        movie.setUser(user);
        Movie savedMovie = movieDetailRepository.save(movie);
        MovieResponse movieReponse = modelMapper.map(savedMovie, MovieResponse.class);
        movieReponse.setUserName(savedMovie.getUser().getUsername());
        return movieReponse;
    }

    @Override
    public MovieResponse update(UUID id, MovieRequest request) {
        Movie findMovieId = movieDetailRepository.findById(id).orElseThrow(()-> new RuntimeException("Movie not found"));
        modelMapper.map(request, findMovieId);

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        findMovieId.setUser(user);
        Movie savedMovie = movieDetailRepository.save(findMovieId);
        MovieResponse movieResponse = modelMapper.map(savedMovie, MovieResponse.class);
        return movieResponse;
    }


}
