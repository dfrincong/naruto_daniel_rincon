/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.narutodanielrincon.mision.modelo.clases.buider;

import com.mycompany.narutodanielrincon.mision.modelo.clases.Mision;
import com.mycompany.narutodanielrincon.ninja.modelo.clases.Ninja;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class MisionBuilderImpl implements MisionBuilder {

    Mision mision = new Mision();

    @Override
    public MisionBuilder id(int id) {
        mision.setId(id);
        return this;
    }

    @Override
    public MisionBuilder descripcion(String descripcion) {
        mision.setDescripcion(descripcion);
        return this;
    }

    @Override
    public MisionBuilder rango(String rango) {
        mision.setRango(rango);
        return this;
    }

    @Override
    public MisionBuilder recompensa(String recompensa) {
        mision.setRecompensa(recompensa);
        return this;
    }

    @Override
    public MisionBuilder fechaInicio(Date fechaInicio) {
        mision.setFechaInicio(fechaInicio);
        return this;
    }

    @Override
    public MisionBuilder fechaFin(Date fechaFin) {
        mision.setFechaFin(fechaFin);
        return this;
    }

    @Override
    public MisionBuilder ninjas(List<Ninja> ninjas) {
        mision.setNinjas(ninjas);
        return this;
    }

    @Override
    public Mision build() {
        return mision;
    }

}
