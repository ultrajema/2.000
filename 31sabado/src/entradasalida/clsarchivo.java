/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasalida;

import calculadora.clsestadistica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import modelo.mdAlumno;

/**
 *
 
 */
public class clsarchivo {
      public List<mdAlumno> leer(){
        String linea="";
        String nombres[];
        int vectir[];
        String nombre= "";
        int i=0;
        
        List<mdAlumno> ArregloAlumnos = new ArrayList<mdAlumno>();
        
        clsestadistica calculadora;
        double media, mediana, moda, rango, desviacion2;
             File archivo = new File("C:\\Users\\richa\\Desktop\\excel.csv");
             Charset charset = Charset.forName("US-ASCII");
             FileReader archivolector;
        try{
        archivolector = new FileReader(archivo);
        BufferedReader br = new BufferedReader(archivolector);
        while(br.ready()){
            
            if((linea = br.readLine())!=null){
            //System.out.println(linea);
                nombres = linea.split(";");
                vectir = new int[nombres.length];
                for(i=1;i<vectir.length;i++){
                    
               vectir[i] = Integer.parseInt(nombres[i]);
           
                }
                 calculadora = new clsestadistica(vectir);  
                  //System.out.println(nombres[0]);
    mediana = calculadora.mediana();
    desviacion2 = calculadora.desviacion();
    moda = calculadora.moda();
    rango = calculadora.rango();
    media = calculadora.promedio();
               
    mdAlumno alumno = new mdAlumno();
    alumno.setNombre(nombres[0]);
    alumno.setDesviacion2(desviacion2);
    alumno.setMedia(media);
    alumno.setMediana(mediana);
    alumno.setModa(moda);
    alumno.setRango(rango);
    ArregloAlumnos.add(alumno);
                
            }
            
        }
           
            
        }catch(Exception ex){
            
            
        }
        return ArregloAlumnos;
    }
}
