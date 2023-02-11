package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {

    List<DetailEquipe> retrieveAllDetailEquipes();

    DetailEquipe addDetailEquipe(DetailEquipe e);

    DetailEquipe updateDetailEquipe (DetailEquipe e);

    DetailEquipe retrieveDetailEquipe (Integer idDetailEquipe);

     void deleteDetailEquipe(Integer idDetailEquipe);
}
