/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.narutodanielrincon;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NarutoDanielRincon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("-----------------------------------");
                System.out.println("Bienvenido a la gestion de la aldea ninja konoha");
                System.out.println("1. Listar todos los ninjas junto con sus habilidades");
                System.out.println("2. Mostrar las misiones disponibles para un ninja especifico");
                System.out.println("3. Mostrar las misiones completadas para un ninja especifico");
                System.out.println("4. Asignar una mision a un ninja colocando su fecha de inicio");
                System.out.println("5. Marcar una mision como completada, registrando su fecha de finalización");
                System.out.println("6. Mostrar todas las msiones completadas (archivo de texto)");
                System.out.println("7. Salir");
                System.out.println("-----------------------------------");
                System.out.print("Elige una opción: ");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("1. Listando todos los ninjas junto con sus habilidades");
                        break;
                    case 2:
                        System.out.println("2. Mostrando las misiones disponibles para un ninja especifico");
                        break;
                    case 3:
                        System.out.println("3. Mostrando las misiones completadas para un ninja especifico");
                        break;
                    case 4:
                        System.out.println("4. Asignando una mision a un ninja colocando su fecha de inicio");
                        break;
                    case 5:
                        System.out.println("5. Marcando una mision como completada, registrando su fecha de finalización");
                        break;
                    case 6:
                        System.out.println("6. Mostrando todas las msiones completadas (archivo de texto)");
                        break;
                    case 7:
                        System.out.println("Saliendo!");
                        System.exit(0);
                    default:
                        System.out.println("Opción invalida. Ingrese otra opción.");
                }
            } catch (Exception e) {
                System.out.println("Ingrese el valor indicado.");
            }
        }
    }
}
