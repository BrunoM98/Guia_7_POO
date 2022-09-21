/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Matematicas {
    
    Scanner Leer = new Scanner(System.in);
    
    private double num1;
    private double num2;

    public Matematicas() {
    }

    public Matematicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Scanner getLeer() {
        return Leer;
    }

    public void setLeer(Scanner Leer) {
        this.Leer = Leer;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
}

