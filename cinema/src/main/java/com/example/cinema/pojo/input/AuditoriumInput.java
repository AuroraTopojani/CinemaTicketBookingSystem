package com.example.cinema.pojo.input;

public class AuditoriumInput {

    private Integer nr;
    private Integer capacity;

    public AuditoriumInput() {
    }

    public AuditoriumInput(Integer nr, Integer capacity) {
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

}