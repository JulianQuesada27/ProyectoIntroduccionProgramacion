/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectointroduccionprogramacion;

import com.mycompany.Biblioteca.Devolucion;
import com.mycompany.Biblioteca.Libro;
import com.mycompany.Biblioteca.Prestamo;
import com.mycompany.Biblioteca.Usuario;
import javax.swing.JOptionPane;



 
/**
 *
 * @author julianquesadamora
     */
public class ProyectoIntroduccionProgramacion {
      

    

    static Libro[] listaLibros = new Libro[50];
    static Usuario[] listaUsuarios = new Usuario[50];
    static Prestamo[] listaPrestamos = new Prestamo[50];
    static Devolucion[] listaDevoluciones = new Devolucion[50];
    static int contLibros = 0;
    static int contUsuarios = 0;
    static int contPrestamos = 0;
    static int contDevoluciones = 0;

    public static void main(String[] args) {
        
        String opcionTexto;
        int opcion;

        do {
            opcionTexto = JOptionPane.showInputDialog(
                "=== SISTEMA DE BIBLIOTECA ===\n" +
                "1. Gestión de Libros\n" +
                "2. Gestión de Usuarios\n" +
                "3. Préstamos\n" +
                "4. Devoluciones\n" +
                "5. Consultas\n" +
                "6. Reportes\n" +
                "7. Salir\n\n" +
                "Seleccione una opción:"
            );

            if (opcionTexto == null) {
                opcion = 7;
            } else {
                opcion = Integer.parseInt(opcionTexto);
            }

            
            // GESTIÓN DE LIBROS 
            
            if (opcion == 1) {
                String subTexto;
                int subOpcion;
                do {
                    subTexto = JOptionPane.showInputDialog(
                        "=== GESTIÓN DE LIBROS ===\n" +
                        "1. Registrar libro\n" +
                        "2. Consultar libro\n" +
                        "3. Modificar libro\n" +
                        "4. Eliminar libro\n" +
                        "5. Mostrar todos los libros\n" +
                        "6. Regresar al menú principal\n\n" +
                        "Seleccione una opción:"
                    );

                    if (subTexto == null) {
                        subOpcion = 6;
                    } else {
                        subOpcion = Integer.parseInt(subTexto);
                    }

                    // 1. REGISTRAR LIBRO
                    if (subOpcion == 1) {
                        String codigo = JOptionPane.showInputDialog("Digite el código del libro:");
                        String titulo = JOptionPane.showInputDialog("Digite el título:");
                        String autor = JOptionPane.showInputDialog("Digite el autor:");

                        Libro nuevoLibro = new Libro(codigo, titulo, autor);
                        listaLibros[contLibros] = nuevoLibro;
                        contLibros = contLibros + 1;

                        JOptionPane.showMessageDialog(null, 
                            "LIBRO REGISTRADO:\n\n" + nuevoLibro);
                    }

                    // 2. CONSULTAR LIBRO 
                    else if (subOpcion == 2) {
                        if (contLibros == 0) {
                            JOptionPane.showMessageDialog(null, "📋 No hay libros registrados");
                        } else {
                            String codigoBuscar = JOptionPane.showInputDialog("Digite el código a buscar:");
                            boolean encontrado = false;

                            for (int i = 0; i < contLibros; i++) {
                                if (listaLibros[i].getCodigo().equals(codigoBuscar)) {
                                    JOptionPane.showMessageDialog(null, "Libro encontrado:\n\n" + listaLibros[i]);
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado == false) {
                                JOptionPane.showMessageDialog(null, "Libro no encontrado");
                            }
                        }
                    }

                    // 3. MODIFICAR LIBRO 
                    else if (subOpcion == 3) {
                        if (contLibros == 0) {
                            JOptionPane.showMessageDialog(null, "No hay libros registrados");
                        } else {
                            String codigoBuscar = JOptionPane.showInputDialog("Digite el código del libro a modificar:");
                            boolean encontrado = false;

                            for (int i = 0; i < contLibros; i++) {
                                if (listaLibros[i].getCodigo().equals(codigoBuscar)) {
                                    String nuevoTitulo = JOptionPane.showInputDialog("Nuevo título:", listaLibros[i].getTitulo());
                                    String nuevoAutor = JOptionPane.showInputDialog("Nuevo autor:", listaLibros[i].getAutor());

                                    listaLibros[i].setTitulo(nuevoTitulo);
                                    listaLibros[i].setAutor(nuevoAutor);

                                    JOptionPane.showMessageDialog(null, "LIBRO MODIFICADO:\n\n" + listaLibros[i]);
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado == false) {
                                JOptionPane.showMessageDialog(null, "Libro NO encontrado");
                            }
                        }
                    }

                    // 4. ELIMINAR LIBRO 
                    else if (subOpcion == 4) {
                        if (contLibros == 0) {
                            JOptionPane.showMessageDialog(null, "No hay libros registrados");
                        } else {
                            String codigoBuscar = JOptionPane.showInputDialog("Digite el código del libro a eliminar:");
                            boolean encontrado = false;

                            for (int i = 0; i < contLibros; i++) {
                                if (listaLibros[i].getCodigo().equals(codigoBuscar)) {
                                    for (int j = i; j < contLibros - 1; j++) {
                                        listaLibros[j] = listaLibros[j + 1];
                                    }
                                    listaLibros[contLibros - 1] = null;
                                    contLibros = contLibros - 1;

                                    JOptionPane.showMessageDialog(null, "LIBRO ELIMINADO");
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado == false) {
                                JOptionPane.showMessageDialog(null, "Libro NO encontrado");
                            }
                        }
                    }

                    // 5. MOSTRAR TODOS LOS LIBROS
                    else if (subOpcion == 5) {
                        if (contLibros == 0) {
                            JOptionPane.showMessageDialog(null, "No hay libros registrados");
                        } else {
                            String lista = "=== LISTA DE LIBROS ===\n\n";
                            for (int i = 0; i < contLibros; i++) {
                                lista = lista + listaLibros[i] + "\n";
                            }
                            JOptionPane.showMessageDialog(null, lista);
                        }
                    }

                    // 6. REGRESAR
                    else if (subOpcion == 6) {
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                    }

                } while (subOpcion != 6);
            }

       
            // GESTIÓN DE USUARIOS
            
            else if (opcion == 2) {
                String subTexto;
                int subOpcion;
                do {
                    subTexto = JOptionPane.showInputDialog(
                        "=== GESTIÓN DE USUARIOS ===\n" +
                        "1. Registrar usuario\n" +
                        "2. Consultar usuario\n" +
                        "3. Modificar usuario\n" +
                        "4. Eliminar usuario\n" +
                        "5. Mostrar todos los usuarios\n" +
                        "6. Regresar al menú principal\n\n" +
                        "Seleccione una opción:"
                    );

                    if (subTexto == null) {
                        subOpcion = 6;
                    } else {
                        subOpcion = Integer.parseInt(subTexto);
                    }

                    // 1. REGISTRAR USUARIO
                    if (subOpcion == 1) {
                        String id = JOptionPane.showInputDialog("Digite la identificación:");
                        String nombre = JOptionPane.showInputDialog("Digite el nombre:");
                        String telefono = JOptionPane.showInputDialog("Digite el teléfono:");

                        Usuario nuevoUsuario = new Usuario(id, nombre, telefono);
                        listaUsuarios[contUsuarios] = nuevoUsuario;
                        contUsuarios = contUsuarios + 1;

                        JOptionPane.showMessageDialog(null, 
                            "USUARIO REGISTRADO:\n\n" + nuevoUsuario);
                    }

                    // 2. CONSULTAR USUARIO 
                    else if (subOpcion == 2) {
                        if (contUsuarios == 0) {
                            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
                        } else {
                            String idBuscar = JOptionPane.showInputDialog("Digite la identificación a buscar:");
                            boolean encontrado = false;

                            for (int i = 0; i < contUsuarios; i++) {
                                if (listaUsuarios[i].getId().equals(idBuscar)) {
                                    JOptionPane.showMessageDialog(null, "USUARIO ENCONTRADO:\n\n" + listaUsuarios[i]);
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado == false) {
                                JOptionPane.showMessageDialog(null, "Usuario NO encontrado");
                            }
                        }
                    }

                    //  3. MODIFICAR USUARIO 
                    else if (subOpcion == 3) {
                        if (contUsuarios == 0) {
                            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
                        } else {
                            String idBuscar = JOptionPane.showInputDialog("Digite la identificación del usuario a modificar:");
                            boolean encontrado = false;

                            for (int i = 0; i < contUsuarios; i++) {
                                if (listaUsuarios[i].getId().equals(idBuscar)) {
                                    String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:", listaUsuarios[i].getNombre());
                                    String nuevoTelefono = JOptionPane.showInputDialog("Nuevo teléfono:", listaUsuarios[i].getTelefono());

                                    listaUsuarios[i].setNombre(nuevoNombre);
                                    listaUsuarios[i].setTelefono(nuevoTelefono);

                                    JOptionPane.showMessageDialog(null, "USUARIO MODIFICADO:\n\n" + listaUsuarios[i]);
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado == false) {
                                JOptionPane.showMessageDialog(null, "Usuario NO encontrado");
                            }
                        }
                    }

                    // 4. ELIMINAR USUARIO 
                    else if (subOpcion == 4) {
                        if (contUsuarios == 0) {
                            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
                        } else {
                            String idBuscar = JOptionPane.showInputDialog("Digite la identificación del usuario a eliminar:");
                            boolean encontrado = false;

                            for (int i = 0; i < contUsuarios; i++) {
                                if (listaUsuarios[i].getId().equals(idBuscar)) {
                                    for (int j = i; j < contUsuarios - 1; j++) {
                                        listaUsuarios[j] = listaUsuarios[j + 1];
                                    }
                                    listaUsuarios[contUsuarios - 1] = null;
                                    contUsuarios = contUsuarios - 1;

                                    JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO");
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado == false) {
                                JOptionPane.showMessageDialog(null, "Usuario NO encontrado");
                            }
                        }
                    }

                    // 5. MOSTRAR TODOS LOS USUARIOS
                    else if (subOpcion == 5) {
                        if (contUsuarios == 0) {
                            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
                        } else {
                            String lista = "=== LISTA DE USUARIOS ===\n\n";
                            for (int i = 0; i < contUsuarios; i++) {
                                lista = lista + listaUsuarios[i] + "\n";
                            }
                            JOptionPane.showMessageDialog(null, lista);
                        }
                    }

                    // 6. REGRESAR
                    else if (subOpcion == 6) {
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                    }

                } while (subOpcion != 6);
            }

            
            else if (opcion == 3) {
                String subTexto;
                int subOpcion;
                do {
                    subTexto = JOptionPane.showInputDialog(
                        "=== MÓDULO DE PRÉSTAMOS ===\n" +
                        "1. Registrar préstamo\n" +
                        "2. Consultar préstamo\n" +
                        "3. Ver préstamos activos\n" +
                        "4. Regresar al menú principal\n\n" +
                        "Seleccione una opción:"
                    );

                    if (subTexto == null) {
                        subOpcion = 4;
                    } else {
                        subOpcion = Integer.parseInt(subTexto);
                    }

                    // 1. REGISTRAR PRÉSTAMO
                    if (subOpcion == 1) {
                        if (contLibros == 0) {
                            JOptionPane.showMessageDialog(null, "No hay libros registrados");
                        }
                        else if (contUsuarios == 0) {
                            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
                        }
                        else {
                            String codigoLibro = JOptionPane.showInputDialog("Digite el código del libro a prestar:");
                            String idUsuario = JOptionPane.showInputDialog("Digite la identificación del usuario:");
                            String fechaPrestamo = JOptionPane.showInputDialog("Digite la fecha de préstamo:");
                            String fechaEntrega = JOptionPane.showInputDialog("Digite la fecha de entrega:");

                            // Verificar que el libro existe
                            boolean libroExiste = false;
                            for (int i = 0; i < contLibros; i++) {
                                if (listaLibros[i].getCodigo().equals(codigoLibro)) {
                                    libroExiste = true;
                                    break;
                                }
                            }

                            // Verificar que el usuario existe
                            boolean usuarioExiste = false;
                            for (int i = 0; i < contUsuarios; i++) {
                                if (listaUsuarios[i].getId().equals(idUsuario)) {
                                    usuarioExiste = true;
                                    break;
                                }
                            }

                            if (!libroExiste) {
                                JOptionPane.showMessageDialog(null, " El libro no existe en el sistema");
                            }
                            else if (!usuarioExiste) {
                                JOptionPane.showMessageDialog(null, "El usuario no existe en el sistema");
                            }
                            else {
                                // Registrar el préstamo
                                Prestamo nuevoPrestamo = new Prestamo(codigoLibro, idUsuario, fechaPrestamo, fechaEntrega);
                                listaPrestamos[contPrestamos] = nuevoPrestamo;
                                contPrestamos = contPrestamos + 1;

                                JOptionPane.showMessageDialog(null, 
                                    "PRÉSTAMO REGISTRADO:\n\n" + nuevoPrestamo.mostrarInfo());
                            }
                        }
                    }

                    // 2. CONSULTAR PRÉSTAMO (por código de libro)
                    else if (subOpcion == 2) {
                        if (contPrestamos == 0) {
                            JOptionPane.showMessageDialog(null, "📋 No hay préstamos registrados");
                        } else {
                            String codigoBuscar = JOptionPane.showInputDialog("Digite el código del libro del préstamo a buscar:");
                            boolean encontrado = false;

                            for (int i = 0; i < contPrestamos; i++) {
                                if (listaPrestamos[i].getCodigoLibro().equals(codigoBuscar)) {
                                    JOptionPane.showMessageDialog(null, "PRÉSTAMO ENCONTRADO:\n\n" + listaPrestamos[i].mostrarInfo());
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado == false) {
                                JOptionPane.showMessageDialog(null, "Préstamo NO encontrado");
                            }
                        }
                    }

                    // 3. VER TODOS LOS PRÉSTAMOS
                    else if (subOpcion == 3) {
                        if (contPrestamos == 0) {
                            JOptionPane.showMessageDialog(null, " No hay préstamos registrados");
                        } else {
                            String lista = "=== LISTA DE PRÉSTAMOS ===\n\n";
                            for (int i = 0; i < contPrestamos; i++) {
                                lista = lista + listaPrestamos[i].mostrarInfo() + "\n";
                            }
                            JOptionPane.showMessageDialog(null, lista);
                        }
                    }

                    // 4. REGRESAR
                    else if (subOpcion == 4) {
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                    }

                } while (subOpcion != 4);
            }
            
            else if (opcion == 4) {
                String subTexto;
                int subOpcion;
                do {
                    subTexto = JOptionPane.showInputDialog(
                        "=== MÓDULO DE DEVOLUCIONES ===\n" +
                        "1. Registrar devolución\n" +
                        "2. Actualizar disponibilidad\n" +
                        "3. Consultar historial\n" +
                        "4. Regresar al menú principal\n\n" +
                        "Seleccione una opción:"
                    );

                    if (subTexto == null) {
                        subOpcion = 4;
                    } else {
                        subOpcion = Integer.parseInt(subTexto);
                    }

                    // 1. REGISTRAR DEVOLUCIÓN
                    if (subOpcion == 1) {
                        if (contPrestamos == 0) {
                            JOptionPane.showMessageDialog(null, "No hay préstamos registrados para devolver");
                        }
                        else {
                            String codigoLibro = JOptionPane.showInputDialog("Digite el código del libro que devuelve:");
                            String idUsuario = JOptionPane.showInputDialog("Digite la identificación del usuario:");
                            String fechaDevolucion = JOptionPane.showInputDialog("Digite la fecha de devolución:");

                            // Verificar que existe ese préstamo
                            boolean prestamoExiste = false;
                            for (int i = 0; i < contPrestamos; i++) {
                                if (listaPrestamos[i].getCodigoLibro().equals(codigoLibro) &&
                                    listaPrestamos[i].getIdUsuario().equals(idUsuario)) {
                                    prestamoExiste = true;
                                    break;
                                }
                            }

                            if (!prestamoExiste) {
                                JOptionPane.showMessageDialog(null, "No existe un préstamo con esos datos");
                            }
                            else {
                                // Registrar la devolución
                                Devolucion nuevaDevolucion = new Devolucion(codigoLibro, idUsuario, fechaDevolucion);
                                listaDevoluciones[contDevoluciones] = nuevaDevolucion;
                                contDevoluciones = contDevoluciones + 1;

                                JOptionPane.showMessageDialog(null, 
                                    "DEVOLUCIÓN REGISTRADA:\n\n" + nuevaDevolucion.mostrarInfo());
                            }
                        }
                    }

                    // 2. ACTUALIZAR DISPONIBILIDAD
                    else if (subOpcion == 2) {
                        if (contDevoluciones == 0) {
                            JOptionPane.showMessageDialog(null, "📋 No hay devoluciones registradas");
                        }
                        else {
                            String codigoLibro = JOptionPane.showInputDialog("Digite el código del libro a actualizar:");
                            boolean encontrado = false;

                            // Buscar el libro y confirmar que ya fue devuelto
                            for (int i = 0; i < contDevoluciones; i++) {
                                if (listaDevoluciones[i].getCodigoLibro().equals(codigoLibro)) {
                                    JOptionPane.showMessageDialog(null, 
                                        "Disponibilidad ACTUALIZADA:\nEl libro " + codigoLibro + " ya está DISPONIBLE");
                                    encontrado = true;
                                    break;
                                }
                            }

                            if (encontrado == false) {
                                JOptionPane.showMessageDialog(null, " Libro no encontrado en devoluciones");
                            }
                        }
                    }

                    // 3. CONSULTAR HISTORIAL
                    else if (subOpcion == 3) {
                        if (contDevoluciones == 0) {
                            JOptionPane.showMessageDialog(null, "No hay devoluciones registradas");
                        } else {
                            String lista = "=== HISTORIAL DE DEVOLUCIONES ===\n\n";
                            for (int i = 0; i < contDevoluciones; i++) {
                                lista = lista + listaDevoluciones[i].mostrarInfo() + "\n";
                            }
                            JOptionPane.showMessageDialog(null, lista);
                        }
                    }

                    // 4. REGRESAR
                    else if (subOpcion == 4) {
                        JOptionPane.showMessageDialog(null, "Volviendo al menú principal...");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                    }

                } while (subOpcion != 4);
            }
            
            // ========== OTRAS OPCIONES ==========
            else if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Módulo de CONSULTAS (pendiente)");
            }
            else if (opcion == 6) {
                JOptionPane.showMessageDialog(null, "Módulo de REPORTES (pendiente)");
            }
            else if (opcion == 7) {
                JOptionPane.showMessageDialog(null, "¡Gracias por usar el sistema!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }

        } while (opcion != 7);
    }
    
 }



