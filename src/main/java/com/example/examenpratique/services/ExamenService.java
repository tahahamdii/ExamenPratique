package com.example.examenpratique.services;

import com.example.examenpratique.entity.Cinema;
import com.example.examenpratique.entity.SalleExpo;
import com.example.examenpratique.repository.CinemaRepo;
import com.example.examenpratique.repository.ProjectionFilmRepo;
import com.example.examenpratique.repository.ResponsableSalleRepo;
import com.example.examenpratique.repository.SalleExpoRepo;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;

public class ExamenService implements IExamenService{
    @Autowired
    private CinemaRepo cr;
    @Autowired
    private ProjectionFilmRepo pr;
    @Autowired
    private ResponsableSalleRepo rsr;
    @Autowired
    private SalleExpoRepo sle;



    @Override
    public Cinema ajouterCinema(Cinema cinema) {
        return cr.save(cinema);
    }

    @Override
    public SalleExpo ajouterSalleExpoEtAffecterACinema(SalleExpo salleExpo, Long idCinema) {
        return null;
    }
}
