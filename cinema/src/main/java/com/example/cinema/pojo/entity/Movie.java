package com.example.cinema.pojo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @Column(name="MovieName")
    private String name;

    @Column(name="MovieCategory")
    private String category;

    @OneToMany(mappedBy = "movie")
    @JsonBackReference
    private List<Ticket> ticketList;

    @OneToMany(mappedBy = "movie")
    @JsonBackReference
    private List<Streams>streamsList;

    public Movie() {
        this.name = "Unknown";
        this.category = "Unknown";
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public List<Streams> getStreamsList() {
        return streamsList;
    }

    public void setStreamsList(List<Streams> streamsList) {
        this.streamsList = streamsList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

