/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

/**
 *
 * @author julianquesadamora
 */

public class Devolucion {
    private String codigoLibro;
    private String idUsuario;
    private String fechaDevolucion;

    public Devolucion(String codigoLibro, String idUsuario, String fechaDevolucion) {
        this.codigoLibro = codigoLibro;
        this.idUsuario = idUsuario;
        this.fechaDevolucion = fechaDevolucion;
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

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String mostrarInfo() {
        return "Código Libro: " + codigoLibro + 
               " | ID Usuario: " + idUsuario + 
               " | Fecha Devolución: " + fechaDevolucion;
    }
    public String toString() {
        return mostrarInfo();
    }
}
