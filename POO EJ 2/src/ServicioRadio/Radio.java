/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRadio;

import Atributos.Parametros;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Radio {
    
    Scanner Leer = new Scanner(System.in);
    
    public Parametros Area(){
    
        Parametros R = new Parametros();
        
        System.out.println(R.getRadio());
        
        System.out.println("el area dela circunferenia es igual a ");
        
        System.out.println(Math.PI * R.getRadio() * R.getRadio());
        
        return R;
        
        
    }
    
   public double Perimetro(Parametros R){
       
       double Perimetro = 2 * Math.PI * R.getRadio();
       
       System.out.println(Perimetro);
        
        return Perimetro;
    }
}
