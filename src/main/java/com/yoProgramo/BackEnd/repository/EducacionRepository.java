package com.yoProgramo.BackEnd.repository;

import com.yoProgramo.BackEnd.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    
}
