package com.example.cinema.pojo.input;


import java.sql.Time;
import java.util.Date;

public class TicketInput {

    private String id;


    private Date date;


    private Time time;


    private double fee;

    public TicketInput() {
    }

    public TicketInput(String id, Date date, Time time, double fee) {
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
}

