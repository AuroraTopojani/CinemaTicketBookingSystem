package com.example.cinema.controller;


import com.example.cinema.pojo.entity.Streams;
import com.example.cinema.pojo.input.StreamsInput;
import com.example.cinema.services.StreamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@RestController
public class StreamsController {

    @Autowired
    private StreamsService streamsService;

    @GetMapping("/streams")
    public List<Streams> getStreams() {
        return streamsService.findAll();
    }

    @GetMapping("/streams/{date}/{time}")
    public Streams getStreamsByDateAndTime(@PathVariable Date date , @PathVariable Time time){
        return streamsService.findStreamsByDateAndTime(date, time);
    }

    @PostMapping("/streams")
    public Streams insertNewStream(@RequestBody StreamsInput streamsInput){

        return streamsService.save(streamsInput);
    }

    @PutMapping("streams/{date}/{time}")
    public Streams updatedStream(@PathVariable Date date, @PathVariable Time time,
                                 @RequestBody StreamsInput streamsInput){

        return streamsService.update(date, time, streamsInput);
    }

    @DeleteMapping("streams/{date}/{time}")
    public Boolean deleteStream(@PathVariable Date date, @PathVariable Time time){
        streamsService.delete(date , time);
        return true;
    }

    @GetMapping("streams/bookings/{name}")
    public List<Streams>getStreamsByMovieName(@PathVariable String name){
        return streamsService.findStreamsByMovieName(name);
    }
}
