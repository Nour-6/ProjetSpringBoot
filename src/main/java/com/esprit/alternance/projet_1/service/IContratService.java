package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Contrat;

import java.util.Date;
import java.util.List;

public interface IContratService {

    List<Contrat> retrieveAllContrats();

    Contrat addContrat(Contrat e);

    Contrat updateContrat (Contrat e);

    Contrat retrieveContrat (Integer idContrat);

     void deleteContrat(Integer idContrat);
    void retrieveAndUpdateStatusContrat();

    float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);
}
