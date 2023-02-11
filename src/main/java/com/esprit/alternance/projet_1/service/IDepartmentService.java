package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Department;

import java.util.List;

public interface IDepartmentService {

    List<Department> retrieveAllDepartments();

    Department addDepartment(Department e);

    Department updateDepartment (Department e);

    Department retrieveDepartment (Integer idDepartment);

     void deleteDepartment(Integer idDepartment);
}
