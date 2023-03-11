package com.esprit.alternance.projet_1.service;

import com.esprit.alternance.projet_1.entity.Contrat;
import com.esprit.alternance.projet_1.repository.ContratRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
@Slf4j
@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService{
    ContratRepository contratRepository;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return null;
    }

    @Override
    public Contrat addContrat(Contrat e) {
        return null;
    }

    @Override
    public Contrat updateContrat(Contrat e) {
        return null;
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return null;
    }

    @Override
    public void deleteContrat(Integer idContrat) {

    }

    @Scheduled(cron = "* * * * * *" )
    //@Scheduled(cron = "0 0 13 * * *" )
    public void retrieveAndUpdateStatusContrat() {
        Date date= new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000);
    List <Contrat> contrats=contratRepository.findByDateFinContratBeforeAndArchiveIsFalse(date);
    contrats.stream().filter(new Predicate<Contrat>() {
        @Override
        public boolean test(Contrat contrat) {
            if(date.getTime()-contrat.getDateFinContrat().getTime()>0)
            return true;
            else return false;
        }
    }).forEach(new Consumer<Contrat>() {
        @Override
        public void accept(Contrat contrat) {
            log.info("Le contrat de l'étudiant "+contrat.getEtudiant().getNomEtudiant()+
            " va expirer le "+contrat.getDateFinContrat());
        }
    });
    }

}
