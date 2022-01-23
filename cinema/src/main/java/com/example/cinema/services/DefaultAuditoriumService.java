package com.example.cinema.services;

import com.example.cinema.pojo.entity.Auditorium;
import com.example.cinema.pojo.input.AuditoriumInput;
import com.example.cinema.repository.AuditoriumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DefaultAuditoriumService implements AuditoriumService {


    @Autowired
    private AuditoriumRepository auditoriumRepository;

    @Override
    public List<Auditorium> findAll() {
        return auditoriumRepository.findAll();
    }

    @Override
    public Auditorium findAuditoriumByNumber(Integer number) {
        return auditoriumRepository.findAuditoriumByNr(number);
    }

    @Override
    public Auditorium save(AuditoriumInput auditoriumInput) {


        Integer nr = auditoriumInput.getNr();
        Integer capacity = auditoriumInput.getCapacity();

        Auditorium auditorium = new Auditorium();

        auditorium.setNr(nr);
        auditorium.setCapacity(capacity);

        return auditoriumRepository.save(auditorium);
    }

    @Override
    public Auditorium update(Integer nr, AuditoriumInput auditoriumInput) {

        Auditorium auditorium = auditoriumRepository.findAuditoriumByNr(nr);

        if (auditorium == null) {
            return null;
        }
        Integer updatedNr = auditoriumInput.getNr();
        Integer updatedCapacity = auditoriumInput.getCapacity();

        auditorium.setNr(updatedNr);
        auditorium.setCapacity(updatedCapacity);

        return auditoriumRepository.save(auditorium);
    }

    @Override
    public void delete(Integer number) {
        Auditorium auditorium = auditoriumRepository.findAuditoriumByNr(number);
        {
            if (auditorium != null) {
                auditoriumRepository.delete(auditorium);
            }
            auditoriumRepository.delete(auditorium);
        }


    }
}
