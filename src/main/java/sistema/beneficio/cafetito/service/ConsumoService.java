/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.service;

import com.sun.istack.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sistema.beneficio.cafetito.config.Config;

/**
 *
 * @author TopVargas
 */
@Service
@Slf4j
public class ConsumoService {
    
    private final Config config;

    public ConsumoService(Config config) {
        this.config = config;
    }
    
    /**
     * Método encargado de consumir un servicio y retornar la respuesta del
     * mismo.
     *
     * @param <T>
     * @param body Objeto del cuerpo de la peticion (Puede ser nulo en caso de
     * no necesitarse).
     * @param url Ruta del metodo a consumir.
     * @param klass Clase para dar tipo a la respuesta que retorna el ws.
     * @param type Tipo de peticion HTTP a realizar.
     * @param headers Encabezados de la petición.
     *
     * @return Respuesta del ws en base al tipo recibido.
     */
    public <T> T consumeCompleteUrlOracle(@Nullable Object body, @NotNull @NotBlank String method, @NotNull Class<T> klass, @NotNull HttpMethod type) {
        RestTemplate restTemplate = new RestTemplate();
        String url = config.getPingUrlWs() + method;
        //log.debug(url);
        HttpEntity<?> requestBody = new HttpEntity<>(body);
        return restTemplate.exchange(url, type, requestBody, klass).getBody();
    }
    
    public <T> T consumeCompleteUrlOracle(@Nullable Object body, @NotNull @NotBlank String method, @NotNull ParameterizedTypeReference<T> klass, @NotNull HttpMethod type) {
        RestTemplate restTemplate = new RestTemplate();
        String url = config.getPingUrlWs() + method;
        //log.debug(url);
        HttpEntity<?> requestBody = new HttpEntity<>(body);
        return restTemplate.exchange(url, type, requestBody, klass).getBody();
    }

    public Config getConfig() {
        return config;
    }
}
