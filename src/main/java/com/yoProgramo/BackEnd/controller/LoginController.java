
package com.yoProgramo.BackEnd.controller;

import com.yoProgramo.BackEnd.model.Usuario;
import com.yoProgramo.BackEnd.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @Autowired
    private IUsuarioService userServ;
    
    @GetMapping ("/usuario/traer")
    @ResponseBody
    public List<Usuario> traerUsuarios(){
        return userServ.traerUsuarios();
    }
    
    @PostMapping ("/usuario/crear")
    public void crearUsuario(@RequestBody Usuario user){
        userServ.crearUsuario(user);
    }
    
    @DeleteMapping ("/usuario/borrar/{id}")
    public void borrarUsuario(@PathVariable Integer id){
        userServ.borrarUsuario(id);
    }
    
    @GetMapping ("/usuario/encontrar/{id}")
    public Usuario encontrarUsuario(@PathVariable Integer id){
        return userServ.encontrarUsuario(id);
    }
    
    @PutMapping ("/usuario/modificar")
    public void modificarUsuario(@RequestBody Usuario user){
        Usuario usuario = encontrarUsuario(user.getId());
        usuario.setEmail(user.getEmail());
        usuario.setPassword(user.getPassword());
        
        userServ.crearUsuario(usuario);
    }
}
