package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.model.Provincia;
import java.util.List;

public interface IProvinciaService {
    
    ///Operaciones CRUD///
    
    public List<Provincia> traerProvincias();
    
    public void crearProvincia(Provincia prov);
    
    public void modificarProvincia(Provincia prov);
    
    public void borrarProvincia(Long id);
}
