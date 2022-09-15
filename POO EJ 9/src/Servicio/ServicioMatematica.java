/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Matematica.Matematicas;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ServicioMatematica {
    
    Scanner Leer = new Scanner(System.in);
    
    Matematicas m1 = new Matematicas();
    
    public Matematicas IngresarNumero() {
        
        m1.setNum1(Math.random() * 10);
        m1.setNum2(Math.random() * 10);
        
        return m1;
        
    }
    
    public double ValorMayor(Matematicas m1) {
        
        return Math.max(m1.getNum1(), m1.getNum2());
    }
    
    public double CalcularPotencia(Matematicas m1) {
        
        double n1 = Math.round(m1.getNum1());
        double n2 = Math.round(m1.getNum2());
        
        return Math.pow(Math.max(n1, n2), Math.min(n1, n2));
    }
    
    public double CalcularRaiz(Matematicas m1) {
        
        return Math.sqrt(Math.round(Math.min(m1.getNum1(), m1.getNum2())));
       
       
    
}

}