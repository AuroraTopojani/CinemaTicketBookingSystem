package com.example.cinema.pojo.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="streams")
public class Streams {


    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="SMovieName")
    private Movie movie;


    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="SAuditoriumNr")
    private Auditorium auditorium;

//    @Id
//    private String MovieName;
//
//    @Id
//    private Integer AuditoriumNumber;

    @Column(name="StreamsTime")
    private Time time;

    @Id
    @Column(name="StreamsDate")
    private Date date;

    public Streams() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Time getStreamingTime() {
        return time;
    }

    public void setStreamingTime(Time time) {
        this.time = time;
    }

    public Date getStreamingDate() {
        return date;
    }

    public void setStreamingDate(Date date) {
        this.date = date;
    }
}
