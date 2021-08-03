package com.microservices.repository.impl;

import com.microservices.bo.Movie;
import com.microservices.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Slf4j
@Repository
public class MovieRepositoryImpl implements MovieRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Movie getMovie(String movieId) {

        Movie movie = entityManager.find(Movie.class, movieId);
        if(movie == null){
            String message = String.format("No record found for [%s]",movieId);
            log.error(message);
        }
        return movie;
    }
}
