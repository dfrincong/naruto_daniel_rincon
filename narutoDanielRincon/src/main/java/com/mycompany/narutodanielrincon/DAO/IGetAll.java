/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.narutodanielrincon.DAO;

import java.util.List;

/**
 *
 * @author user
 */
public interface IGetAll<T> extends IDao {
    List<T> getAll();
}
