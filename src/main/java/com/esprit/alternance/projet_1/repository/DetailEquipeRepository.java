package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.DetailEquipe;
import com.esprit.alternance.projet_1.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Integer> {
}
