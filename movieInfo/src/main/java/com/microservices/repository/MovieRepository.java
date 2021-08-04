package com.microservices.repository;

import com.microservices.bo.Movie;

public interface MovieRepository {
    Movie getMovie(String movieId);
}
