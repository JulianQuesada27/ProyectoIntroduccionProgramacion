/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectointroduccionprogramacion;

 import javax.swing.JOptionPane;
/**
 *
 * @author julianquesadamora
 */
public class Menu {

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "=== MENÚ PRINCIPAL ===\n" +
                    "1. Saludar\n" +
                    "2. Mostrar mensaje\n" +
                    "3. Salir\n\n" +
                    "Seleccione una opción:"
                )
            );

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Hola, bienvenido");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Esta es la opción 2");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        } while (opcion != 3);
    }
}