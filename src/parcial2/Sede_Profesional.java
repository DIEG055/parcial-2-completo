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
public class Sede_Profesional extends Sede {

    private int programas_alta_calidad;
    private ArrayList<Programa> programas;

    public Sede_Profesional(int programas_alta_calidad, String nombre, String direciion, String telefono, double area, ArrayList<Programa> programas) {
        super(nombre, direciion, telefono, area);
        this.programas_alta_calidad = programas_alta_calidad;
        this.programas = programas;
    }

    @Override
    public String dar_info() {
        return "Nombre: " + this.nombre + " Direccion: " + this.direciion + " Telefono: " + this.telefono + " Area: " + this.area + "programa alta calidad:" + this.programas_alta_calidad;
    }

    public ArrayList<String> mostrar_programas() {
        ArrayList<String> x =new ArrayList<>(); 
        for (int i = 0; i < this.programas.size(); i++) {
            x.add(this.programas.get(i).mostrar_info());
        }
        return x;
    }
}
