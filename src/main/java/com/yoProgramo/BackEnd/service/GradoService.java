package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.interfaces.IGradoService;
import com.yoProgramo.BackEnd.model.Grado;
import com.yoProgramo.BackEnd.repository.GradoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradoService implements IGradoService {

    @Autowired
    private GradoRepository gradoRepo;
    
    @Override
    public List<Grado> traerGrados() {
        return gradoRepo.findAll();
    }

    @Override
    public void crearGrado(Grado grado) {
        gradoRepo.save(grado);
    }

    @Override
    public void modificarGrado(Grado grado) {
        Grado gr = gradoRepo.findById(grado.getIdGrado()).orElse(null);
        gr.setNombreGrado(grado.getNombreGrado());
        
        gradoRepo.save(gr);
    }

    @Override
    public void borrarGrado(Long id) {
        gradoRepo.deleteById(id);
    }
    
    public Grado buscarById(Long id) {
        return gradoRepo.findById(id).orElse(null);
    }
    
    
    /////Posible uso/////
    public Long devolverId(String nombre){
        Long id=null;
        List<Grado> grados = traerGrados();
        
        for(Grado gr : grados){
            if(nombre.equals(gr.getNombreGrado())){
                id = gr.getIdGrado();
                break;
            }
        }
        
        return id;
    }
}
