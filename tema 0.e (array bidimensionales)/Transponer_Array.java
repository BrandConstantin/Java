/*
 * Crear, cargar, trasponer y mostrar una tabla de 3X3
 */
package tema.pkg0.e.array.bidimensionales;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Transponer_Array {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[][] = new int [3][3];
        int aux;
        int i;
        int j;
        
        System.out.println("Trasponer Array");
        System.out.println("============================================");
        
        for(i = 0; i < t.length; i++){
            for(j = 0; j < t.length; j++){
                System.out.print("Introduce valor [" + (i + 1) + "][" + (j +1) + "]: ");
                t[i][j] = tec.nextInt();
            }
        }
        
        //mostramos array original
        for(i = 0; i < t.length; i++){
            System.out.println("");
            for(j = 0; j < t.length; j++){
                System.out.print("|_" + t[i][j] + "_|");
            }
        }
        System.out.println("\n··········································");
        
        //solo traspondremos los elementos por debajo de la diagonal principal
        for(i = 1; i < t.length; i++){
            for(j = 0; j <= i; j++){
                aux = t[i][j];
                t[i][j] = t[j][i];
                t[j][i] = aux;
            }
        }
        
        //mostramos el array transpuesto
        System.out.println("Matriz trasnpuesto");
        for(i = 2; i >= 0; i--){
            System.out.println("");
            for(j = 0; j < t.length; j++){
                System.out.print("|_" + t[j][i] + "_|");
            }
        }
    }
}
