package com.example.cinema.repository;

import com.example.cinema.pojo.entity.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Integer> {

    List<Ticket>findAll();
    Ticket findTicketById(String id);
}
