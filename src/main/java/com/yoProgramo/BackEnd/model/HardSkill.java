
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
@Table (name = "hard_skills")
public class HardSkill implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idHard;
    
    @Column (length = 45)
    private String nombreHard;
    
    @ManyToOne (targetEntity = Grado.class,fetch = FetchType.LAZY)
    @JoinColumn (name = "grado_id", referencedColumnName = "idGrado")    
    private Grado grado;

    public HardSkill() {
    }

    public HardSkill(Long idHard, String nombreHard) {
        this.idHard = idHard;
        this.nombreHard = nombreHard;
    }
    
    
}
