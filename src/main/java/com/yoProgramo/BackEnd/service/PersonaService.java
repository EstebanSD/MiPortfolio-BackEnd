
package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.interfaces.IPersonaService;
import com.yoProgramo.BackEnd.model.Persona;
import com.yoProgramo.BackEnd.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persRepo;

    @Override
    public List<Persona> traerPersonas() {
        return persRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
       persRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public void modificarPersona(Persona per) {
        Persona persona = persRepo.findById(per.getIdPer()).orElse(null);
        persona.setNombrePer(per.getNombrePer());
        persona.setApellidoPer(per.getApellidoPer());
        persona.setFechaNac(per.getFechaNac());
        persona.setEmailPer(per.getEmailPer());
        persona.setTelefonoPer(per.getTelefonoPer());
        persona.setFotoPerfil(per.getFotoPerfil());
        persona.setImgBanner(per.getImgBanner());
        persona.setLocalidad(per.getLocalidad());
        
        persRepo.save(per);
    }
    
}
