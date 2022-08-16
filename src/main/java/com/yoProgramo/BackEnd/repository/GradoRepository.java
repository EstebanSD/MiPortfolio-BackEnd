package com.yoProgramo.BackEnd.repository;

import com.yoProgramo.BackEnd.model.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Long>{
    
}
