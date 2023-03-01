package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Equipe;
import com.esprit.alternance.projet_1.entity.Etudiant;
import com.esprit.alternance.projet_1.entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

    // Récupérer les étudiants d’un département donné
    List<Etudiant> findEtudiantByDepartmentIdDepartment(Integer departmentId);

    Etudiant findEtudiantByIdEtudiant(Integer idEtudiant);

    //Récupérer les étudiants d_Niveau_Expertont l’équipe a un niveau SENIOR
    List<Etudiant> findByEquipesNiveau(Niveau niveau);

}
