package com.microservices.repository;

import com.microservices.bo.Movie;
import org.springframework.stereotype.Repository;

public interface MovieRepository {
    Movie getMovie(String movieId);
}
