package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.DetailEquipe;
import com.esprit.alternance.projet_1.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Integer> {
}
