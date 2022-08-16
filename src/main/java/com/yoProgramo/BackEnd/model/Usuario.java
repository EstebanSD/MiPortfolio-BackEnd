
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "usuarios")
public class Usuario implements Serializable { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    
    @Column (length = 45,nullable = false)
    private String nameUser;
    
    @Column (length = 45,nullable = false)
    private String passwordUser;
    
    @OneToOne (targetEntity = Persona.class,fetch = FetchType.LAZY)
    @JoinColumn (name = "persona_id", referencedColumnName = "idPer")
    private Persona persona;

    public Usuario() {
    }

    public Usuario(Long idUser, String nameUser, String passwordUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }
    
}
