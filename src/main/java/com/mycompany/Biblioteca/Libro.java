/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

/**
 *
 * @author julianquesadamora
 */
public class Libro {
    // Atributos
    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Al crear un libro, está disponible
    }

    // Métodos para obtener datos
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Métodos para cambiar datos
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Mostrar información del libro
    public String toString() {
        String estado = disponible ? "Disponible" : "Prestado";
        return "Código: " + codigo +
             "\nTítulo: " + titulo +
             "\nAutor: " + autor +
             "\nEstado: " + estado + "\n";
    }
}
