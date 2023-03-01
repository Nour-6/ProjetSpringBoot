package com.esprit.alternance.projet_1.repository;

import com.esprit.alternance.projet_1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    Department findDepartmentByIdDepartment(Integer idDepartment);
}
