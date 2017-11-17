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
public class Estudiante {

    private String nombre;
    private String apellido;
    private String anio_graduado;
    private String colegio;
    private Programa programa;

    public Estudiante(String nombre, String apellido, String anio_graduado, String colegio, Programa programa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anio_graduado = anio_graduado;
        this.colegio = colegio;
        this.programa = programa;
    }

}
