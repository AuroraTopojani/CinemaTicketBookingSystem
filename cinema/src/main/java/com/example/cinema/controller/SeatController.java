package com.example.cinema.controller;

import com.example.cinema.pojo.entity.Seat;
import com.example.cinema.pojo.input.SeatInput;
import com.example.cinema.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping("/seat")
    public List<Seat> getSeat() {
        return seatService.findAll();
    }

    @GetMapping("/seat/{number}")
    public Seat getSeatByNumberAndRow(@PathVariable Integer number){
        return seatService.findSeatByNumber(number);
    }

    @PostMapping("/seat")
    public Seat insertNewSeat(@RequestBody SeatInput seatInput){

        return seatService.save(seatInput);
    }

    @PutMapping("seat/{number}")
    public Seat updatedSeat(@PathVariable Integer number,
                            @RequestBody SeatInput seatInput){

        return seatService.update(number, seatInput);
    }

    @DeleteMapping("seat/{number}")
    public Boolean deleteSeat(@PathVariable Integer number){
        seatService.delete(number);
        return true;
    }

    @GetMapping("booked/seats")
    public List<Seat>getBookedSeats(){
        return seatService.findBookedSeats();
    }
}
