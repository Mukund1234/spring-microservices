package com.microservices.controller;

import com.microservices.dto.DataTransfer;
import com.microservices.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
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
    public DataTransfer getMovieInfo(@PathVariable("movieId") String movieId) {
        DataTransfer response =new DataTransfer();
        response.addResponse(movieService.getMovie(movieId));
        return response;
    }

    @GetMapping("/movie")
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public DataTransfer getMovie(@RequestBody DataTransfer request){
        DataTransfer response = new DataTransfer();
        List<Object> dataTransfer = request.getDataTransfer();
//        dataTransfer.stream().forEach();
//        movieService.getMovieList(movieRequest);
        return response;
    }

}
