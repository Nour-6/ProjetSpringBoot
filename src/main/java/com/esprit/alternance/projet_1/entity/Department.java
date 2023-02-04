package com.esprit.alternance.projet_1.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "Department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepart",nullable = false)
    private Integer idDepart ;
    @Column(name ="nomDepart")
    private String nomDepart;

    @OneToMany(cascade =CascadeType.ALL ,mappedBy = "department")
    private Set<Etudiant> etudiants;
}
