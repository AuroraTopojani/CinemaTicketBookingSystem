package com.example.cinema.controller;

import com.example.cinema.pojo.entity.Movie;
import com.example.cinema.pojo.input.MovieInput;
import com.example.cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movie")
    public List<Movie> getMovies() {
        return movieService.findAll();
    }

    @GetMapping("/movie/{name}")
    public Movie getMovieByName(@PathVariable String name){
        return movieService.findMovieByName(name);
    }

    @PostMapping("/movie")
    public Movie insertNewMovie(@RequestBody MovieInput movieInput){

        return movieService.save(movieInput);
    }

    @PutMapping("movie/{name}")
    public Movie updateMovie(@PathVariable String name,
                             @RequestBody MovieInput movieInput){

        return movieService.update(name, movieInput);
    }

    @DeleteMapping("movie/{name}")
    public Boolean deleteCustomer(@PathVariable String name){
        movieService.delete(name);
        return true;
    }

    @GetMapping("movie/bookings")
    public List<Movie>getBookedMovies(){
        return movieService.findBookedMovies();
    }
}