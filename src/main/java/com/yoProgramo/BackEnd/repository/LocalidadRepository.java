
package com.yoProgramo.BackEnd.repository;

import com.yoProgramo.BackEnd.model.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long>{
    
}
