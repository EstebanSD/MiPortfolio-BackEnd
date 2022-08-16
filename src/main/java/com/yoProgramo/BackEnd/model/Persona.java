
package com.yoProgramo.BackEnd.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Getter @Setter
@Entity
@Table (name = "personas")
public class Persona implements Serializable{
    
    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO) 
    private Long idPer;
    
    @Column (nullable = false)
    private String nombrePer;
    
    @Column (nullable = false)
    private String apellidoPer;
    
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column (nullable = false)
    private Date fechaNac;
    
    private String emailPer;
    private String telefonoPer;
    
    //
    //Agregar redes, imagenes y demas
    //
    
    public Persona() {
    }

    public Persona(Long idPer, String nombrePer, String apellidoPer, Date fechaNac, String emailPer, String telefonoPer) {
        this.idPer = idPer;
        this.nombrePer = nombrePer;
        this.apellidoPer = apellidoPer;
        this.fechaNac = fechaNac;
        this.emailPer = emailPer;
        this.telefonoPer = telefonoPer;
    }
    
    
}
