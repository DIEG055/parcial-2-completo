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
public abstract class Sede {
    protected String nombre;
    protected String direciion;
    protected String telefono;
    protected double area;

    public Sede(String nombre, String direciion, String telefono, double area) {
        this.nombre = nombre;
        this.direciion = direciion;
        this.telefono = telefono;
        this.area = area;
    }
    
    public abstract String dar_info();


   
}

