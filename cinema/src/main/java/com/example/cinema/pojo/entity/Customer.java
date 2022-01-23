package com.example.cinema.pojo.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @Column(name="CustomerEmail")
    private String email;

    @Column(name="CustomerName")
    private String name;

    @Column(name="CustomerSurname")
    private String surname;

    @Column(name="CustomerAge")
    private Integer age;

    @OneToMany(mappedBy = "customer")
    @JsonBackReference
    private List<Ticket> ticketList;

    public Customer() {
        this.name = "Unknown";
        this.surname = "Unknown";
        this.email = "Unknown";
        this.age = 0;
    }

    public Customer(String name, String surname, String email, Integer age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
