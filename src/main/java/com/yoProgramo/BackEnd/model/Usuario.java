
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "usuarios")
public class Usuario implements Serializable { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    
    @Column (nullable = false)
    private String nameUser;
    
    @Column (nullable = false)
    private String passwordUser;
    
    @ManyToOne (targetEntity = Persona.class,fetch = FetchType.LAZY)
    private List<Persona> persona;

    public Usuario() {
    }

    public Usuario(Long idUser, String nameUser, String passwordUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }  
    
    
}
