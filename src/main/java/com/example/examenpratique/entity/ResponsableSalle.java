package com.example.examenpratique.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "ResponsableSalle")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponsableSalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nom")

    private String nom;
    @Column(name = "prenom")

    private String prenom;
    @Column(name = "contact")

    private String contact;

    @ManyToMany
    private List<SalleExpo> sallesExpos;

}
