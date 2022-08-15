
package com.yoProgramo.BackEnd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String username;
    private String password;
    
    @ManyToOne
    @JoinColumn (name = "persona_id")
    private Persona persona;

    public Usuario() {
    }

    public Usuario(int id, String username, String password, Persona persona) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.persona = persona;
    }
    
    
}
