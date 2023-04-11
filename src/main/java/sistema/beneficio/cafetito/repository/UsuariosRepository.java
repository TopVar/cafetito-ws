/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema.beneficio.cafetito.model.BcUsuarios;

/**
 *
 * @author TopVargas
 */
public interface UsuariosRepository extends JpaRepository<BcUsuarios, String>{
    
}
