/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author TopVargas
 */
@Data
@Slf4j
@Configuration
@AllArgsConstructor
@NoArgsConstructor
public class Config implements WebMvcConfigurer {
    
    @Value("${spring.consumos.pingUrlWs}")
    private String pingUrlWs;
    
}
