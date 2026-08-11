/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;
//Autor: SebastianMora
import javax.swing.JOptionPane;

public class Validaciones {

    /**
     * Confirma la existencia de un libro en el arreglo según su código.
     * @param libros
     * @param codigo
     */
    public static boolean existeLibro(Libro[] libros, String codigo) {
        if (libros == null || codigo == null) {
            return false;
        }
        for (Libro libro : libros) {
            if (libro != null && libro.getCodigo() != null) {
                if (String.valueOf(libro.getCodigo()).equalsIgnoreCase(codigo.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Confirma la existencia de un usuario en el arreglo según su cédula.
     */
    public static boolean existeUsuario(Usuario[] usuarios, String cedula) {
        if (usuarios == null || cedula == null) {
            return false;
        }
        for (Usuario usuario : usuarios) {
            if (usuario != null && usuario.getCedula() != null) {
                if (String.valueOf(usuario.getCedula()).equalsIgnoreCase(cedula.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Valida si un libro existe y está disponible para préstamo.
     */
    public static boolean esLibroDisponible(Libro[] libros, String codigo) {
        if (libros == null || codigo == null) {
            return false;
        }
        for (Libro libro : libros) {
            if (libro != null && libro.getCodigo() != null) {
                if (String.valueOf(libro.getCodigo()).equalsIgnoreCase(codigo.trim())) {
                    return libro.isDisponible();
                }
            }
        }
        return false;
    }

    /**
     * Valida si un usuario ya posee un préstamo activo para evitar duplicados.
     */
    public static boolean tienePrestamoActivo(Prestamo[] prestamos, String cedulaUsuario) {
        if (prestamos == null || cedulaUsuario == null) {
            return false;
        }
        for (Prestamo p : prestamos) {
            if (p != null && p.getCodigoLibro() != null) {
                // Si el objeto Préstamo o Usuario coincide y está activo
                if (p.isActivo()) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Valida que la cadena ingresada no esté vacía ni sea nula.
     */
    public static boolean validarTextoNoVacio(String texto, String nombreCampo) {
        if (texto == null || texto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                "El campo '" + nombreCampo + "' no puede estar vacío.", 
                "Error de Validación", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida que una entrada de texto sea un número entero válido.
     */
    public static boolean validarEntero(String texto, String nombreCampo) {
        if (!validarTextoNoVacio(texto, nombreCampo)) {
            return false;
        }
        try {
            Integer.valueOf(texto.trim());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                "El campo '" + nombreCampo + "' debe contener únicamente números enteros.", 
                "Error de Validación", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}