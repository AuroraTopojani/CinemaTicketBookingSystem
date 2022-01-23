package com.example.cinema.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="auditorium")
public class Auditorium {

    @Id
    @Column(name="AuditoriumNumber")
    private Integer nr;


    @Column(name="AuditoriumCapacity")
    private Integer capacity;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<Seat> seatList;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<Streams>streamsList;

    public Auditorium() {
        this.nr = 0;
        this.capacity = 0;
    }

    public Auditorium(Integer nr, Integer capacity) {
        this.nr = nr;
        this.capacity = capacity;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public List<Streams> getStreamsList() {
        return streamsList;
    }

    public void setStreamsList(List<Streams> streamsList) {
        this.streamsList = streamsList;
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "nr=" + nr +
                ", capacity=" + capacity +
                '}';
    }
}
