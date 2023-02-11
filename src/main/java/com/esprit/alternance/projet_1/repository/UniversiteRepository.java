package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Equipe;
import com.esprit.alternance.projet_1.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Integer> {

}
