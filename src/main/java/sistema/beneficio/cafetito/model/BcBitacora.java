/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

/**
 *
 * @author TopVargas
 */
@Builder
@Entity
@Table(name = "bc_bitacora", schema = "db_cafetito")
public class BcBitacora {
    
    private Integer id;
    private String nombreTabla;
    private String idRegistro;
    private char tipoOperacion;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private String datos;

    public BcBitacora() {
    }

    public BcBitacora(Integer id, String nombreTabla, String idRegistro, char tipoOperacion, String usuarioCreacion, Date fechaCreacion, String datos) {
        this.id = id;
        this.nombreTabla = nombreTabla;
        this.idRegistro = idRegistro;
        this.tipoOperacion = tipoOperacion;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.datos = datos;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_bitacora")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="nombre_tabla", length = 30)
    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    @Column(name="id_registro", length = 30)
    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    @Column(name="tipo_operacion")
    public char getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(char tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
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

    @Column(name="datos", length = 200)
    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
    
    
}
