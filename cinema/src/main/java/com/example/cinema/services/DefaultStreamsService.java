package com.example.cinema.services;


import com.example.cinema.pojo.entity.Streams;
import com.example.cinema.pojo.input.StreamsInput;
import com.example.cinema.repository.StreamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

@Service
public class DefaultStreamsService implements StreamsService{

    @Autowired
    private StreamsRepository streamsRepository;

    @Override
    public List<Streams> findAll() {
        return streamsRepository.findAll();
    }

    @Override
    public Streams findStreamsByDateAndTime(Date date, Time time) {
        return streamsRepository.findStreamsByDateAndTime(date, time);
    }

    @Override
    public Streams save(StreamsInput streamsInput) {

        Date date=streamsInput.getDate();
        Time time=streamsInput.getTime();

        Streams streams= new Streams();

        streams.setStreamingDate(date);
        streams.setStreamingTime(time);

        return streamsRepository.save(streams);
    }

    @Override
    public Streams update(Date date, Time time, StreamsInput streamsInput) {
        Streams streams=streamsRepository.findStreamsByDateAndTime(date,time);
        if(streams==null){
            return null;
        }

        streams.setStreamingDate(date);
        streams.setStreamingTime(time);

        return streamsRepository.save(streams);
    }

    @Override
    public void delete(Date date, Time time) {
        Streams streams=streamsRepository.findStreamsByDateAndTime(date,time);
        if(streams!=null){
            streamsRepository.delete(streams);
        }
    }

    @Override
    public List<Streams> findStreamsByMovieName(String name){
        return streamsRepository.findStreamsByMovieName(name);
    }
}
