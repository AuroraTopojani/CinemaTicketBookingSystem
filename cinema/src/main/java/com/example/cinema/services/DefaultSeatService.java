package com.example.cinema.services;

import com.example.cinema.pojo.entity.Seat;
import com.example.cinema.pojo.input.SeatInput;
import com.example.cinema.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSeatService implements SeatService{

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public List<Seat> findAll() {
        return seatRepository.findAll();    }

    @Override
    public Seat findSeatByNumber(Integer number) {
        return seatRepository.findSeatByNumber(number);
    }

    @Override
    public Seat save(SeatInput seatInput) {

        Integer number= seatInput.getNr();

        Seat seat= new Seat();
        seat.setNumber(number);

        return seatRepository.save(seat);    }

    @Override
    public Seat update( Integer number, SeatInput seatInput){

        Seat seat= seatRepository.findSeatByNumber(number);

        if(seat==null){
            return null;
        }

        Integer updatedNumber= seatInput.getNr();


        seat.setNumber(updatedNumber);

        return seatRepository.save(seat);
    }

    @Override
    public void delete(Integer number) {
        Seat seat= seatRepository.findSeatByNumber(number);
        if(seat!=null){
            seatRepository.delete(seat);
        }
    }

    @Override
    public List<Seat>findBookedSeats(){
        return seatRepository.findBookedSeats();
    }
}
