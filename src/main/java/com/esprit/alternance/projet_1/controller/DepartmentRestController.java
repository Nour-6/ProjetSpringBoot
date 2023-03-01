package com.esprit.alternance.projet_1.controller;


import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.service.IDepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name="Department Management")
@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentRestController {
    private final IDepartmentService departmentService;

    @Operation(description = "adding a department")
    @PostMapping("/add-department")
    public Department addDepartment(@RequestBody Department d) {
        Department department = departmentService.addDepartment(d);
        return department;
    }
}
