/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import CuentaBancaria.CuentaBancariaMain;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ServicioCuenta {
    
    Scanner Leer = new Scanner(System.in);
    
    CuentaBancariaMain c1 = new CuentaBancariaMain();
    
    public void CrearCuenta() {
        
        System.out.println("Ingrese el numero de cuenta ");
        c1.setNumcuenta(Leer.nextInt());
        System.out.println("Ingrese el DNI");
        c1.setDNI(Leer.nextInt());
        System.out.println("ingrese su saldo actual ");
        c1.setSaldo(Leer.nextInt());
        
        
    }
    public void Ingresar(int CantDinero){
        
        c1.setSaldo(c1.getSaldo()+CantDinero);

    }
    
    public void Retirar(int CantDinero){
        
        if (c1.getSaldo()<=  CantDinero){
            c1.setSaldo(0);
        }else{
            
            c1.setSaldo(c1.getSaldo()-CantDinero);
        }

    }
    
    public void extraccionRapida(int CantDinero){
        
        if (c1.getSaldo()*0.2 <  CantDinero){
            
            System.out.println("no puede extraer mas del 20% del saldo actual");
            
        }else{
            
            c1.setSaldo(c1.getSaldo()-CantDinero);
        }
    }
    
    public void consultarSaldo(){
        
        System.out.println("su saldo disponible es " + c1.getSaldo());
    }
    
    public void consultarDatos(){
        
        System.out.println(c1.toString());
        
    }
    
}
