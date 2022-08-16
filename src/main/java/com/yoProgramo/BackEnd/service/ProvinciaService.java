
package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.interfaces.IProvinciaService;
import com.yoProgramo.BackEnd.model.Provincia;
import com.yoProgramo.BackEnd.repository.ProvinciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService implements IProvinciaService{            
    
    @Autowired
    private ProvinciaRepository provRepo;
    
    
    @Override
    public List<Provincia> traerProvincias() {
        return provRepo.findAll();
    }

    @Override
    public void crearProvincia(Provincia prov) {
        provRepo.save(prov);
    }

    @Override
    public void modificarProvincia(Provincia prov) {
        Provincia provincia = provRepo.findById(prov.getIdProv()).orElse(null);
        provincia.setNombreProv(prov.getNombreProv());
        
        provRepo.save(provincia);
    }

    @Override
    public void borrarProvincia(Long id) {
        provRepo.deleteById(id);
    }
      
    public Provincia buscarById(Long id) {
        return provRepo.findById(id).orElse(null);
    }
    
    
    /////Posible uso/////
    public Long devolverId(String nombre){
        Long id=null;
        List<Provincia> provincias = traerProvincias();
        
        for(Provincia prov : provincias){
            if(nombre.equals(prov.getNombreProv())){
                id = prov.getIdProv();
                break;
            }
        }
        
        return id;
    }
}
