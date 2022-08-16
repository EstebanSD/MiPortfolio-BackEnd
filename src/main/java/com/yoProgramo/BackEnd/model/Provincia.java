
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "provincias")
public class Provincia implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idProv;
    
    @Column (nullable = false)
    private String nombreProv;

    public Provincia() {
    }

    public Provincia(Long idProv, String nombreProv) {
        this.idProv = idProv;
        this.nombreProv = nombreProv;
    }
    
}
