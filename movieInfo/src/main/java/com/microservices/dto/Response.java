package com.microservices.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private List<Object> response = new ArrayList<>(0);

    public void addResponse(Object obj){
        response.add(obj);
    }

    /*private
    private String movieId;
    private String name;

    public Response(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;*//*
    }*/

}
