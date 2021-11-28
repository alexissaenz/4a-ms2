package com.misiontic.ecoturism.models;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Plan {
    @Id
    private String idPlan;
    private Integer idUsuario;
    private Float valor;
    private Date fInicio;
    private Date fFin;
    private Boolean completado;
    private List<Servicio> servicios;

    public Plan(String idPlan, Integer idUsuario, Float valor, Date fInicio, Date fFin, Boolean completado, List<Servicio> servicios) {
        this.idPlan = idPlan;
        this.idUsuario = idUsuario;
        this.valor = valor;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.completado = completado;
        this.servicios = servicios;
    }

    public String getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(String idPlan) {
        this.idPlan = idPlan;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public Date getfFin() {
        return fFin;
    }

    public void setfFin(Date fFin) {
        this.fFin = fFin;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}
