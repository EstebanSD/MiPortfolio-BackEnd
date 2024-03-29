
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Grado implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idGrado;
    
    @Column (length = 45)
    private String nombreGrado;

    public Grado() {
    }

    public Grado(Long idGrado, String nombreGrado) {
        this.idGrado = idGrado;
        this.nombreGrado = nombreGrado;
    }
    
    
}
