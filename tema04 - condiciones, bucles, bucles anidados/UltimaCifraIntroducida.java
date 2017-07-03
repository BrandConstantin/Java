/*
 * Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin                  
 */
public class UltimaCifraIntroducida {
    public static void main(String[] args) {   
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("Introduce una número: ");
        long num = tecla.nextLong();
        
        System.out.println("----------------------------------------------");
        
        int cifra = (int) (num % 10);
        System.out.println("La ultima cifra es: " + cifra);
    }
}
