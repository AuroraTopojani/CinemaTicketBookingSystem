package com.example.cinema.pojo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


@Entity
@Table(name="seat")
public class Seat {

    @Id
    @Column(name="SeatNumber")
    private Integer number;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="AuditoriumNumber")
    private Auditorium auditorium;

    public Seat() {
        this.number = 0;
//        this.row = 0;
    }

    public Seat(Integer number) {
        this.number = number;
//        this.row = row;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer nr) {
        this.number = nr;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "nr=" + number +
                '}';
    }
}
