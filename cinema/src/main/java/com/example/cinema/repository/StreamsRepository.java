package com.example.cinema.repository;

import com.example.cinema.pojo.entity.Streams;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Repository
public interface StreamsRepository extends CrudRepository<Streams,String>{

    List<Streams>findAll();
    Streams findStreamsByDateAndTime(Date date, Time time);

    @Query(
            "SELECT s.movie.name, s.date, s.time " +
                    "FROM Streams s JOIN FETCH Movie m ON s.movie.name=m.name " +
                    "WHERE s.movie.name=:name"
    )
    List<Streams>findStreamsByMovieName(@Param("name") String name);
}
