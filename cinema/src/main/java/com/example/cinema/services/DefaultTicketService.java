package com.example.cinema.services;


import com.example.cinema.pojo.entity.Ticket;
import com.example.cinema.pojo.input.TicketInput;
import com.example.cinema.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
public class DefaultTicketService implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();    }

    @Override
    public Ticket findTicketById(String id) {
        return ticketRepository.findTicketById(id);
    }

    @Override
    public Ticket save(TicketInput ticketInput) {

        String Id= ticketInput.getId();
        Date date=ticketInput.getDate();
        Time time= ticketInput.getTime();
        Double fee=ticketInput.getFee();


        Ticket ticket= new Ticket();
        ticket.setId(Id);
        ticket.setDate(date);
        ticket.setTime(time);
        ticket.setFee(fee);

        return ticketRepository.save(ticket);    }

    @Override
    public Ticket update(String id, TicketInput ticketInput){

        Ticket ticket= ticketRepository.findTicketById(id);

        if(ticket==null){
            return null;
        }

        String updatedId= ticketInput.getId();
        Date updatedDate=ticketInput.getDate();
        Time updatedTime= ticketInput.getTime();
        Double updatedFee=ticketInput.getFee();


        ticket.setId(updatedId);
        ticket.setDate(updatedDate);
        ticket.setTime(updatedTime);
        ticket.setFee(updatedFee);

        return ticketRepository.save(ticket);
    }

    @Override
    public void delete(String id) {
        Ticket ticket= ticketRepository.findTicketById(id);
        if(ticket!=null){
            ticketRepository.delete(ticket);
        }
    }
}
