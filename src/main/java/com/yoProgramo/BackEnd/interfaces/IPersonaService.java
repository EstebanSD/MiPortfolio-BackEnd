
package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> traerPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona encontrarPersona(Long id);
    
    public void modificarPersona(Persona per);
}
