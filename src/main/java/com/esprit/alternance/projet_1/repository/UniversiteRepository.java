package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Department;
import com.esprit.alternance.projet_1.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Integer> {

    @Query("SELECT u.departments FROM Universite u WHERE u.idUniv = :idUniversite")
    List<Department> retrieveDepartementsByUniversite(@Param("idUniversite") Integer idUniversite);
}
