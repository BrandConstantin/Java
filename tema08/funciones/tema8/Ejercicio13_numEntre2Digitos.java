/*
 * 
 * Toma como parámetros las posiciones inicial y final dentro de un número y 
 * devuelve el trozo correspondiente.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Ejercicio13_numEntre2Digitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        long numIntrod = teclado.nextLong();

        System.out.println("Elije número inicial");
        int numInicial = teclado.nextInt();
        System.out.println("Elije número final");
        int numFinal = teclado.nextInt();

        System.out.println("-------------------------------------------------------");


        System.out.println("El nuevo número es:" + funciones.VariasMate.trozoDeNumero(numIntrod, numInicial, numFinal));

  }
}
