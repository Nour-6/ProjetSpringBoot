package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Department;

import java.util.List;

public interface IDepartmentService {

    void asignEtudiantADepartment(Integer idDepartement, Integer idEtudiant);
}
