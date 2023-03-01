package com.esprit.alternance.projet_1.controller;

import com.esprit.alternance.projet_1.entity.Etudiant;
import com.esprit.alternance.projet_1.service.IEtudiantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name="Etudiant Management")
@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantService etudiantService;
    @Operation(description = "adding a student")
    @PostMapping("/add-etudiant")
    public Etudiant addUniversite(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }
    @Operation(description = "assigning a student to a department")
    @PutMapping("/asign-etudiant/{idDepartement}/to-department/{idEtudiant}")
    public void asignEtudiantADepartment(
            @PathVariable("idDepartement") Integer idDepartement,
            @PathVariable("idEtudiant") Integer idEtudiant
    ){
        etudiantService.asignEtudiantADepartment(idDepartement, idEtudiant);
    }
}
