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
public class Sede_Tecnologica extends Sede {
    private  int numero_alumnos;
    public Sede_Tecnologica(String nombre, String direciion, String telefono, double area) {
        super(nombre, direciion, telefono, area);
    }

    @Override
    public String dar_info() {
       return "Nombre: "+this.nombre+" Direccion: "+ this.direciion+" Telefono: "+ this.telefono+" Area: "+ this.area+" num alumnos: "+this.numero_alumnos;
    }
    public void registrar_num_alumnos(int x){
    this.numero_alumnos=x;
    }
}
