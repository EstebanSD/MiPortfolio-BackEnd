
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
@Table (name = "localidades")
public class Localidad implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLoc;
    
    @Column (length = 45)
    private String nombreLoc;
    
    @ManyToOne (targetEntity = Provincia.class,fetch = FetchType.LAZY)
    @JoinColumn (name = "provincia_id", referencedColumnName = "idProv")
    private Provincia provincia;

    public Localidad() {
    }

    public Localidad(Long idLoc, String nombreLoc) {
        this.idLoc = idLoc;
        this.nombreLoc = nombreLoc;
    }
    
}
