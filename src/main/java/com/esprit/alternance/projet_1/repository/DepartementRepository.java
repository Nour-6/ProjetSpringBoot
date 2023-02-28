package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartementRepository extends JpaRepository<Department,Integer> {
    Department findDepartmentByIdDepartment(Integer idDepartment);
}
