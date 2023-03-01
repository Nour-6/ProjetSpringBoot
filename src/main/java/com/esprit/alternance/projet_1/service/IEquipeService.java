package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Equipe;

import java.util.List;

public interface IEquipeService {

    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);

     void deleteEquipe(Integer idEquipe);

}
