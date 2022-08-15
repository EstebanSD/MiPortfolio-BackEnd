
package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> traerPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Integer id);
    
    public Persona encontrarPersona(Integer id);
    
    public void modificarPersona(Persona per);
}
