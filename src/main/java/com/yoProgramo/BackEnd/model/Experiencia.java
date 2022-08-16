
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter @Setter
@Entity
@Table (name = "experiencias")
public class Experiencia implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idExp;
    
    private String empresaExp;
    private String tituloExp;
    private String descrExp;
    
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column (nullable = false)
    private Date fecha_startExp;
    
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fecha_endExp;
    
    private String logoExp;
    
    
    
    public Experiencia() {
    }
        

    public Experiencia(Long idExp, String empresaExp, String tituloExp, String descrExp, Date fecha_startExp, Date fecha_endExp, String logoExp) {
        this.idExp = idExp;
        this.empresaExp = empresaExp;
        this.tituloExp = tituloExp;
        this.descrExp = descrExp;
        this.fecha_startExp = fecha_startExp;
        this.fecha_endExp = fecha_endExp;
        this.logoExp = logoExp;
    }
    
}
