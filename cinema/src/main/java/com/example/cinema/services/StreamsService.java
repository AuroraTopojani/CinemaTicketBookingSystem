package com.example.cinema.services;

import com.example.cinema.pojo.entity.Streams;
import com.example.cinema.pojo.input.StreamsInput;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

public interface StreamsService {

    List<Streams>findAll();
    Streams findStreamsByDateAndTime(Date date, Time time);
    Streams save(StreamsInput streamsInput);
    Streams update(Date date, Time time, StreamsInput streamsInput);
    void delete(Date date, Time time);

    List<Streams>findStreamsByMovieName(String name);
}
