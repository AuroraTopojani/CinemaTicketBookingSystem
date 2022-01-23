package com.example.cinema.controller;


import com.example.cinema.pojo.entity.Ticket;
import com.example.cinema.pojo.input.TicketInput;
import com.example.cinema.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket")
    public List<Ticket> getTickets() {
        return ticketService.findAll();
    }

    @GetMapping("/ticket/{id}")
    public Ticket getTicketById(@PathVariable String id){
        return ticketService.findTicketById(id);
    }

    @PostMapping("/ticket")
    public Ticket insertNewTicket(@RequestBody TicketInput ticketInput){

        return ticketService.save(ticketInput);
    }

    @PutMapping("ticket/{id}")
    public Ticket updateTicket(@PathVariable String id,
                               @RequestBody TicketInput ticketInput){

        return ticketService.update(id, ticketInput);
    }

    @DeleteMapping("ticket/{id}")
    public Boolean deleteTicket(@PathVariable String id){
        ticketService.delete(id);
        return true;
    }
}

