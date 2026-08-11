/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

/**
 *
 * @author julianquesadamora
 */
public class Reporte {
 private Libro[] arregloLibros;
    private Prestamo[] arregloPrestamos;
    private Devolucion[] arregloDevoluciones;

    
    public Reporte(Libro[] arregloLibros, Prestamo[] arregloPrestamos, Devolucion[] arregloDevoluciones) {
        this.arregloLibros = arregloLibros;
        this.arregloPrestamos = arregloPrestamos;
        this.arregloDevoluciones = arregloDevoluciones;
    }

    // ==========================================
    // REPORTE 1: LISTAR TODOS LOS PRÉSTAMOS
    // ==========================================
    public void reportePrestamos() {
        String texto = "===== REPORTE DE PRÉSTAMOS =====\n\n";
        int contador = 0;

        for (int i = 0; i < arregloPrestamos.length; i++) {
            if (arregloPrestamos[i] != null) {
                texto = texto + "Código Libro: " + arregloPrestamos[i].getCodigoLibro() + "\n";
                texto = texto + "ID Usuario: " + arregloPrestamos[i].getIdUsuario() + "\n";
                texto = texto + "Fecha Préstamo: " + arregloPrestamos[i].getFechaPrestamo() + "\n";
                texto = texto + "Fecha Entrega: " + arregloPrestamos[i].getFechaEntrega() + "\n";
                texto = texto + "---------------------------\n";
                contador++;
            }
        }

        if (contador == 0) {
            texto = texto + "No hay préstamos registrados.";
        } else {
            texto = texto + "\nTotal préstamos: " + contador;
        }

        JOptionPane.showMessageDialog(null, texto);
    }

    // ==========================================
    // REPORTE 2: LISTAR TODAS LAS DEVOLUCIONES
    // ==========================================
    public void reporteDevoluciones() {
        String texto = "===== REPORTE DE DEVOLUCIONES =====\n\n";
        int contador = 0;

        for (int i = 0; i < arregloDevoluciones.length; i++) {
            if (arregloDevoluciones[i] != null) {
                texto = texto + "Código Libro: " + arregloDevoluciones[i].getCodigoLibro() + "\n";
                texto = texto + "ID Usuario: " + arregloDevoluciones[i].getIdUsuario() + "\n";
                texto = texto + "Fecha Devolución: " + arregloDevoluciones[i].getFechaDevolucion() + "\n";
                texto = texto + "---------------------------\n";
                contador++;
            }
        }

        if (contador == 0) {
            texto = texto + "No hay devoluciones registradas.";
        } else {
            texto = texto + "\nTotal devoluciones: " + contador;
        }

        JOptionPane.showMessageDialog(null, texto);
    }

    // ==========================================
    // REPORTE 3: ESTADO GENERAL DE LA BIBLIOTECA
    // ==========================================
    public void estadoBiblioteca() {
        int totalLibros = 0;
        int disponibles = 0;
        int prestados = 0;
        int totalPrestamos = 0;
        int totalDevoluciones = 0;

      
        for (int i = 0; i < arregloLibros.length; i++) {
            if (arregloLibros[i] != null) {
                totalLibros++;
                if (arregloLibros[i].isDisponible()) {
                    disponibles++;
                } else {
                    prestados++;
                }
            }
        }

        // Contar préstamos
        for (int i = 0; i < arregloPrestamos.length; i++) {
            if (arregloPrestamos[i] != null) {
                totalPrestamos++;
            }
        }

        // Contar devoluciones
        for (int i = 0; i < arregloDevoluciones.length; i++) {
            if (arregloDevoluciones[i] != null) {
                totalDevoluciones++;
            }
        }

        // Mostrar resumen
        String resumen = "===== ESTADO GENERAL =====\n"
                + "Total de libros: " + totalLibros + "\n"
                + "Disponibles: " + disponibles + "\n"
                + "Prestados: " + prestados + "\n"
                + "Total préstamos: " + totalPrestamos + "\n"
                + "Total devoluciones: " + totalDevoluciones;

        JOptionPane.showMessageDialog(null, resumen);
    }

    // ==========================================
    // REPORTE 4: SOLO LIBROS DISPONIBLES
    // ==========================================
    public void librosDisponibles() {
        String texto = "===== LIBROS DISPONIBLES =====\n\n";
        int contador = 0;

        for (int i = 0; i < arregloLibros.length; i++) {
            if (arregloLibros[i] != null && arregloLibros[i].isDisponible()) {
                texto = texto + "Código: " + arregloLibros[i].getCodigo() + "\n";
                texto = texto + "Título: " + arregloLibros[i].getTitulo() + "\n";
                texto = texto + "Autor: " + arregloLibros[i].getAutor() + "\n";
                texto = texto + "---------------------------\n";
                contador++;
            }
        }

        if (contador == 0) {
            texto = texto + "No hay libros disponibles en este momento.";
        } else {
            texto = texto + "\nTotal disponibles: " + contador;
        }

        JOptionPane.showMessageDialog(null, texto);
    }

    // ==========================================
    // MENÚ PRINCIPAL DE REPORTES
    // ==========================================
    public void menuReportes() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog(
                    "===== MENÚ DE REPORTES =====\n"
                    + "1. Reporte de préstamos\n"
                    + "2. Reporte de devoluciones\n"
                    + "3. Estado general de la biblioteca\n"
                    + "4. Listar libros disponibles\n"
                    + "5. Volver al menú principal\n\n"
                    + "Elija una opción:"
            );

            if (opcion == null) return;

            switch (opcion) {
                case "1": reportePrestamos(); break;
                case "2": reporteDevoluciones(); break;
                case "3": estadoBiblioteca(); break;
                case "4": librosDisponibles(); break;
                case "5": break;
                default: JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
            }
        } while (!"5".equals(opcion));
    }
}




    
}
