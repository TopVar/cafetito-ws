/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

/**
 *
 * @author TopVargas
 */
@Builder
@Entity
@Table(name = "bc_transportistas", schema = "db_cafetito")
public class BcTransportistas {
    
    private String idLicencia;
    private String tipoLicencia;
    private String nombre;
    private String telefono;
    private String email;
    private Integer estado;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public BcTransportistas() {
    }

    public BcTransportistas(String idLicencia, String tipoLicencia, String nombre, String telefono, String email, Integer estado, String usuarioCreacion, Date fechaCreacion) {
        this.idLicencia = idLicencia;
        this.tipoLicencia = tipoLicencia;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id
    @Column(name="id_licencia", length = 15)
    public String getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(String idLicencia) {
        this.idLicencia = idLicencia;
    }

    @Column(name="tipo_licencia", length = 5)
    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    @Column(name="nombre_transportista", length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="telefono_transportista", length = 10)
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Column(name="email_transportista", length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="estado_transportista")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column(name="usuario_creacion", length = 50)
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    @Column(name="fecha_creacion")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
