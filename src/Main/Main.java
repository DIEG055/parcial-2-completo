/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import parcial2.*;

/**
 *
 * @author Estudiante
 */
public class Main {
    
//    RESPUESTAS PARCIAL:
// A.1=F
// A.2=V
// A.3=V
// A.4=F
//B=V  
    
    public static void main(String[] args) {
        Universidad universidad= new Universidad();
        universidad.agregar_sedes();
        universidad.consultar_sede("medellin");
    }
}
