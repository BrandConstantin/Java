/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con 
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A 
 * continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
 */
package array_bidimensional;

/**
 *
 * @author brand
 */
public class Posicion_Max_y_Min {

    public static void main(String[] args)
            throws InterruptedException {

        int[][] numero = new int[6][10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                numero[i][j] = (int) (Math.random() * 1001);
            }
        }

        //sacar max y min
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if (numero[i][j] <= min) {
                    min = numero[i][j];
                }
                if (numero[i][j] >= max) {
                    max = numero[i][j];
                }
            }
        }

        //mostrar max y min
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Columna " + (i + 1) + "|");
//        }
        System.out.println("");
        for (int i = 0; i < 6; i++) {
            int sumaFila = 0;
            System.out.print("Fila " + (i + 1) + "| ");

            for (int j = 0; j < 10; j++) {
                if (min == numero[i][j]) {
                    System.out.print("\t" + "--" + min + "--");
                } else if (max == numero[i][j]) {
                    System.out.print("\t" + "--" + max + "--");
                } else {
                    System.out.print("\t" + numero[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
