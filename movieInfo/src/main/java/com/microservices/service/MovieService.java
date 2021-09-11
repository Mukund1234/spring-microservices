package com.microservices.service;

import com.microservices.bo.Movie;
import com.microservices.dto.MovieRequest;

import java.util.List;

public interface MovieService {
    Movie getMovie(String movieId);

    List<Movie> getMovieList(MovieRequest movieRequest);

}
