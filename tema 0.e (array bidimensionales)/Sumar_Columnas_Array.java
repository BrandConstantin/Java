/*
 * Sumar columnas y mostrar resultado
 */
package tema.pkg0.e.array.bidimensionales;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Sumar_Columnas_Array {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int suma[][] = new int[3][3];
        int i;
        int j = 0;
        
        System.out.println("Sumar Columnas");
        System.out.println("============================================");
        
        //tabla A
        System.out.println("TABLA A");
        for(i = 0; i < a.length; i++){
            for(j = 0; j < a.length; j++){
                System.out.print("A [" + (i + 1) + "][" + (j +1) + "]: ");
                a[i][j] = tec.nextInt();
            }
        }
        //tabla B
        System.out.println("TABLA B");
        for(i = 0; i < b.length; i++){
            for(j = 0; j < b.length; j++){
                System.out.print("B [" + (i + 1) + "][" + (j +1) + "]: ");
                b[i][j] = tec.nextInt();
            }
        }
        
        //mostrar las dos tablas
        System.out.println("TABLA A");
        for(i = 0; i < a.length; i++){
            System.out.println("");
            for(j = 0; j < a.length; j++){
                System.out.print("|_" + a[i][j] + "_|");
            }
        }
        System.out.println("\nTABLA B");
        for(i = 0; i < b.length; i++){
            System.out.println("");
            for(j = 0; j < b.length; j++){
                System.out.print("|_" + b[i][j] + "_|");
            }
        }
        
        //sumamos las dos tablas
        System.out.println("\n·················································");
        System.out.println("TABLA SUMA");
        for(i = 0; i < suma.length; i++){
            for(j = 0; j < suma.length; j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        
        //resultado
        for(i = 0; i < suma.length; i++){
            System.out.println("");
            for(j = 0; j < suma.length; j++){
                System.out.print("|_" + suma[i][j] + "_|");
            }
        }
        System.out.println("\n··············································");
    }
}
