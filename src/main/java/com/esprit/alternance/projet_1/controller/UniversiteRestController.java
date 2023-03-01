package com.esprit.alternance.projet_1.controller;


import com.esprit.alternance.projet_1.entity.Universite;
import com.esprit.alternance.projet_1.service.IUniversiteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Tag(name="Universite Management")
@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IUniversiteService universiteService;

    // http://localhost:8089/kaddem/universite/retrieve-all-equipes
    @Operation(description = "retrieving universities")
    @GetMapping("/retrieve-all-universite")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }
    // http://localhost:8089/kaddem/universite/retrieve-universite/1
    @Operation(description = "retrieving a university")
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Integer universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    // http://localhost:8089/kaddem/universite/add-universite
    @Operation(description = "adding a university")
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite){
        return universiteService.addUniversite(universite);
    }
    // http://localhost:8089/kaddem/universite/remove-universite/1
    @Operation(description = "deleting a university")
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeOperateur(@PathVariable("universite-id") Integer universiteId) {
        universiteService.deleteUniversite(universiteId);
    }

    // http://localhost:8089/kaddem/universite/update-universite
    @Operation(description = "updating a university")
    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite= universiteService.updateUniversite(u);
        return universite;
    }
}
