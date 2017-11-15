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
public class Universidad {
    private ArrayList<Sede> sedes;
   
    public void agregar_sede(Sede sede){
    this.sedes.add(sede);
    }
    
    public void eliminar_sede(Sede sede){
    this.sedes.remove(sede);
    }
}
