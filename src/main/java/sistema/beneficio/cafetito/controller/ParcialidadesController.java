/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sistema.beneficio.cafetito.service.ParcialidadesService;

/**
 *
 * @author TopVargas
 */
@RestController
@RequestMapping("/parcualidad")
public class ParcialidadesController {
    
    @Autowired
    private ParcialidadesService parcialidadesService;
}
