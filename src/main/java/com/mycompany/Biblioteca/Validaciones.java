/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

/**
 *

/**
 * @author Sebastianmora
 */
public class Validaciones {

    
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

    
    public static boolean existeUsuario(Usuario[] usuarios, String cedula) {
        if (usuarios == null || cedula == null) {
            return false;
        }
        for (Usuario usuario : usuarios) {
            if (usuario != null && usuario.getCedula() != null) {
                // Convertimos a String para evitar 'cannot find symbol' si getCedula() no retorna String
                if (String.valueOf(usuario.getCedula()).equalsIgnoreCase(cedula.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    
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

    
    public static boolean estaPrestado(Prestamo[] prestamos, String codigoLibro) {
        if (prestamos == null || codigoLibro == null) {
            return false;
        }
        for (Prestamo p : prestamos) {
            if (p != null && p.getCodigoLibro() != null) {
                // Convertimos a String para evitar 'cannot find symbol' si getCodigoLibro() no retorna String
                if (String.valueOf(p.getCodigoLibro()).equalsIgnoreCase(codigoLibro.trim()) && p.isActivo()) {
                    return true;
                }
            }
        }
        return false;
    }

    
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

     
    public static boolean validarEntero(String texto, String nombreCampo) {
        if (!validarTextoNoVacio(texto, nombreCampo)) {
            return false;
        }
        try {
            Integer.parseInt(texto.trim());
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

    
