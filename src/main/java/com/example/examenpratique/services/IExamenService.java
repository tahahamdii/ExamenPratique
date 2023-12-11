package com.example.examenpratique.services;

import ch.qos.logback.core.net.server.Client;
import com.example.examenpratique.entity.Cinema;
import com.example.examenpratique.entity.ProjectionFilm;
import com.example.examenpratique.entity.SalleExpo;
import com.example.examenpratique.repository.CinemaRepo;
import com.example.examenpratique.repository.ProjectionFilmRepo;
import com.example.examenpratique.repository.ResponsableSalleRepo;
import com.example.examenpratique.repository.SalleExpoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface IExamenService {
    public Cinema ajouterCinema(Cinema cinema);
    SalleExpo ajouterSalleExpoEtAffecterACinema(SalleExpo salleExpo, Long idCinema);
    ProjectionFilm ajouterProjFilmEtAffecterASalleExpo(ProjectionFilm projFilm, Long idSalleExpo);
}
