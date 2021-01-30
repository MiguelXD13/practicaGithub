/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysentornos;
import java.util.*;
/**
 *
 * @author miguel
 */
public class ArraysEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeros []= new int [10];
        
        
        for (int i = 0; i < numeros.length; i++) {
        System.out.println("Introduce 10 numeros");
        numeros[i]=sc.nextInt();
        }
        
        Arrays.sort(numeros);
    
    }
    
}
