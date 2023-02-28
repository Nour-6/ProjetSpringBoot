package com.esprit.alternance.projet_1.controller;

import com.esprit.alternance.projet_1.entity.Etudiant;
import com.esprit.alternance.projet_1.service.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantService etudiantService;
    @PostMapping("/add-etudiant")
    public Etudiant addUniversite(@RequestBody Etudiant etudiant){

        return etudiantService.addEtudiant(etudiant);
    }
}
