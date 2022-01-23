package com.example.cinema.services;

import com.example.cinema.pojo.entity.Seat;
import com.example.cinema.pojo.input.SeatInput;

import java.util.List;

public interface SeatService {
    List<Seat> findAll();
    Seat findSeatByNumber(Integer number);
    Seat save(SeatInput seatInput);
    Seat update(Integer number, SeatInput seatInput);
    void delete(Integer number);

    List<Seat>findBookedSeats();

}
