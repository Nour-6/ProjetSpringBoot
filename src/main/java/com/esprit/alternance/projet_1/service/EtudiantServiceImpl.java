package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.*;
import com.esprit.alternance.projet_1.repository.ContratRepository;
import com.esprit.alternance.projet_1.repository.DepartmentRepository;
import com.esprit.alternance.projet_1.repository.EquipeRepository;
import com.esprit.alternance.projet_1.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Slf4j
@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    DepartmentRepository departmentRepository;
    ContratRepository contratRepository;
    EquipeRepository equipeRepository;
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
    public List<Etudiant> findByDepartmentIdDepartment(Integer idDepartement) {
        return null;
    }

    @Override
    public List<Etudiant> findByEquipesNiveau(Niveau nv) {
        return null;
    }
    @Override
    public void asignEtudiantADepartment(Integer idDepartement, Integer idEtudiant) {
        Department department = departmentRepository.findDepartmentByIdDepartment(idDepartement);
        Etudiant etudiant = etudiantRepository.findEtudiantByIdEtudiant(idEtudiant);
        if(department != null && etudiant != null){
            etudiant.setDepartment(department);
            etudiantRepository.save(etudiant);
        }
        else
            log.info("département ou étudiant inexistant");


    }

    //@Transactional finish all or stop
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,Integer idEquipe) {
        Equipe equipe = equipeRepository.findById(idEquipe).get();
        Contrat contrat = contratRepository.findById(idContrat).get();

        Etudiant etudiant = etudiantRepository.save(e);
        //we set the father not the son
        equipe.getEtudiants().add(etudiant);
        equipeRepository.save(equipe);
        //we set the father not the son
        contrat.setEtudiant(etudiant);
        contratRepository.save(contrat);

        return e;



    }


}
