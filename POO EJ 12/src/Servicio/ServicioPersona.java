/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ServicioPersona {
    
     Scanner leer = new Scanner(System.in);
    
    Persona p1 = new Persona();
        
    public void CrearPersona() {
        
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese su fecha de nacimiento segun se indica");
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Anio");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p1.setNacimiento(fecha);
        
        
            
    }
    
    public int CalcularEdad(){
        
        Date fechaActual = new Date();
        
        if (fechaActual.getMonth() > p1.getNacimiento().getMonth()) {

            return fechaActual.getYear() - p1.getNacimiento().getYear() - 1;
            
        } else {
            
            return fechaActual.getYear() - p1.getNacimiento().getYear();
        }
        
      
    }
    
    public boolean MenorQue(int edad){
        
        return CalcularEdad() < edad;
    }
    
    public void MostrarPersona(){
        
        System.out.println(p1.toString());
    }
}  
            
    
   

