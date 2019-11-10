/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre 
 * en orden inverso, es decir, el primero que se introduce es el último en 
 * mostrarse y viceversa.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Inversar_Array {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        double numeros[] = new double[10];
        
        //pedir los números y guardarlos en el array
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + " numero:");
            numeros[i] = Double.parseDouble(num.nextLine());
        }
        
        System.out.println("---------------------------------------------------");
        
        //mostrar los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " | ");            
        }
                
        System.out.println("\n---------------------------------------------------");
        
        //mostrar los números invers
        for (int i = numeros.length - 1; i > 0 ; i--) {
            System.out.print(numeros[i] + " | ");  
        }
    }
}
