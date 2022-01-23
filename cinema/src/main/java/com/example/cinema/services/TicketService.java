package com.example.cinema.services;

import com.example.cinema.pojo.entity.Ticket;
import com.example.cinema.pojo.input.TicketInput;

import java.util.List;

public interface TicketService {

    List<Ticket> findAll();
    Ticket findTicketById(String Id);
    Ticket save(TicketInput ticketInput);
    Ticket update(String Id, TicketInput ticketInput);
    void delete(String Id);

}
