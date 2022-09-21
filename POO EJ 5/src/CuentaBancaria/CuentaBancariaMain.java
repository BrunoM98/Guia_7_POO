/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class CuentaBancariaMain {
    
    Scanner Leer = new Scanner(System.in);
    
    private int DNI;
    private int saldo;
    private int numcuenta;

    public CuentaBancariaMain() {
    }

    public CuentaBancariaMain(int DNI, int saldo, int numcuenta) {
        this.DNI = DNI;
        this.saldo = saldo;
        this.numcuenta = numcuenta;
    }

    public Scanner getLeer() {
        return Leer;
    }

    public void setLeer(Scanner Leer) {
        this.Leer = Leer;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }
    
     @Override
    public String toString() {
        
    
        return "Cuenta" + "\n"
        
                + "numeroCuenta=" + numcuenta + "\n"
                
                + "DNI=" + DNI + "\n"
                
                + "saldoActual=" + saldo;
    }
    
}
