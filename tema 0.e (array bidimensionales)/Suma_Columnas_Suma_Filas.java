/*
 * Sumar las filas y las columnas
 */
package tema.pkg0.e.array.bidimensionales;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Suma_Columnas_Suma_Filas {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[][] = new int [4][4];
        int i;
        int j;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        
        System.out.println("Sumar filas y columnas");
        System.out.println("============================================");
        
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){
                System.out.print("Elemento[" + (i + 1) + "][" + (j +1) + "]: ");
                t[i][j] = tec.nextInt();
            }
        }
        
        System.out.println("·········································");
        
        //mostramos array
        System.out.println("Matriz: ");
        for(i = 0; i < t.length; i++){
            System.out.println("");
            for(j = 0; j < t.length; j++){
                System.out.print("\t|_" + t[i][j] + "_|");
            }
        }
        
        System.out.println("\n···········································");
        
        //sumamos filas
        System.out.println("");
        for(i = 0; i < t.length; i++){
            sumaFilas = 0;
            for(j = 0; j < t.length; j++){
                sumaFilas += t[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFilas);
        }
        
        //sumamos columnas
        System.out.println("");
        for(j = 0; j < t.length; j++){
            sumaColumnas = 0;
            for(i = 0; i < t.length; i++){
                sumaColumnas += t[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumnas);
        }
    } 
}
