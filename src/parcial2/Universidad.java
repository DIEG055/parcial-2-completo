/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

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
    private File datos;

    public Universidad(File datos) {
        this.datos = datos;
    }

    public void agregar_sede(File f) {
        String nombre, tipo_sede, direciion, telefono, mejor;
        double area;
        int x;

        try {
            Scanner lector = new Scanner(f);
            while (lector.hasNext()) {
                tipo_sede = lector.next().trim();
                if (tipo_sede.equals("sede educacion continuada")) {
                    for (int i = 0; i < 3; i++) {
                        nombre = lector.next();
                        direciion = lector.next();
                        telefono = lector.next();
                        area = lector.nextDouble();
                        mejor = lector.next();
                        this.sedes.add(new Sede_Edu_Continuada(nombre, direciion, telefono, area, mejor));
                    }
                } else {
                    if (tipo_sede.equals("sede profesional")) {
                        for (int i = 0; i < 3; i++) {
                            nombre = lector.next();
                            direciion = lector.next();
                            telefono = lector.next();
                            area = lector.nextDouble();
                            x = lector.nextInt();
                            this.sedes.add(new Sede_Profesional(nombre, direciion, telefono, area, x));
                        }
                    } else {
                        for (int i = 0; i < 3; i++) {
                            nombre = lector.next();
                            direciion = lector.next();
                            telefono = lector.next();
                            area = lector.nextDouble();
                            x = lector.nextInt();
                            this.sedes.add(new Sede_Tecnologica(nombre, direciion, telefono, area, x));
                        }
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("EL ARCHIVO NO EXISTE");
        }

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
                break;
            }
        }
        return x;
    }

    public void editar_sede(Sede sede) {

    }
}
