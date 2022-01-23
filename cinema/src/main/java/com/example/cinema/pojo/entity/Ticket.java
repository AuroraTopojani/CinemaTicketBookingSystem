package com.example.cinema.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="ticket")
public class Ticket {

    @Id
    @Column(name="TicketID")
    private String id;

    @Column(name="TicketDate")
    private Date date;

    @Column(name="TicketTime")
    private Time time;

    @Column(name="TicketFee")
    private double fee;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="TCustomerEmail")
    private Customer customer;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="TMovieName")
    private Movie movie;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name="TicketSeatNr")
    private Seat seat;


    public Ticket() {
        this.id = " ";
        this.fee = 0.0;
    }

    public Ticket(String id, Date date, Time time, double fee) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.fee = fee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Seat getSeatNumber() {
        return seat;
    }

    public void setSeatNumber(Seat seat) {
        this.seat = seat;
    }

//    public Seat getSeatRow() {
//        return seatRow;
//    }
//
//    public void setSeatRow(Seat seatRow) {
//        this.seatRow = seatRow;
//    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", fee=" + fee +
                '}';
    }
}
