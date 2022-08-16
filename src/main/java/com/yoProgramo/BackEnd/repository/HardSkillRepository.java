package com.yoProgramo.BackEnd.repository;

import com.yoProgramo.BackEnd.model.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillRepository extends JpaRepository<HardSkill, Long>{
    
}
