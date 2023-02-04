package com.esprit.alternance.projet_1.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idUniv",nullable = false)
    private Integer idUniv;
    private String nomUniv;

    @OneToMany
    private Set<Department> departments;
}
