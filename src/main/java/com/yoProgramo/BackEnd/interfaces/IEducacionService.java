package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    ///Operaciones CRUD///
    
    public List<Educacion> listarEducaciones();
    
    public void crearEducacion(Educacion edu);
    
    public void modificarEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
}
