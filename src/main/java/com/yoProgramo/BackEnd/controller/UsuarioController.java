
package com.yoProgramo.BackEnd.controller;

import com.yoProgramo.BackEnd.interfaces.IPersonaService;
import com.yoProgramo.BackEnd.model.Usuario;
import com.yoProgramo.BackEnd.interfaces.IUsuarioService;
import com.yoProgramo.BackEnd.model.Persona;
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
@RequestMapping ("/usuario")
public class UsuarioController {
    
    @Autowired
    private IUsuarioService userServ;
    
    @Autowired
    private IPersonaService perServ;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Usuario> traerUsuarios(){
        return userServ.traerUsuarios();
    }
    
    @PostMapping ("/crear")
    public void crearUsuario(@RequestBody Usuario user){
        Persona perso = new Persona();
        perServ.crearPersona(perso);
        user.setPersona(perso);
        userServ.crearUsuario(user);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarUsuario(@PathVariable Long id){
        userServ.borrarUsuario(id);
    }
    
    @PutMapping ("/modificar")
    public void modificarUsuario(@RequestBody Usuario user) {       
        userServ.modificarUsuario(user);
    }
}
