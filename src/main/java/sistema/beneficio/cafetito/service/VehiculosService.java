/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.service;

import aj.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import sistema.beneficio.cafetito.dto.RespuestaGeneralDto;
import sistema.beneficio.cafetito.dto.VehiculosPruebaDto;
import sistema.beneficio.cafetito.repository.VehiculosRepository;

/**
 *
 * @author TopVargas
 */
@Service
public class VehiculosService {
    
    @Autowired
    private VehiculosRepository vehiculosRepository;
    
    @Autowired
    private ConsumoService consumoService;
    
    public List<VehiculosPruebaDto> pruebaConsumo(){
        
        RespuestaGeneralDto<List<VehiculosPruebaDto>> resultado = consumoService.consumeCompleteUrlOracle(null, "vehiculos", RespuestaGeneralDto.class, HttpMethod.GET);
        //List<VehiculosPruebaDto> ws = new ObjectMapper().convertValue(resultado.data(), TypeReference<List<VehiculosPruebaDto>>(){});
        return resultado.getData();
        /*GeneralResponseDto<List<UnidadesAdministrativasWsDto>> resultado = consumosService.consumeCompleteUrlSqlServer(null, "administrative/units/", GeneralResponseDto.class, HttpMethod.GET);
        List<UnidadesAdministrativasWsDto> wsUnits = new ObjectMapper().convertValue(resultado.getData(), new TypeReference<List<UnidadesAdministrativasWsDto>>() {
            });*/
    }
}
