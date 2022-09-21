
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class MainOrden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] VectorA = new double[50];
        double[] VectorB = new double[20];
        int i;
        
        for (i = 0 ; i < 50 ; i++){
        
        VectorA[i] = Math.random() * 100;
        
    }
        System.out.println("VectorA: " + Arrays.toString(VectorA));
        
        Arrays.sort(VectorA);
        
        for (i = 0 ; i < 10 ; i++){
            
            VectorB[i] = VectorA[i];
        }
        for (i = 10 ; i < 20 ; i++){
            
            VectorB[i] = 0.5;
        }
        
        System.out.println("VectorA: " + Arrays.toString(VectorA));
        System.out.println("VectorB: " + Arrays.toString(VectorB));
    
}
}