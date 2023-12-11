package com.example.examenpratique.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cinema")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCinema")
    private Long idCinema;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "ville")
    private String ville;
    @Column(name = "telephone")
    private long telephone;
    @OneToMany(mappedBy = "cinema")
    private List<SalleExpo> salleExpos;


}
