package com.example.examenpratique.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
@Table(name = "ProjectionFilm")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectionFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column (name = "titre")
    private String titre;
    @Column (name = "catFilm")
    private String catFilm;
    @Column (name = "dateProj")
    private LocalDate dateProj;

    @ManyToOne
    @JoinColumn(name = "salle_expo_id")
    private SalleExpo salleExpo ;
}
