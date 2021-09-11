package com.microservices.dto;

import java.util.ArrayList;
import java.util.List;

public class MovieRequest {

    private List<String> movieList = new ArrayList<>();

    public List<String> getMovieList() {return movieList;}

    public void setMovieList(List<String> movieList) {this.movieList = movieList;}
}
