
import Servicio.ServicioCuenta;
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
public class Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        ServicioCuenta s1 = new ServicioCuenta();
        
        s1.CrearCuenta();
        int opcion;
        int CantDinero;
        
        do {
            System.out.println("");

            System.out.println("elija una opcion");
            System.out.println("1 ingresar dinero");
            System.out.println("2 retirar dinero");
            System.out.println("3 extraccion rapida");
            System.out.println("4 consultar saldo");
            System.out.println("5 consultar datos");
            System.out.println("6 salir");
            opcion = Leer.nextInt();

            switch (opcion) {
                
                case 1:
                    System.out.println("cuanto dinero desea ingresar");
                    
                    CantDinero = Leer.nextInt();
                    
                    s1.Ingresar(CantDinero);
                    
                    break;
                case 2:
                    System.out.println("cuanto dinero desea retirar");
                    
                    CantDinero = Leer.nextInt();
                    
                    s1.Retirar(CantDinero);
                    
                    break;
                case 3:
                    System.out.println("cuanto dinero desea retirar");
                    
                    CantDinero = Leer.nextInt();
                    
                    s1.extraccionRapida(CantDinero);
                    
                    break;
                    
                case 4:
                    
                    s1.consultarSaldo();
                    
                    break;
                    
                case 5:
                    
                    s1.consultarDatos();
                    
                    break;
            }
            
        } while (opcion != 6);
    }
        
    }
    

