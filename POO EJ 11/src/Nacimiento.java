
import java.util.Scanner;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class Nacimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        Date fecha = new Date();
        Date fechaActual = new Date();
        
        
        System.out.println("Ingrese la fecha de us nacimiento segun se lo pida");
        System.out.println("Dia");
        fecha.setDate(leer.nextInt());
        System.out.println("Mes");
        fecha.setMonth(leer.nextInt());
        System.out.println("Anio");
        fecha.setYear(leer.nextInt());
        
        System.out.println("la fecha es " + fecha.getDate() + " " + fecha.getMonth() + " " + fecha.getYear());
        System.out.println("hay " + (fechaActual.getYear() + 1900 - fecha.getYear()) + " años de diferencia");
        
        
        
        
        
        
        
        
        
    }
    
}
