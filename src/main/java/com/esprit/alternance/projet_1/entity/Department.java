package com.esprit.alternance.projet_1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartment",nullable = false)
    private Integer idDepartment ;
    @Column(name ="nomDepart")
    private String nomDepart;

    @OneToMany(cascade =CascadeType.ALL ,mappedBy = "department")
    private Set<Etudiant> etudiants;
}
