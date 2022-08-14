
package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.model.Usuario;
import com.yoProgramo.BackEnd.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService  {
    
    @Autowired
    public UsuarioRepository userRepo; 
    
    @Override
    public List<Usuario> traerUsuarios() {
        
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario user) {

        userRepo.save(user);
    }

    @Override
    public void borrarUsuario(Integer id) {

        userRepo.deleteById(id);
    }

    @Override
    public Usuario encontrarUsuario(Integer id) {
        
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarUsuario(Usuario user) {
        
        userRepo.save(user);
    }
    
}
