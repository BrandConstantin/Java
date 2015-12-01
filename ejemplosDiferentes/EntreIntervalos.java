/*
 * Algoritmo que pida números enteros hasta que se introduzca uno negativo y cuente cuántos están entre 5 y 10, 
 * cuántos entre 11 y 15 y  cuántos fuera de estos intervalos.
 *
 *@author costy
 */

import java.util.Scanner;
public class EntreIntervalos {
   
    public static void main(String[] args) {
               
        int numero = 0 ;
        Scanner lector ;
        int entre5y10 = 0 ;
        int entre11y15 = 0 ;
        int fueraDeIntervalos = 0 ;
               
        System.out.println("Programa que finaliza al introducir un número negativo");
        System.out.println("================================================================");
               
        while (numero >= 0) {
            System.out.println("Escriba un número: ");
            lector = new Scanner(System.in);
            numero = lector.nextInt() ;
            
            // Según el número leído, acumulamos en la variable correspondiente
            if (numero >= 5 && numero <= 10)
                entre5y10++ ;
            else if (numero >= 11 && numero <= 15)
                entre11y15++ ;
            else if (numero>0)
                fueraDeIntervalos++ ;
        }

        System.out.println("Números entre 5 y 10: " + entre5y10);
        System.out.println("Números entre 11 y 15: " + entre11y15);
        System.out.println("Fuera de esos untervalos hay: " + fueraDeIntervalos) ;
    }
}