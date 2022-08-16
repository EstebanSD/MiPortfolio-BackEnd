package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.interfaces.ILocalidadService;
import com.yoProgramo.BackEnd.model.Localidad;
import com.yoProgramo.BackEnd.repository.LocalidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class LocalidadService implements ILocalidadService {

    @Autowired
    private LocalidadRepository localRepo;
    
    @Override
    public List<Localidad> traerLocalidades() {
        return localRepo.findAll();
    }

    @Override
    public void crearLocalidad(Localidad local) {
        localRepo.save(local);
    }

    @Override
    public void modificarLocalidad(Localidad local) {
        Localidad localidad = localRepo.findById(local.getIdLoc()).orElse(null);
        localidad.setNombreLoc(local.getNombreLoc());
        localidad.setProvincia(local.getProvincia());
        
        localRepo.save(localidad);
    }

    @Override
    public void borrarLocalidad(Long id) {
        localRepo.deleteById(id);
    }
    
    public Localidad buscarById(Long id) {
        return localRepo.findById(id).orElse(null);
    }
    
    
    /////Posible uso/////
    public Long devolverId(String nombre){
        Long id=null;
        List<Localidad> locales = traerLocalidades();
        for(Localidad local : locales){
            if(nombre.equals(local.getNombreLoc())){
                id = local.getIdLoc();
                break;
            }
        }
        return id;
    }
}
