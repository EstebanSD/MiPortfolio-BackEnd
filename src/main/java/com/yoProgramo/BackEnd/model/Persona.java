
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
    
    @Column (length = 45)
    private String nombrePer;
    
    @Column (length = 45)
    private String apellidoPer;
    
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    
    @Column (length = 45)
    private String emailPer;
    @Column (length = 45)
    private String telefonoPer;
    @Column (length = 150)
    private String fotoPerfil;
    @Column (length = 150)
    private String imgBanner;
    
    @ManyToOne (targetEntity = Localidad.class,fetch = FetchType.LAZY)
    @JoinColumn (name = "localidad_id", referencedColumnName = "idProv")
    private Localidad localidad;
    
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
