package com.example.cinema.services;

import com.example.cinema.pojo.entity.Auditorium;
import com.example.cinema.pojo.input.AuditoriumInput;

import java.util.List;

public interface AuditoriumService {
    List<Auditorium> findAll();
    Auditorium findAuditoriumByNumber(Integer number);
    Auditorium save(AuditoriumInput auditoriumInput);
    Auditorium update(Integer number, AuditoriumInput auditoriumInput);
    void delete(Integer number);
}
