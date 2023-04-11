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
@Table(name = "bc_usuarios", schema = "db_cafetito")
public class BcVehiculos {
    
    private String placa;
    private String marca;
    private int modelo;
    private String color;
    private String tipo;
    private Integer estado;
    private BigDecimal pesoVehiculo;
    private String usuarioCreacion;
    private Date fechaCreacion;

    public BcVehiculos() {
    }
    
    public BcVehiculos(String placa, String marca, int modelo, String color, String tipo, Integer estado, BigDecimal pesoVehiculo, String usuarioCreacion, Date fechaCreacion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.estado = estado;
        this.pesoVehiculo = pesoVehiculo;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }

    @Id
    @Column(name="placa_vehiculo", length = 10)
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Column(name="marca_vehiculo", length = 30)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Column(name="modelo_vehiculo")
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Column(name="color_vehiculo", length = 20)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name="tipo_vehiculo", length = 30)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Column(name="estado_vehiculo")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column(name="peso_vehiculo")
    public BigDecimal getPesoVehiculo() {
        return pesoVehiculo;
    }

    public void setPesoVehiculo(BigDecimal pesoVehiculo) {
        this.pesoVehiculo = pesoVehiculo;
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
