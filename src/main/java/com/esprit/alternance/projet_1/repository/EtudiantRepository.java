package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Equipe;
import com.esprit.alternance.projet_1.entity.Etudiant;
import com.esprit.alternance.projet_1.entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    //Récupérer les étudiants d’un département donné
    public List<Etudiant> findByDepartmentIdDepart(Integer IdDepart);

    //Récupérer les étudiants dont l’équipe a un niveau SENIOR
    List<Etudiant> findByEquipesNiveau(String Niveau.Senior);
}
