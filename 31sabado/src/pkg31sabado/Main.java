/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31sabado;

import entradasalida.clsarchivo;
import java.util.List;
import modelo.mdAlumno;

/**
 *
 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<mdAlumno> todos;
        todos = new clsarchivo().leer();
        //todos.forEach((al)-> System.out.println(al.getNombre()));
    }
    
}
