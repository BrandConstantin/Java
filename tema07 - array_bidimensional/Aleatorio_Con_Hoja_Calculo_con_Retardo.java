/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_bidimensional;

/**
 *
 * @author brand
 */
public class Aleatorio_Con_Hoja_Calculo_con_Retardo {

    public static void main(String[] args) throws InterruptedException {

        int[][] numero = new int[3][6];
        int fila;
        int columna;
        String rojo = "\033[31m";

        // sacar numeros aleatoriamente
        for (fila = 0; fila < 3; fila++) {
            for (columna = 0; columna < 6; columna++) {
                numero[fila][columna] = (int) (Math.random() * 900) + 100;
            }
        }
        System.out.println(" ");
        System.out.println("===========================================================================");

        //muestra los numeros y suma las filas 
        System.out.println("Array bidimensional");
        System.out.print("\t");

        int totalFila = 0;

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
                Thread.sleep(800);
            }
            totalFila += sumaFila;
            System.out.println("    ||" + sumaFila);

        }

        System.out.println("");

        //suma las columnas
        int totalColumna = 0;

        for (columna = 0; columna < 6; columna++) {
            int sumaColumna = 0;
            for (fila = 0; fila < 3; fila++) {
                sumaColumna += numero[fila][columna];
            }
            totalColumna += sumaColumna;
            System.out.printf("%10d", sumaColumna);
        }

        int total;
        total = totalColumna + totalFila;
        System.out.println("\t" + rojo + total);
    }
}
