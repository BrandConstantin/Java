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
public class Ordenar3Numeros {
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
        
        if(a < b && a < c){
            min = a;
        }else if(b < c && b < a){
            min = b;
        }else if(c < a && c < b){
            min = c;
        }
        
        if(a > b && a > c){
            max = a;
        }else if(b > a && b > c){
            max = b;
        }else if(c > a && c > b){
            max = c;
        }
        
        if(a > b && b > c){
            intermedio = b;
        }else if(a > c && c > b){
            intermedio = c;
        }else if(b > a && a > c){
            intermedio = a;
        }else if(b > c && c > a){
            intermedio = c;
        }else if(c > a && b > a){
            intermedio = b;
        }else if(c > a && a > b){
            intermedio = a;
        }
        
        System.out.println("Min: " + min + "\nMax: " + max + "\nIntermedio: " + intermedio);
    }
}
