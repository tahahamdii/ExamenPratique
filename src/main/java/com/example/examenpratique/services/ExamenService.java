package com.example.examenpratique.services;

import com.example.examenpratique.entity.Cinema;
import com.example.examenpratique.entity.ProjectionFilm;
import com.example.examenpratique.entity.SalleExpo;
import com.example.examenpratique.repository.CinemaRepo;
import com.example.examenpratique.repository.ProjectionFilmRepo;
import com.example.examenpratique.repository.ResponsableSalleRepo;
import com.example.examenpratique.repository.SalleExpoRepo;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ExamenService implements IExamenService {
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
        // Retrieve the cinema from the database
        Cinema cinema = cr.findById(idCinema)
                .orElseThrow(() -> new NoSuchElementException("Cinema with ID " + idCinema + " not found"));

        // Set the cinema for the SalleExpo
        salleExpo.setCinema(cinema);

        // Save the SalleExpo to update the relationship
        SalleExpo savedSalleExpo = sle.save(salleExpo);

        // Update the list of sallesExpo for the cinema
        cinema.getSalleExpos().add(savedSalleExpo);
        cr.save(cinema);

        return savedSalleExpo;
    }

    @Override
    public ProjectionFilm ajouterProjFilmEtAffecterASalleExpo(ProjectionFilm projFilm, Long idSalleExpo) {
        SalleExpo salleExpo = sle.findById(idSalleExpo)
                .orElseThrow(() -> new NoSuchElementException("SalleExpo not found"));
        projFilm.setSalleExpo(salleExpo);

        ProjectionFilm savedProjectionFilm = pr.save(projFilm);

        salleExpo.getProjections().add(savedProjectionFilm);
        sle.save(salleExpo);

        return savedProjectionFilm;
    }

}
