/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Sede_Tecnologica extends Sede {
    private  int numero_alumnos;
    private ArrayList<Programa> programas;
    public Sede_Tecnologica(String nombre, String direciion, String telefono, String area, int x) {
        super(nombre, direciion, telefono, area);
        this.numero_alumnos=x;
        this.programas= new ArrayList<>();
    }

    @Override
    public String dar_info() {
       return "Nombre: "+this.nombre+" Direccion: "+ this.direciion+" Telefono: "+ this.telefono+" Area: "+ this.area+" num alumnos: "+this.numero_alumnos;
    }
    public void registrar_num_alumnos(int x){
    this.numero_alumnos=x;
    }

    public String getNombre() {
        return nombre;
    }
    
}
