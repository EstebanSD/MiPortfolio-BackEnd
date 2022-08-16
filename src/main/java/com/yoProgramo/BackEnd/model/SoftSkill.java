
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
@Table (name = "soft_skills")
public class SoftSkill implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idSoft;
    
    private String nombreSoft;
    private String descrSoft;

    public SoftSkill() {
    }

    public SoftSkill(Long idSoft, String nombreSoft, String descrSoft) {
        this.idSoft = idSoft;
        this.nombreSoft = nombreSoft;
        this.descrSoft = descrSoft;
    }
    
    
}
