package com.microservices.controller;

import com.microservices.bo.Movie;
import com.microservices.dto.Response;
import com.microservices.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import java.util.List;

/**
 * @author mukund shil
 */
@RestController
@Slf4j
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/{movieId}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public Response getMovieInfo(@PathVariable("movieId") String movieId) {
        Response rsp =new Response();
        rsp.addResponse(movieService.getMovie(movieId));
        return rsp;
    }

   /* @GetMapping("/movie")
    public */

}
