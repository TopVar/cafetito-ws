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
@Table(name = "bc_parcialidades", schema = "db_cafetito")
public class BcParcialidades {
    
    private Integer idParcialidad;
    private BigDecimal peso;
    private Date fechaEnviada;
    private Date fechaEntregada;
    private Integer estado;
    private String licencias;
    private String noCuenta;
    private String placa;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public BcParcialidades() {
    }

    public BcParcialidades(Integer idParcialidad, BigDecimal peso, Date fechaEnviada, Date fechaEntregada, Integer estado, String licencias, String noCuenta, String placa, String usuarioCreacion, Date fechaCreacion) {
        this.idParcialidad = idParcialidad;
        this.peso = peso;
        this.fechaEnviada = fechaEnviada;
        this.fechaEntregada = fechaEntregada;
        this.estado = estado;
        this.licencias = licencias;
        this.noCuenta = noCuenta;
        this.placa = placa;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }
    
    

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_parcialidad")
    public Integer getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(Integer idParcialidad) {
        this.idParcialidad = idParcialidad;
    }

    @Column(name="peso_parcialidad")
    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    @Column(name="fecha_parcialidad_enviada")
    public Date getFechaEnviada() {
        return fechaEnviada;
    }

    public void setFechaEnviada(Date fechaEnviada) {
        this.fechaEnviada = fechaEnviada;
    }

    @Column(name="fecha_parcialidad_entregada")
    public Date getFechaEntregada() {
        return fechaEntregada;
    }

    public void setFechaEntregada(Date fechaEntregada) {
        this.fechaEntregada = fechaEntregada;
    }

    @Column(name="estado_parcialidad")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column(name="licencias_transportistas", length = 100)
    public String getLicencias() {
        return licencias;
    }

    public void setLicencias(String licencias) {
        this.licencias = licencias;
    }

    @Column(name="numero_cuenta", length = 20)
    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    @Column(name="placa_vehiculo", length = 10)
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
