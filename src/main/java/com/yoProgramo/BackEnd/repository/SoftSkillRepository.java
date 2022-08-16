package com.yoProgramo.BackEnd.repository;

import com.yoProgramo.BackEnd.model.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository<SoftSkill, Long> {
    
}
