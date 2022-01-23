package com.example.cinema.pojo.input;


import java.sql.Date;
import java.sql.Time;

public class StreamsInput {

    private String movieName;
    private Integer auditoriumNumber;
    private Time time;
    private Date date;

    public StreamsInput() {
    }

    public StreamsInput(String movieName, Integer auditoriumNumber, Time time, Date date) {
        this.movieName = movieName;
        this.auditoriumNumber = auditoriumNumber;
        this.time = time;
        this.date = date;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getAuditoriumNumber() {
        return auditoriumNumber;
    }

    public void setAuditoriumNumber(Integer auditoriumNumber) {
        this.auditoriumNumber = auditoriumNumber;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

