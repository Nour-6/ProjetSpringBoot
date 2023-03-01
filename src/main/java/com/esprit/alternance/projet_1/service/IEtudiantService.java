package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Equipe;
import com.esprit.alternance.projet_1.entity.Etudiant;
import com.esprit.alternance.projet_1.entity.Niveau;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e) ;
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant) ;
    void deleteEtudiant(Integer idEtudiant) ;
    List<Etudiant> findByDepartmentIdDepartment(Integer idDepartement);
    List<Etudiant> findByEquipesNiveau(Niveau nv);
    void asignEtudiantADepartment(Integer idDepartement, Integer idEtudiant);


}
