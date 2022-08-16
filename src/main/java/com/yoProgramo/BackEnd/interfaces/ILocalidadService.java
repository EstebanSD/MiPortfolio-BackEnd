package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.model.Localidad;
import java.util.List;

public interface ILocalidadService {
    
    ///Operaciones CRUD///
    
    public List<Localidad> traerLocalidades();
    
    public void crearLocalidad(Localidad local);
    
    public void modificarLocalidad(Localidad local);
    
    public void borrarLocalidad(Long id);
}
