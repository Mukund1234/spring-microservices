package com.microservices.service;

import com.microservices.bo.Movie;

public interface MovieService {
    public Movie getMovie(String movieId);
}
