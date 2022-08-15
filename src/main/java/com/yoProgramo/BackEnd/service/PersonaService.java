
package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.interfaces.IPersonaService;
import com.yoProgramo.BackEnd.entity.Persona;
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
    public void borrarPersona(Integer id) {
        persRepo.deleteById(id);
    }

    @Override
    public Persona encontrarPersona(Integer id) {
        return persRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona per) {
        Persona persona = encontrarPersona(per.getId());
        persona.setNombre(per.getNombre());
        persona.setApellido(per.getApellido());
        persona.setFechaNac(per.getFechaNac());
        persona.setEmail(per.getEmail());
        persona.setTelefono(per.getTelefono());
        
        persRepo.save(per);
    }
    
}
