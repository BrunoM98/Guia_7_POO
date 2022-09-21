/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Parametros {
    
    Scanner Leer = new Scanner(System.in);
    
    private double radio;

    public Parametros() {
    }

    public Parametros(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        
        Leer.nextDouble();
        
    }

    public double getRadio() {
        return radio;
    }
    
    
           
}
