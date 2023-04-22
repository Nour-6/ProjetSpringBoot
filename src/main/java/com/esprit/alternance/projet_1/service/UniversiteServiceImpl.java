package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.entity.Universite;
import com.esprit.alternance.projet_1.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepository universiteRepository;


    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite e) {
        return universiteRepository.save(e);
    }

    @Override
    public Universite updateUniversite(Universite e) {
        return universiteRepository.save(e);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void deleteUniversite(Integer idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }

    @Override
    public List<Department> retrieveDepartementsByUniversite(Integer idUniversite) {
        /*Universite u=universiteRepository.findById(idUniversite).get();
        return u.getDepartments();*/
        return universiteRepository.retrieveDepartementsByUniversite(idUniversite);
    }
}
