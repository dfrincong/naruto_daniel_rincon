package com.mycompany.narutodanielrincon.ninja.modelo.clases;

import com.mycompany.narutodanielrincon.habilidad.Habilidad;
import com.mycompany.narutodanielrincon.mision.modelo.clases.Mision;
import java.util.List;

public class Ninja {
    private int id;
    private String nombre;
    private String rango;
    private String aldea;
    private Habilidad habilidad;
    private List<Mision> misiones;

    public Ninja() {
    }

    public Ninja(int id, String nombre, String rango, String aldea, Habilidad habilidad, List<Mision> misiones) {
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
        this.habilidad = habilidad;
        this.misiones = misiones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public List<Mision> getMisiones() {
        return misiones;
    }

    public void setMisiones(List<Mision> misiones) {
        this.misiones = misiones;
    }

    @Override
    public String toString() {
        return "Ninja{" + "id=" + id + ", nombre=" + nombre + ", rango=" + rango + ", aldea=" + aldea + ", habilidad=" + habilidad + ", misiones=" + misiones + '}';
    }

    


}
