package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.entity.Etudiant;
import com.esprit.alternance.projet_1.repository.DepartementRepository;
import com.esprit.alternance.projet_1.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService{

    EtudiantRepository etudiantRepository;
    DepartementRepository departmentRepository;
    @Override
    public void asignEtudiantADepartment(Integer idDepartement, Integer idEtudiant) {
        Department department = departmentRepository.findDepartmentByIdDepartment(idDepartement);
        Etudiant etudiant = etudiantRepository.findEtudiantByIdEtudiant(idEtudiant);
        if(department != null && etudiant != null){
            etudiant.setDepartment(department);
            etudiantRepository.save(etudiant);
        }

    }
}
