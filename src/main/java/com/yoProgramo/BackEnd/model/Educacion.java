
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter @Setter
@Entity
public class Educacion implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idEdu;
    
    @Column (length = 45)
    private String academiaEdu;
    @Column (length = 45)
    private String tituloEdu;
    
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fecha_startEdu;
    
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fecha_endEdu;
    
    @Column (length = 150)
    private String logoEdu;
    
    @ManyToOne (targetEntity = Persona.class,fetch = FetchType.LAZY)
    @JoinColumn (name = "persona_id", referencedColumnName = "idPer")
    private Persona persona;
    
    public Educacion() {
    }

    public Educacion(Long idEdu, String academiaEdu, String tituloEdu, Date fecha_startEdu, Date fecha_endEdu, String logoEdu) {
        this.idEdu = idEdu;
        this.academiaEdu = academiaEdu;
        this.tituloEdu = tituloEdu;
        this.fecha_startEdu = fecha_startEdu;
        this.fecha_endEdu = fecha_endEdu;
        this.logoEdu = logoEdu;
    }
    
    
}
