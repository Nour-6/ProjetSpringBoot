package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService{
    DepartmentRepository departmentRepository;
    @Override
    public Department addDepartment(Department d) {
        return departmentRepository.save(d);}
    @Override
    public List<Department> retrieveAllDepartments() {

        return departmentRepository.findAll();
    }

}
