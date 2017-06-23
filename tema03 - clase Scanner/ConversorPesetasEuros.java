/*
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class ConversorPesetasEuros {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);     
        
        double euros;
        int pesetas;
        
        System.out.println("Introduce la cantidad de pesetas a convertir: ");
        pesetas = t.nextInt();
        
        euros = (double)(pesetas / 166);
        
        System.out.println(".......................................");
        System.out.printf("Los %d pesetas convertidas son %.2f euros", pesetas, euros);
    }
}
