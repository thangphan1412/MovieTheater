package com.backend.service.impl;

import com.backend.dto.movieDTO.MovieReponse;
import com.backend.dto.movieDTO.MovieRequest;
import com.backend.entity.Movie;
import com.backend.entity.User;
import com.backend.reponsitory.MovieDetailRepository;
import com.backend.reponsitory.UserRepository;
import com.backend.service.MovieDetailService;
import com.backend.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;


@Component
public class MovieDetailServiceImpl implements MovieDetailService {
    @Autowired
    private MovieDetailRepository movieDetailRepository ;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<MovieReponse> getAllMovieDetails() {
        return movieDetailRepository.findAll().stream()
                .map(movie -> {
                    MovieReponse movieReponse = modelMapper.map(movie, MovieReponse.class);
                    return movieReponse;
                }
                ).toList();
    }

    @Override
    public Optional<Movie> getMovieDetailsByID(Long id) {
        return movieDetailRepository.findById(id);
    }

    @Override
    public MovieReponse create(MovieRequest request) {
        if (request.getTitleMovie() == null || request.getTitleMovie().trim().isEmpty()) {
            throw new RuntimeException("Movie title cannot be empty");
        }


        Movie movie = modelMapper.map(request, Movie.class);
        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));
        movie.setUser(user);
        Movie savedMovie = movieDetailRepository.save(movie);
        MovieReponse movieReponse = modelMapper.map(savedMovie, MovieReponse.class);
        movieReponse.setUserName(savedMovie.getUser().getUsername());
        return movieReponse;
    }

    @Override
    public Movie update(Movie movie, MovieRequest request) {
        movie.setTitle(request.getTitleMovie());
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
