package com.example.cinema.services;


import com.example.cinema.pojo.entity.Movie;
import com.example.cinema.pojo.input.MovieInput;
import com.example.cinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findMovieByName(String name) {
        return movieRepository.findMovieByName(name);
    }

    @Override
    public Movie save(MovieInput movieInput) {

        String name = movieInput.getName();
        String category = movieInput.getCategory();

        Movie movie = new Movie();
        movie.setName(name);
        movie.setCategory(category);

        return movieRepository.save(movie);
    }

    @Override
    public Movie update(String name, MovieInput movieInput) {

        Movie movie = movieRepository.findMovieByName(name);

        if (movie == null) {
            return null;
        }

        String updatedName = movieInput.getName();
        String updatedCategory = movieInput.getCategory();


        movie.setName(updatedName);
        movie.setCategory(updatedCategory);

        return movieRepository.save(movie);
    }

    @Override
    public void delete(String name) {
        Movie movie = movieRepository.findMovieByName(name);
        if (movie != null) {
            movieRepository.delete(movie);
        }
    }

    @Override
    public List<Movie>findBookedMovies(){
        return movieRepository.findBookedMovies();
    }

}
