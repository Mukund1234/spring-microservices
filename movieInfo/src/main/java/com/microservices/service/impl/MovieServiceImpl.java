package com.microservices.service.impl;

import com.microservices.bo.Movie;
import com.microservices.dto.MovieRequest;
import com.microservices.repository.MovieRepository;
import com.microservices.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public Movie getMovie(String movieId) {
        return movieRepository.getMovie(movieId);
    }

    @Override
    public List<Movie> getMovieList(MovieRequest movieRequest) {

        return null;
    }
}

