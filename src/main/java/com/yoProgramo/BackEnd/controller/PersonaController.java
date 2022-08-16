
package com.yoProgramo.BackEnd.controller;

import com.yoProgramo.BackEnd.model.Persona;
import com.yoProgramo.BackEnd.interfaces.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/persona")
public class PersonaController {
    
    @Autowired
    private IPersonaService perServ;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Persona> traerPersonas(){
        return perServ.traerPersonas();
    }
    
    @PostMapping ("/crear")
    public void crearPersona(@RequestBody Persona per){
        perServ.crearPersona(per);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        perServ.borrarPersona(id);
    }
    
    @PutMapping ("/modificar")
    public void modificarPersona(Persona per){
        perServ.modificarPersona(per);
    }
    
    
}
