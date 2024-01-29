/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.narutodanielrincon.ninja.modelo.clases.builder;

import com.mycompany.narutodanielrincon.habilidad.Habilidad;
import com.mycompany.narutodanielrincon.mision.modelo.clases.Mision;
import com.mycompany.narutodanielrincon.ninja.modelo.clases.Ninja;
import java.util.List;

/**
 *
 * @author user
 */
public class NinjaBuilderImpl implements NinjaBuilder {
    private Ninja ninja = new Ninja();

    @Override
    public NinjaBuilder id(int id) {
        ninja.setId(id);
        return this;
    }

    @Override
    public NinjaBuilder nombre(String nombre) {
        ninja.setNombre(nombre);
        return this;
    }

    @Override
    public NinjaBuilder rango(String rango) {
        ninja.setRango(rango);
        return this;
    }

    @Override
    public NinjaBuilder aldea(String aldea) {
        ninja.setAldea(aldea);
        return this;
    }

    @Override
    public NinjaBuilder habilidad(Habilidad habilidad) {
        ninja.setHabilidad(habilidad);
        return this;
    }

    @Override
    public NinjaBuilder misiones(List<Mision> misiones) {
        ninja.setMisiones(misiones);
        return this;
    }

    @Override
    public Ninja build() {
        return ninja;
    }
    
}
