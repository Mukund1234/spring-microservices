package com.microservices.repository.impl;

import com.microservices.bo.Movie;
import com.microservices.bo.Movie_;
import com.microservices.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Slf4j
@Repository
public class MovieRepositoryImpl implements MovieRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Movie getMovie(String movieId) {
        Movie movie = null;
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Movie> cq = cb.createQuery(Movie.class);
        Root<Movie> root = cq.from(Movie.class);
        cq.where(cb.equal(root.get(Movie_.movieId), movieId));
        try {
            movie = entityManager.createQuery(cq).getSingleResult();
        }
        catch ( Exception ex ){
            String message = String.format("No record found for movie id [%s]",movieId);
            log.error(message);
        }
        return movie;
    }
}
