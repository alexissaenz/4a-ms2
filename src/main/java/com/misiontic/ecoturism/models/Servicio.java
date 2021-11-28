package com.misiontic.ecoturism.models;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.annotation.Id;

public class Servicio {
    private Integer idServicio;
    private Integer idTipoServicio;
    private Integer idProveedor;
    private String nombre;
    private Boolean completado;
    private Float precio;

    public Servicio(Integer idServicio, Integer idTipoServicio, Integer idProveedor, String nombre, Boolean completado, Float precio) {
        this.idServicio = idServicio;
        this.idTipoServicio = idTipoServicio;
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.completado = completado;
        this.precio = precio;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public Integer getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(Integer idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}
