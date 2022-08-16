
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

@Entity
@Table (name = "localidades")
public class Localidad implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLoc;
    
    @Column (nullable = false)
    private String nombreLoc;
    
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "provincia_id")
    private Provincia provincia;

    public Localidad() {
    }

    public Localidad(Long idLoc, String nombreLoc) {
        this.idLoc = idLoc;
        this.nombreLoc = nombreLoc;
    }

    //Getters and Setters
    
    public Long getIdLoc() {
        return idLoc;
    }

    public String getNombreLoc() {
        return nombreLoc;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setIdLoc(Long idLoc) {
        this.idLoc = idLoc;
    }

    public void setNombreLoc(String nombreLoc) {
        this.nombreLoc = nombreLoc;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    
}
