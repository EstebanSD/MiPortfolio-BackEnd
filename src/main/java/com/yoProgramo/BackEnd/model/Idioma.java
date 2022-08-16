
package com.yoProgramo.BackEnd.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "idiomas")
public class Idioma implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idIdioma;
    
    private String nombreIdioma;
    private String gradoIdioma;

    public Idioma() {
    }

    public Idioma(Long idIdioma, String nombreIdioma, String gradoIdioma) {
        this.idIdioma = idIdioma;
        this.nombreIdioma = nombreIdioma;
        this.gradoIdioma = gradoIdioma;
    }
    
    
}
