package com.esprit.alternance.projet_1.controller;

import com.esprit.alternance.projet_1.entity.Equipe;
import com.esprit.alternance.projet_1.entity.Universite;
import com.esprit.alternance.projet_1.service.IEquipeService;
import com.esprit.alternance.projet_1.service.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IUniversiteService universiteService;

    // http://localhost:8089/kaddem/universite/retrieve-all-equipes
    @GetMapping("/retrieve-all-equipes")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }
    // http://localhost:8089/kaddem/universite/retrieve-universite/1
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Integer universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    // http://localhost:8089/kaddem/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }
    // http://localhost:8089/kaddem/universite/remove-universite/1
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeOperateur(@PathVariable("universite-id") Integer universiteId) {
        universiteService.deleteUniversite(universiteId);
    }

    // http://localhost:8089/kaddem/universite/update-universite
    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite= universiteService.updateUniversite(u);
        return universite;
    }
}
