package com.example.cinema.controller;

import com.example.cinema.pojo.entity.Auditorium;
import com.example.cinema.pojo.input.AuditoriumInput;
import com.example.cinema.services.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuditoriumController {

    @Autowired
    private AuditoriumService auditoriumService;

    @GetMapping("/auditorium")
    public List<Auditorium> getAuditorium() {
        return auditoriumService.findAll();
    }

    @GetMapping("/auditorium/{number}")
    public Auditorium getAuditoriumByNumber(@PathVariable Integer number){
        return auditoriumService.findAuditoriumByNumber(number);
    }

    @PostMapping("/auditorium")
    public Auditorium insertNewAuditorium(@RequestBody AuditoriumInput auditoriumInput){

        return auditoriumService.save(auditoriumInput);
    }

    @PutMapping("auditorium/{number}")
    public Auditorium updateAuditorium(@PathVariable Integer number,
                                       @RequestBody AuditoriumInput auditoriumInput){

        return auditoriumService.update(number, auditoriumInput);
    }

    @DeleteMapping("auditorium/{number}")
    public Boolean deleteCustomer(@PathVariable Integer number){
        auditoriumService.delete(number);
        return true;
    }
}
