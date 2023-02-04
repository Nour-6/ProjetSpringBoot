package com.esprit.alternance.projet_1.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Contrat")
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrat",nullable = false)
    private Integer idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebtutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive;
    private Integer MontantContrat;

    @ManyToOne
    private Etudiant etudiant;

}
