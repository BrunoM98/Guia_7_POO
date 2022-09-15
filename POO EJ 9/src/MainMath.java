
import Matematica.Matematicas;
import Servicio.ServicioMatematica;
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
public class MainMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        ServicioMatematica s1 = new ServicioMatematica();
        
        Matematicas m2 = s1.IngresarNumero();
        
        System.out.println("El primer numero ingresado es " + m2.getNum1());
        System.out.println("El segundo numero ingresado es " + m2.getNum2());
        System.out.println("El numero mas grande es " + s1.ValorMayor(m2));
        System.out.println("La potencia de los numeros es " + s1.CalcularPotencia(m2));
        System.out.println("y la raiz del menor numero es " + s1.CalcularRaiz(m2));
        
    }
    
}
