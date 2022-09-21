/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Rectangulos.Rectangulo;
import ServicioRectangulo.Operaciones;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in).useDelimiter("\n");      
        
        Operaciones O1 = new Operaciones();
        System.out.println("a continuacion crearemos un rectangulo");
        Rectangulo M1 = O1.CrearRectangulo();
        System.out.println("La superficie de su Rectangulo es de " + O1.Supericie(M1));
        System.out.println("El Perimetro de su Rectangulo es de " + O1.Perimetro(M1));
        System.out.println("y su rectangulo se ve de esta forma");
        O1.CrearRec(M1);
        
        
        
            
        }
        
    }
    

