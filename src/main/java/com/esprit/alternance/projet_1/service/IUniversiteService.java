package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.entity.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite addUniversite(Universite e);

    Universite updateUniversite (Universite e);

    Universite retrieveUniversite (Integer idUniversite);

     void deleteUniversite(Integer idUniversite);

    List<Department> retrieveDepartementsByUniversite(Integer idUniversite);
}
