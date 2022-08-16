
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    
    @Column (length = 45)
    private String nombreSoft;
    private String descrSoft;
    
    @ManyToOne (targetEntity = Persona.class,fetch = FetchType.LAZY)
    @JoinColumn (name = "persona_id", referencedColumnName = "idPer")
    private Persona persona;

    public SoftSkill() {
    }

    public SoftSkill(Long idSoft, String nombreSoft, String descrSoft) {
        this.idSoft = idSoft;
        this.nombreSoft = nombreSoft;
        this.descrSoft = descrSoft;
    }
    
    
}
