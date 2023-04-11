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
@Table(name = "bc_mensajes", schema = "db_cafetito")
public class BcMensajes {
    
    private Integer id;
    private String noCuenta;
    private String placaVehiculo;
    private Integer idParcialidad;
    private int parcialidades;
    private BigDecimal totalPesaje;
    private Integer estado;
    private String mensaje;
    private Integer aprobacion;
    private Integer correcion;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public BcMensajes() {
    }

    public BcMensajes(Integer id, String noCuenta, String placaVehiculo, Integer idParcialidad, int parcialidades, BigDecimal totalPesaje, Integer estado, String mensaje, Integer aprobacion, Integer correcion, String usuarioCreacion, Date fechaCreacion) {
        this.id = id;
        this.noCuenta = noCuenta;
        this.placaVehiculo = placaVehiculo;
        this.idParcialidad = idParcialidad;
        this.parcialidades = parcialidades;
        this.totalPesaje = totalPesaje;
        this.estado = estado;
        this.mensaje = mensaje;
        this.aprobacion = aprobacion;
        this.correcion = correcion;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mensaje")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="numero_cuenta", length = 20)
    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    @Column(name="placa_vehiculo", length = 10)
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    @Column(name="id_parcialidad")
    public Integer getIdParcialidad() {
        return idParcialidad;
    }

    public void setIdParcialidad(Integer idParcialidad) {
        this.idParcialidad = idParcialidad;
    }

    @Column(name="parcialidades")
    public int getParcialidades() {
        return parcialidades;
    }

    public void setParcialidades(int parcialidades) {
        this.parcialidades = parcialidades;
    }

    @Column(name="total_pesaje")
    public BigDecimal getTotalPesaje() {
        return totalPesaje;
    }

    public void setTotalPesaje(BigDecimal totalPesaje) {
        this.totalPesaje = totalPesaje;
    }

    @Column(name="estado_mensaje")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column(name="mensaje", length = 250)
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Column(name="aprobado")
    public Integer getAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(Integer aprobacion) {
        this.aprobacion = aprobacion;
    }

    @Column(name="correcion")
    public Integer getCorrecion() {
        return correcion;
    }

    public void setCorrecion(Integer correcion) {
        this.correcion = correcion;
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
