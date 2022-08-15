
package com.yoProgramo.BackEnd.controller;

import com.yoProgramo.BackEnd.entity.Usuario;
import com.yoProgramo.BackEnd.interfaces.IUsuarioService;
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
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Usuario> traerUsuarios(){
        return userServ.traerUsuarios();
    }
    
    @PostMapping ("/crear")
    public void crearUsuario(@RequestBody Usuario user){
        userServ.crearUsuario(user);
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarUsuario(@PathVariable Integer id){
        userServ.borrarUsuario(id);
    }
    
    @PutMapping ("/modificar")
    public void modificarUsuario(@RequestBody Usuario user) {
        Usuario usuario = userServ.encontrarUsuario(user.getId());
        usuario.setUsername(user.getUsername());
        usuario.setPassword(user.getPassword());
        
        userServ.crearUsuario(usuario);
    }
}
