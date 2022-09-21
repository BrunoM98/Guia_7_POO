/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulos;

/**
 *
 * @author Bruno
 */
public class Rectangulo {
    
    private double Area;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double Area, double base) {
        this.Area = Area;
        this.base = base;
    }

    public double getArea() {
        return Area;
    }

    public double getBase() {
        return base;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    
}
