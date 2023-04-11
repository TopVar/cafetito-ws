/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.beneficio.cafetito.model;

import java.math.BigDecimal;
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
@Table(name = "bc_boleta_pesaje", schema = "db_cafetito")
public class BcBoletaPesaje {
    
    private Integer idBoleta;
    private BigDecimal resultadoPesaje;
    private Date fechaIngreso;
    private Date fechaSalida;
    private String usuarioCreacion;
    private Date fechaCreacion;
    private Integer idParcialidad;

    public BcBoletaPesaje() {
    }

    public BcBoletaPesaje(Integer idBoleta, BigDecimal resultadoPesaje, Date fechaIngreso, Date fechaSalida, String usuarioCreacion, Date fechaCreacion, Integer idParcialidad) {
        this.idBoleta = idBoleta;
        this.resultadoPesaje = resultadoPesaje;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
        this.idParcialidad = idParcialidad;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_boleta")
    public Integer getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }

    @Column(name="resultado_pesaje")
    public BigDecimal getResultadoPesaje() {
        return resultadoPesaje;
    }

    public void setResultadoPesaje(BigDecimal resultadoPesaje) {
        this.resultadoPesaje = resultadoPesaje;
    }

    @Column(name="fecha_hora_ingreso")
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Column(name="fecha_hora_salida")
    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
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

    @Column(name="id_parcialidad")
    public Integer getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(Integer idParcialidad) {
        this.idParcialidad = idParcialidad;
    }
    
    
    
}
