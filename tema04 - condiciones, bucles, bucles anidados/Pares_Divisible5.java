/*
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Pares_Divisible5 {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.println("Introduce un número");
        long num = t.nextLong();
        System.out.println("---------------------------------");
        
        if(num % 5 == 0){
            System.out.println("Número " + num + " divisible por 5");
            
            if(num % 2 == 0){
                System.out.println("Y también es número par");
            }else{
                System.out.println("Pero no es número par");
            }
        }else{
            System.out.println("Número " + num + " no divisible por 5");
            
            if(num % 2 == 0){
                System.out.println("Pero es número par");
            }else{
                System.out.println("Y tampoco es número par");
            }
        }
    }
}
