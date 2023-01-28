package com.esprit.alternance.projet_1.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Equipe")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe",nullable = false)
    private Integer idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
}
