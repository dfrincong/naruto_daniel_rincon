/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface MisionBuilder {
    MisionBuilder id(int id);
    MisionBuilder descripcion(String descripcion);
    MisionBuilder rango(String rango);
    MisionBuilder recompensa(String recompensa);
    MisionBuilder fechaInicio(Date fechaInicio);
    MisionBuilder fechaFin(Date fechaFin);
    MisionBuilder ninjas(List<Ninja> ninjas);
    Mision build();
}
