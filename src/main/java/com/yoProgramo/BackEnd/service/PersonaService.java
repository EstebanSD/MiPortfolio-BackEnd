
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
    public PersonaRepository persRepo;

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
    public Persona encontrarPersona(Long id) {
        return persRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona per) {
        Persona persona = encontrarPersona(per.getIdPer());
        persona.setNombrePer(per.getNombrePer());
        persona.setApellidoPer(per.getApellidoPer());
        persona.setFechaNac(per.getFechaNac());
        persona.setEmailPer(per.getEmailPer());
        persona.setTelefonoPer(per.getTelefonoPer());
        
        persRepo.save(per);
    }
    
}
