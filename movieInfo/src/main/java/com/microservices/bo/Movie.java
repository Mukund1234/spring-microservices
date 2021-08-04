package com.microservices.bo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "movie",schema = "microservice")
@Getter
@Setter
public class Movie {

    @Id
   /* @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_tb")
    @SequenceGenerator(name = "movie_tb", allocationSize = 1)*/
    @Column(name = "movie_id", nullable = false)
    @NotNull(message = "Id cannot be null")
    private String movieId;
    @Column(name = "movie_name")
    private String name;
}
