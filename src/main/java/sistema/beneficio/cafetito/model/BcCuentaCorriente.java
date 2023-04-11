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
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

/**
 *
 * @author TopVargas
 */
@Builder
@Entity
@Table(name = "bc_cuenta_corriente", schema = "db_cafetito")
public class BcCuentaCorriente {
    
    private String noCuenta;
    private BigDecimal pesoTotal;
    private int cantidadParcialidades;
    private int estado;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public BcCuentaCorriente() {
    }

    public BcCuentaCorriente(String noCuenta, BigDecimal pesoTotal, int cantidadParcialidades, int estado, String usuarioCreacion, Date fechaCreacion) {
        this.noCuenta = noCuenta;
        this.pesoTotal = pesoTotal;
        this.cantidadParcialidades = cantidadParcialidades;
        this.estado = estado;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id
    @Column(name="numero_cuenta", length = 20)
    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    @Column(name="peso_total")
    public BigDecimal getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(BigDecimal pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    @Column(name="cantidad_parcialidades")
    public int getCantidadParcialidades() {
        return cantidadParcialidades;
    }

    public void setCantidadParcialidades(int cantidadParcialidades) {
        this.cantidadParcialidades = cantidadParcialidades;
    }

    @Column(name="estado_cuenta")
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
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
