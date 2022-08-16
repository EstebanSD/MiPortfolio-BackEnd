
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "hard_skills")
public class HardSkill implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idHard;
    
    private String nombreHard;
    private String gradoHard;

    public HardSkill() {
    }

    public HardSkill(Long idHard, String nombreHard, String gradoHard) {
        this.idHard = idHard;
        this.nombreHard = nombreHard;
        this.gradoHard = gradoHard;
    }
    
    
}
