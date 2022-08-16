package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    ///Operaciones CRUD///
    
    public List<Persona> traerPersonas();
    
    public void crearPersona(Persona per);
    
    public void modificarPersona(Persona per);
    
    public void borrarPersona(Long id);
}
