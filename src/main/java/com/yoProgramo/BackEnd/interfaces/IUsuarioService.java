
package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> traerUsuarios();
    
    public void crearUsuario(Usuario user);
    
    public void borrarUsuario(Long id);
    
    public Usuario encontrarUsuario(Long id);

}
