/*
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
package array_bidimensional;

//import java.util.Scanner;
/**
 *
 * @author brand
 */
public class Aleatorio_Con_Hoja_Calculo {

    public static void main(String[] args) {

//        Scanner num = new Scanner(System.in);
        int[][] numero = new int[3][6];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                numero[i][j] = (int) (Math.random() * 900) + 100;
            }
        }

        System.out.println("Array bidimensional");
        System.out.print("\t");
        
        int totalFilas = 0;
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Columna " + (i + 1) + "|");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            System.out.print("Fila " + i + "| ");

            for (int j = 0; j < 6; j++) {
                System.out.printf("%10d", numero[i][j]);
                sumaFila += numero[i][j];
            }
            totalFilas += sumaFila;
            System.out.println("    ||" + sumaFila);

        }
        //sacar total columnas
        //suma las columnas
        int totalColumna = 0;
        int sumaColumna = 0;
        
        System.out.print("\t");
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 3; i++) {
                sumaColumna += numero[i][j];
            }             
            System.out.print(sumaColumna + "    ");
            totalColumna += sumaColumna;
            sumaColumna = 0;
        }
        
        System.out.println("");      

        total = totalColumna + totalFilas;
        System.out.println("Total columnas: " + totalColumna);
        System.out.println("Total filas: " + totalFilas);
        System.out.println("\t" + total);
    }
}
