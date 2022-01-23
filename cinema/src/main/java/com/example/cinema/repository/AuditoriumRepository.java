package com.example.cinema.repository;

import com.example.cinema.pojo.entity.Auditorium;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditoriumRepository extends CrudRepository<Auditorium, Integer> {

    @Query
            (
                    "SELECT a FROM Auditorium a"
            )
    List<Auditorium> findAll();

    Auditorium findAuditoriumByNr(Integer auditoriumNumber);

}

