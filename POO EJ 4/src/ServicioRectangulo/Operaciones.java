/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRectangulo;

import Rectangulos.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Operaciones {
    
    Scanner Leer = new Scanner(System.in);
    
    public Rectangulo CrearRectangulo() {
        
        Rectangulo R1 = new Rectangulo();
        
        System.out.println("Ingrese el Area del rectangulo ");
        R1.setArea(Leer.nextDouble());
        System.out.println("Ingrese la base del rectangulo");
        R1.setBase(Leer.nextDouble());
        
        return R1;
    }
    
    public double Supericie(Rectangulo R1) {
        
        double num1 = R1.getArea();
        double num2 = R1.getBase();
        double Superficie = num2 * num1;
        
        return Superficie;        
    }
    
    public double Perimetro(Rectangulo R1) {
        
        double num1 = R1.getArea();
        double num2 = R1.getBase();
        double Perimetro = (num2 + num1)*2;
        
        return Perimetro;
        
    }
    
    public void CrearRec(Rectangulo R1) {
        
        int i = 0;
        int j = 0;
        int num1 = (int) R1.getArea();
        int num2 = (int) R1.getBase();
        
        System.out.println(num1);
        System.out.println(num2);
        
        for (i = 0;i < num1;i++) {
           for(j = 0;j < num2;j++){
               
                System.out.print("*");
               
           }
            System.out.println("");
        }
       
        
    }
}
    
    




    

