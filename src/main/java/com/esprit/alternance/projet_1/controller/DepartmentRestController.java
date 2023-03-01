package com.esprit.alternance.projet_1.controller;


import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.service.IDepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Department Management")
@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentRestController {

    IDepartmentService DepartmentService;
    // http://localhost:8089/kaddem/department/add-department
    @Operation(description = "adding a department")
    @PostMapping("/add-department")
    public Department addDepartment(@RequestBody Department department){
        return DepartmentService.addDepartment(department);
    }
    @GetMapping("/retrieve-all-departments")
    public List<Department> getDepartments(){
        List<Department> listDepartments = DepartmentService.retrieveAllDepartments();
        return listDepartments;
    }


}
