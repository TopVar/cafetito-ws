/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author TopVargas
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehiculosPruebaDto {
    private String placa;
    private String marca;
    private String modelo;
    private String anio;
    private int pesoEstimado;
    private String color;
    private String tipoVehiculo;
    private int estado;
    private String usuarioCreacion;
    private Date fechaCreacion;
    
}
