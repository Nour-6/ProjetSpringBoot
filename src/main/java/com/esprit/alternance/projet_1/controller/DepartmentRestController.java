package com.esprit.alternance.projet_1.controller;

import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.repository.DepartementRepository;
import com.esprit.alternance.projet_1.service.IDepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentRestController {

    IDepartmentService departmentService;
    private final DepartementRepository departmentRepository;

    @PutMapping("/asign-etudiant/{idDepartement}/to-department/{idEtudiant}")
    public void asignEtudiantADepartment(
            @PathVariable("idDepartement") Integer idDepartement,
            @PathVariable("idEtudiant") Integer idEtudiant
    ){
        departmentService.asignEtudiantADepartment(idDepartement, idEtudiant);
    }
    @PostMapping("/add-departement")
    public Department addDepartment(@RequestBody Department department){
        return departmentRepository.save(department);
    }
}
