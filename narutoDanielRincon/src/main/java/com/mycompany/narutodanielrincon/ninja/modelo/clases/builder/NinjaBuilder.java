/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface NinjaBuilder {
    NinjaBuilder id(int id);
    NinjaBuilder nombre(String nombre);
    NinjaBuilder rango(String rango);
    NinjaBuilder aldea(String aldea);
    NinjaBuilder habilidad(Habilidad habilidad);
    NinjaBuilder misiones(List<Mision> misiones);
    Ninja build();
}
