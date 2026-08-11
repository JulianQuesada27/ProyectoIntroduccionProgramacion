/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

/**
 *
 * @author SebastianMora
 */
import javax.swing.JOptionPane;

public class Usuario {
    
    private String cedula;
    private String nombre;
    private String telefono;
    private String correo;

    // Constructor con 4 parámetros
    public Usuario(String cedula, String nombre, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Constructor con 3 parámetros (Resuelve el error de la línea 228)
    public Usuario(String cedula, String nombre, String telefono) {
        this(cedula, nombre, telefono, "");
    }

    // Constructor vacío
    public Usuario() {
    }

    // Getter para getId() (Resuelve los errores de las líneas 245, 267, 295 y 384)
    public String getId() {
        return cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void mostrar() {
        String info = """
                      --- DETALLES DEL USUARIO ---
                      C\u00e9dula: """ + cedula + "\n"
                    + "Nombre: " + nombre + "\n"
                    + "Teléfono: " + telefono + "\n"
                    + "Correo: " + (correo != null ? correo : "N/A");
        JOptionPane.showMessageDialog(null, info, "Información del Usuario", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String toString() {
        return "Cédula: " + cedula + " | Nombre: " + nombre + " | Teléfono: " + telefono + " | Correo: " + correo;
    }
}