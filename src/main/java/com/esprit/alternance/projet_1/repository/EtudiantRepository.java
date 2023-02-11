package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Equipe;
import com.esprit.alternance.projet_1.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}
