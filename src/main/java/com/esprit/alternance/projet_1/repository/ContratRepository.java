package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Contrat;
import com.esprit.alternance.projet_1.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {
    List<Contrat> findByDateFinContratBeforeAndArchiveIsFalse(Date date);
    List<Contrat> findContratByDateDebtutContratAfterAndDateFinContratBeforeAndArchiveIsFalse(Date startDate, Date endDate);

/*    @Query("SELECT sum (c.MontantContrat) FROM Contrat c  WHERE c.dateDebtutContrat between :startDate and :endDate and " +
            "c.dateFinContrat between :startDate and :endDate and c.archive is false and c.specialite=:specialite")
     float getChiffreAffaireEntreDeuxDateParSpecialite(@Param("startDate") Date startDate,@Param("endDate")Date endDate,
                                                       @Param("specialite") String specialite);*/

}
