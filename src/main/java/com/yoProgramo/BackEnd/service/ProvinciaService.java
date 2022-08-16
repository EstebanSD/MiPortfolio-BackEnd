
package com.yoProgramo.BackEnd.service;

import com.yoProgramo.BackEnd.interfaces.IProvinciaService;
import com.yoProgramo.BackEnd.model.Provincia;
import com.yoProgramo.BackEnd.repository.ProvinciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService implements IProvinciaService{            
    
    @Autowired
    private ProvinciaRepository provRepo;
    
    
    @Override
    public List<Provincia> traerProvincias() {
        return provRepo.findAll();
    }
        
}
