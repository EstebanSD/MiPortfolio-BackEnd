
package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> traerUsuarios();
    
    public void crearUsuario(Usuario user);
    
    public void borrarUsuario(Integer id);
    
    public Usuario encontrarUsuario(Integer id);
    
    public void modificarUsuario(Usuario user);
}
