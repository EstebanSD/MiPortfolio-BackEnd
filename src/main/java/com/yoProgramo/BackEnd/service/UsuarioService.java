
package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.interfaces.IUsuarioService;
import com.yoProgramo.BackEnd.model.Usuario;
import com.yoProgramo.BackEnd.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService  {
    
    @Autowired
    private UsuarioRepository userRepo; 
    
    @Override
    public List<Usuario> traerUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario user) {
        userRepo.save(user);
    }

    @Override
    public void borrarUsuario(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void modificarUsuario(Usuario user) {
        Usuario usuario = userRepo.findById(user.getIdUser()).orElse(null);
        usuario.setNameUser(user.getNameUser());
        usuario.setPasswordUser(user.getPasswordUser());
        
        userRepo.save(usuario);
    }
    
}
