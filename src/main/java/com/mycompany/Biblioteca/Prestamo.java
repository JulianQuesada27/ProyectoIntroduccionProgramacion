/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

/**
 *
 * @author julianquesadamora
 */



public class Prestamo {
    private String codigoLibro;
    private String idUsuario;
    private String fechaPrestamo;
    private String fechaEntrega;

    public Prestamo(String codigoLibro, String idUsuario, String fechaPrestamo, String fechaEntrega) {
        this.codigoLibro = codigoLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String mostrarInfo() {
        return "Código Libro: " + codigoLibro + 
               " | ID Usuario: " + idUsuario + 
               " | Fecha Préstamo: " + fechaPrestamo + 
               " | Fecha Entrega: " + fechaEntrega;
    }
        public String toString() {
        return mostrarInfo();
    }
}