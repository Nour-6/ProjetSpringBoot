package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.repository.DepartementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements IDepartmentService{
    DepartementRepository departmentRepository;
    @Override
    public Department addDepartment(Department d) {return departmentRepository.save(d);}

}
