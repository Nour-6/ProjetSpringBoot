package com.esprit.alternance.projet_1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etudiant", nullable = false)
    private Integer idEtudiant;

    @Column(name = "nom_etudiant")
    private String nomEtudiant;

    @Column(name = "prenom_etudiant")
    private String prenomEtudiant;

    @Enumerated(EnumType.STRING)
    private Option option;

    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "etudiant")
    private Set<Contrat> contrats;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy ="etudiants")
    private Set<Equipe> equipes;
}
