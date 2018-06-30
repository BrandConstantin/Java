/*
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Ordenar3Numeros2 {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        
        System.out.println("Introduce el I número:");
        int a = t.nextInt();
        System.out.println("Introduce el II número:");
        int b = t.nextInt();
        System.out.println("Introduce el III número:");
        int c = t.nextInt();
        
        System.out.println("------------------------------------------");
        int min = 999999999;
        int max = -999999999;
        int intermedio = 0;
        
        if((a > b) && (a > c) && (b > c)){
            max = a;
            intermedio = b;
            min = c;
        }else if((b > a) && (b > c) && (a > c)){
            max = b;
            intermedio = a;
            min = c;
        }else if((c > a) && (c > b) && (b > a)){
            max = c;
            intermedio = b;
            min = a;
        }else if((a > b) && (a > c) && (b < c)){
            max = a;
            intermedio = c;
            min = b;
        }else if((b > a) && (b > c) && (a < c)){
            max = b;
            intermedio = c;
            min = a;
        }else if((c > a) && (c > b) && (b < a)){
            max = c;
            intermedio = a;
            min = b;
        }else{
            System.out.println("ERROR!");
        }        
        
        System.out.println("Min: " + min + "\nMax: " + max + "\nIntermedio: " + intermedio);
    }
}
