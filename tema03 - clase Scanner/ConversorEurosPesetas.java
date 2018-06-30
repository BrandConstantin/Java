/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class ConversorEurosPesetas {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);     
        
        int euros;
        int pesetas;
        
        System.out.println("Introduce la cantidad de euros a convertir: ");
        euros = t.nextInt();
        
        pesetas = (euros * 166);
        
        System.out.println(".......................................");
        System.out.printf("Los %d euros convertidas son %d pesetas", euros, pesetas);
    }
}
