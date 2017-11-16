/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import parcial2.*;

/**
 *
 * @author juanm
 */
public class datos {

    private File leer_datos;
    private File escribir_datos;
    private Scanner leer;
    private PrintStream escribir;

    public datos() {
        this.leer_datos = new File("leer.txt");
        this.escribir_datos = new File("escribir.txt");
        try {
            this.leer = new Scanner(this.leer_datos);
            this.leer.useDelimiter(",");
            this.escribir = new PrintStream(this.escribir_datos);
        } catch (FileNotFoundException ex) {
            System.out.println("problemas con el archivo");
        }
    }

    public ArrayList<Sede> leer_info() {
        ArrayList<Sede> s = new ArrayList<>();
        String nombre, tipo_sede, direciion, telefono, mejor;
        String area;
        int x;
         
        while (leer.hasNext()) {
            tipo_sede = leer.next().trim();
            if (tipo_sede.equals("sede educacion continuada")) {
                nombre = leer.next().trim();
                direciion = leer.next().trim();
                telefono = leer.next().trim();
                area = leer.next().trim();
                mejor = leer.next().trim();
                s.add(new Sede_Edu_Continuada(nombre, direciion, telefono, area, mejor));
            } else {
                if (tipo_sede.equals("sede profesional")) {
                    nombre = leer.next().trim();                
                    telefono = leer.next().trim();
                    area = leer.next().trim();
                   x = leer.nextInt();
                     direciion = leer.next().trim();
                    s.add(new Sede_Profesional(nombre, direciion, telefono, area, x));
                } else {                   
                        nombre = leer.next().trim();                      
                        telefono = leer.next().trim();
                        area = leer.next().trim();
                        x = leer.nextInt();
                         direciion = leer.next().trim();
                        s.add(new Sede_Tecnologica(nombre, direciion, telefono, area, x));
                    
                }
            }
        }
        return s;
    }

    public void escribir_info(String g) {
        escribir.print(g);
        System.out.println(g);
    }
}
