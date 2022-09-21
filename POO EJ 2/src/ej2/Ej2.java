/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Atributos.Parametros;
import ServicioRadio.Radio;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrse el radio de la circunerencia ");
        
        Radio R = new Radio();
        
        Parametros r1 = R.Radio;
        
         r1.setRadio(0);
        
        System.out.println(r1);
        
        System.out.println(R.Area(r1));
        
        System.out.println(R.Perimetro(r1));
        
    }
       
               
        
        
            
            
        
        
        
        
    
    

