package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Contrat;
import com.esprit.alternance.projet_1.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {
    List<Contrat> findByDateFinContratBeforeAndArchiveIsFalse(Date date);

}
