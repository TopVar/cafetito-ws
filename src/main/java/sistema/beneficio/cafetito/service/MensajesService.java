/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema.beneficio.cafetito.model.BcMensajes;
import sistema.beneficio.cafetito.repository.MensajesRepository;

/**
 *
 * @author TopVargas
 */
@Service
public class MensajesService {
    
    @Autowired
    private MensajesRepository mensajesRepository;
    
    public List<BcMensajes> getAllMessages(){
        return mensajesRepository.findAll();
    }
    
}
