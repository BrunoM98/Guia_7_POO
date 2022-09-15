
import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class Main_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        ServicioPersona s1 = new ServicioPersona();
        
        s1.CrearPersona();
        
        System.out.println("La edad de la persona es " + s1.CalcularEdad());
        
        System.out.println("Ingrese una edad ");
        
        int edad = leer.nextInt();
        
        System.out.println("La edad ingresada es mayor que la del receptor " + s1.MenorQue(edad));
        
        s1.MostrarPersona();
        
        
        
        
    }
    
}
