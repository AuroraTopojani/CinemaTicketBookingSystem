package com.example.cinema.services;


import com.example.cinema.pojo.entity.Movie;
import com.example.cinema.pojo.input.MovieInput;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Movie findMovieByName(String name);
    Movie save(MovieInput movieInput);
    Movie update(String name, MovieInput movieInput);
    void delete(String name);

    List<Movie>findBookedMovies();

}