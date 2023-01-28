package com.esprit.alternance.projet_1.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idUniv",nullable = false)
    private Integer idUniv;
    private String nomUniv;
}
