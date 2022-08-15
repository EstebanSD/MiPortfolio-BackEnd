
package com.yoProgramo.BackEnd.repository;

import com.yoProgramo.BackEnd.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia, Integer>{
    
    
}
