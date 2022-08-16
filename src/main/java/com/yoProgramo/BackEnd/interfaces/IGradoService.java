package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.model.Grado;
import java.util.List;

public interface IGradoService {
    
    ///Operaciones CRUD///
    public List<Grado> traerGrados();
    
    public void crearGrado(Grado grado);
    
    public void modificarGrado(Grado grado);
    
    public void borrarGrado(Long id);
}
