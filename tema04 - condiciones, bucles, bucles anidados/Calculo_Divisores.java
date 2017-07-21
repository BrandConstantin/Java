package tema04;

/*
 * 
 * Enunciado: Haz un programa que muestre por pantalla la lista de divisores de un número mayor que uno sin tener 
 * en cuenta sus divisores triviales (1 y él mismo). Si no hubiera ningún divisor indicar que se trata de un número primo.
 
 * @author BrandConstantin
 */

import java.util.Scanner;
public class Calculo_Divisores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int candidatoDivisor;
        int numDivisores = 0;

        do {
            System.out.print("Introduzca un número natural entero positivo mayor que 1: ");
            numero = teclado.nextInt();
        } while (numero <= 1);

        System.out.printf ("La lista de divisores es: ");
        for (candidatoDivisor = 2; candidatoDivisor <= numero / 2; candidatoDivisor++)  {
                if (numero % candidatoDivisor == 0) {
                    System.out.printf ("%d ", candidatoDivisor);
                    numDivisores++;
                }
        }
        
        if (numDivisores == 0) {
            System.out.println (" ");
            System.out.printf ("El número %d es primo. No tiene divisores propios.\n", numero); 
        }
        System.out.println ();
    }
}