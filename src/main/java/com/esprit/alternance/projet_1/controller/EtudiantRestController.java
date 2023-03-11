package com.esprit.alternance.projet_1.controller;

import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.entity.Etudiant;
import com.esprit.alternance.projet_1.service.IEtudiantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Etudiant Management")
@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantService etudiantService;
    @Operation(description = "Adding a student")
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){

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
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants(){
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    @PostMapping("/asgin-etudiant-contrat-equipe/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(
            @RequestBody Etudiant etudiant,
            @PathVariable("idContrat") Integer idContrat,
            @PathVariable("idEquipe")  Integer idEquipe
    ){
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant, idContrat, idEquipe);
    }
}

