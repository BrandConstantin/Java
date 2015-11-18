/*
 *
 * Enunciado: Haz un programa que muestre por pantalla la lista de divisores de
 * un número mayor que uno sin tener en cuenta sus divisores triviales (1 y él 
 * mismo). Si no hubiera ningún divisor indicar que se trata de un número primo.
 */

import java.util.Scanner;

public class CalculoDivisores {

    public static void main(String[] args) {
      
        int numero;
        int candidato;
        int divisor = 0;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("CÁLCULO DE DIVISORES");
        System.out.println("====================");

        do {
          System.out.println("Introduzca un número positivo mas grande que 1: ");
          numero = teclado.nextInt();
        } while (numero <= 1);

        System.out.printf ("La lista de divisores es: ");
        for (candidato = 2; candidato <= numero/2; candidato++)  {
          if (numero % candidato == 0) {
            System.out.printf ("%d ", candidato);
            divisor++;
          }
        }
        
        if (divisor == 0) {
          System.out.println ("---");
          System.out.printf ("El número %d es primo. No tiene divisores propios.\n", numero); 
        }
        System.out.println ();
    }
}
