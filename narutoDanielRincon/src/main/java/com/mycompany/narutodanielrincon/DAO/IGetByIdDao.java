/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.narutodanielrincon.DAO;

/**
 *
 * @author user
 */
public interface IGetByIdDao<T> extends IDao {

    T getById(long id);
}
