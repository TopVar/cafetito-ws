/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sistema.beneficio.cafetito.model.BcMensajes;
import sistema.beneficio.cafetito.service.MensajesService;

/**
 *
 * @author TopVargas
 */
@RestController
@RequestMapping("/message")
public class MensajesController {
    
    @Autowired
    private MensajesService mensajeService;
    
    @GetMapping
    public List<BcMensajes> getAllMessages(){
        return mensajeService.getAllMessages();
    }
}
