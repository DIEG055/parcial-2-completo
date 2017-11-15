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
public class Sede_Edu_Continuada extends Sede {
    private String curso_popular;

    public Sede_Edu_Continuada(String nombre, String direciion, String telefono, double area,String curso_popular) {
        super(nombre, direciion, telefono, area);
        this.curso_popular = curso_popular;
    }
    

    @Override
    public String dar_info() {
    return "Nombre: "+this.nombre+" Direccion: "+ this.direciion+" Telefono: "+ this.telefono+" Area: "+ this.area+" curso popular: "+this.curso_popular;
    }

    public String getNombre() {
        return nombre;
    }
        
    
}
