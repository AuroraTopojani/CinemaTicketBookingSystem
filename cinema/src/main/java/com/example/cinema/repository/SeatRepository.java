package com.example.cinema.repository;


import com.example.cinema.pojo.entity.Seat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends CrudRepository<Seat, Integer> {
    List<Seat> findAll();
    Seat findSeatByNumber(Integer number);

    @Query
            ("select s "+
                    "from Seat s join fetch Ticket t on s.number=t.seat.number" )

    List<Seat>findBookedSeats();
}
