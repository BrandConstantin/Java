/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A 
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello 
 * una tabla. Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el 
 * resto de números (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe 
 * mostrar el array resultante.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Primos_PrimeraPosicion {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[10];
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int numPrimos = 0;
        int numNoPrimos = 0;

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce número " + (i + 1) + ": ");
            numero[i] = Integer.parseInt(num.nextLine());
        }

        System.out.println("\n--------------------------------------------------");

        //posicionar los primos y los no primos
        for (int i = 2; i < numero.length; i++) {
            if (numero[i] % 2 != 0) {
                primos[numPrimos++] = numero[i];
            } else {
                noPrimos[numNoPrimos++] = numero[i];
            }
        }

        //mostrar los primos y luego los no primos
        for (int i = 0; i < primos.length; i++) {
            numero[i] = primos[i];
        }

        int aux = 0;

        for (int i = numPrimos; i < numero.length; i++) {
            numero[i] = noPrimos[aux];
            aux++;
        }

        //mostrar los números
        System.out.println("Array cambiado: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}
