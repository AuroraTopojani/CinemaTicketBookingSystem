package com.example.cinema.repository;

import com.example.cinema.pojo.entity.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
    List<Movie> findAll();
    Movie findMovieByName(String name);

    @Query(
            "select m from Movie m join Ticket t on m.name=t.movie.name"
    )
    List<Movie>findBookedMovies();
}
