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
import sistema.beneficio.cafetito.dto.VehiculosPruebaDto;
import sistema.beneficio.cafetito.service.VehiculosService;

/**
 *
 * @author TopVargas
 */
@RestController
@RequestMapping("/vehiculo")
public class VehiculosController {
 
    @Autowired
    private VehiculosService vehiculoService;
    
    //@Operation(summary = "obtiene todos los vehículos desde el agricultor")
    @GetMapping
    public List<VehiculosPruebaDto> prueba(){
        return vehiculoService.pruebaConsumo();
    }
}
