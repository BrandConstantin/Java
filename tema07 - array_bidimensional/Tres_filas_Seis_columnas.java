/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores 
 * según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en 
 * forma de tabla como se muestra en la figura.
 */
package array_bidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Tres_filas_Seis_columnas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws InterruptedException {

        Scanner num = new Scanner(System.in);

        int[][] numero = new int[3][6];

        numero[0][0] = 0;
        numero[0][1] = 30;
        numero[0][2] = 2;
        numero[0][5] = 5;
        numero[1][0] = 75;
        numero[1][5] = 0;
        numero[2][2] = -2;
        numero[2][3] = 9;
        numero[2][5] = 11;

        System.out.println("Array bidimensional");
        System.out.print("\t");
        for (int i = 0; i < 6; i++) {
            System.out.print("Columna " + (i+1) + "|");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print("Fila " + i + "| ");

            for (int j = 0; j < 6; j++) {
                System.out.printf("%10d", numero[i][j]);
                Thread.sleep(500);
            }
            System.out.println();

        }
    }
}
