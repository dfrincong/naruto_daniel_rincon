/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.narutodanielrincon.ninja.controlador;

import com.mycompany.narutodanielrincon.ninja.modelo.DAO.NinjaDao;
import com.mycompany.narutodanielrincon.ninja.modelo.clases.Ninja;
import java.util.List;

/**
 *
 * @author user
 */
public class NinjaControlador {
    private final static NinjaDao ninjaDao = new NinjaDao();
    
    public static List<Ninja> getAllNinja() {
        return ninjaDao.getAll();
    }
}
