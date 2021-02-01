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
        int contador = 0;
        int num;
   System.out.println("¿Cuantos numeros vas a leer?");
            contador = sc.nextInt();
            validaContador(contador);
            while (contador > 10) {
                System.out.println("Numero maximo superado, introducelo de nuevo");
                contador = sc.nextInt();
            }
        int numeros[] = new int[contador];
        for (int i = 0; i < contador; i++) {
            System.out.println("Introduce numeros");
            numeros[i] = sc.nextInt();

            for (int j = 0; j < i; j++) {
                if (numeros[j] == numeros[i]) {
                    System.out.println("El numero ya esta introducido");
                    i--;
                }

            }
        }

        Arrays.sort(numeros);
        System.out.println("Los numeros introducidos son ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Introduce un numero para buscar");
        num = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (num == numeros[i]) {
                System.out.println("El numero " + num + " esta");
            }else
            if(num != numeros[i]){
                System.out.println("El numero no esta");
            }
        }

    }

    public static boolean validaContador(final int cont) {

        if (cont > 10) {
            return false;
        }
        return true;
    }

}
