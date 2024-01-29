package com.mycompany.narutodanielrincon.mision.modelo.clases;

import com.mycompany.narutodanielrincon.ninja.modelo.clases.Ninja;
import java.sql.Date;
import java.util.List;

public class Mision {
    private int id;
    private String descripcion;
    private String rango;
    private String recompensa;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Ninja> ninjas;
    

    public Mision() {
    }

    public Mision(int id, String descripcion, String rango, String recompensa, Date fechaInicio, Date fechaFin, List<Ninja> ninjas) {
        this.id = id;
        this.descripcion = descripcion;
        this.rango = rango;
        this.recompensa = recompensa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ninjas = ninjas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(List<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    @Override
    public String toString() {
        return "Mision{" + "id=" + id + ", descripcion=" + descripcion + ", rango=" + rango + ", recompensa=" + recompensa + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", ninjas=" + ninjas + '}';
    }

    

    
}
