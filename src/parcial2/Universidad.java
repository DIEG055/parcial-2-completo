/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import Datos.datos;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Universidad {

    private ArrayList<Sede> sedes;
    private ArrayList<Estudiante> estudiantes;
    public Universidad() {
        this.sedes= new ArrayList<>();
        this.estudiantes= new ArrayList<>();
    }

    public void agregar_sedes() {
        datos d= new datos();
        this.sedes=d.leer_info();
    }


    public void eliminar_sede(String sede) {
        for (int i = 0; i < this.sedes.size(); i++) {
            if (this.sedes.get(i).nombre.endsWith(sede)) {
                this.sedes.remove(i);
                break;
            }
        }
    }

    public String consultar_sede(String sede) {
        String x = null;
        for (int i = 0; i < this.sedes.size(); i++) {
            if (this.sedes.get(i).nombre.endsWith(sede)) {
                x = this.sedes.get(i).dar_info();
                datos d= new datos();
                d.escribir_info(x);
                break;
            }
        }
        return x;
    }

    public void editar_sede(Sede sede) {

    }
}
