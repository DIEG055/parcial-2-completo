/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Estudiante
 */
public class Programa {

    private String nombre;
    private String descripcion;

    public Programa(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String mostrar_info() {
        return this.nombre + ": " + " " + this.descripcion;
    }
}
