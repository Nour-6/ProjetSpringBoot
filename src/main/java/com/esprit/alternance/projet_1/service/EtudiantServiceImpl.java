package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Etudiant;
import com.esprit.alternance.projet_1.entity.Niveau;
import com.esprit.alternance.projet_1.repository.EquipeRepository;
import com.esprit.alternance.projet_1.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {return etudiantRepository.findAll();}

    @Override
    public Etudiant addEtudiant(Etudiant e) {return etudiantRepository.save(e);}

    @Override
    public Etudiant updateEtudiant(Etudiant e) {return etudiantRepository.save(e);}

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {return etudiantRepository.findById(idEtudiant).get();}

    @Override
    public void deleteEtudiant(Integer idEtudiant) {etudiantRepository.deleteById(idEtudiant);}

    @Override
    public List<Etudiant> findByDepartmentIdDepart(Integer IdDepart) {
        return null;
    }

    @Override
    public List<Etudiant> findByEquipesNiveau(Niveau nv) {
        return null;
    }


}
