
package com.yoProgramo.BackEnd.interfaces;

import com.yoProgramo.BackEnd.entity.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> traerUsuarios();
    
    public void crearUsuario(Usuario user);
    
    public void borrarUsuario(Integer id);
    
    public Usuario encontrarUsuario(Integer id);

}
