package com.example.examenpratique.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "SalleExpo")
public class SalleExpo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSalleExpo")
    private long idSalleExpo ;
    @Column(name = "nbplaces")
    private int nbplaces;
    @Column(name = "dateIntegration")
    private LocalDate dateIntegration;
    @ManyToOne
    private Cinema cinema;
    @OneToMany(mappedBy = "salleExpo")
    private List<ProjectionFilm> projections;
    @ManyToMany(mappedBy = "sallesExpo")
    private List<ResponsableSalle> responsableSalles;

}

