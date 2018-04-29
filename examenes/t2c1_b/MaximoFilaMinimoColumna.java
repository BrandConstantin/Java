/*
 * Realiza un programa que, a partir de un array de 4 filas por 6 columnas con números generados al
azar entre 10 y 99, muestre a la derecha los máximos de la fila y debajo los mínimos de las columnas
 */
package t2c1_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class MaximoFilaMinimoColumna {
     public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.println("MINIMO COLUMNAS Y MAXIMO FILAS");
        System.out.println("-----------------------------------------------------");  
        
        int[][] a = new int[4][6];
        int i = 0;
        int j = 0;
        int max[] = {0, 0, 0, 0, 0, 0};
        //int min = 100;
        int min[] = {100, 100, 100, 100};
        
        for(i = 0; i < a.length; i ++){ 
            for(j = 0; j < a.length; j++){
                a[i][j] = (int)(Math.random() * 90) + 10;
                
                //guarda el minimo de las filas
                if(a[i][j] < min[j]){
                    min[j] = a[i][j];
                }
                
                //guarda el máximo de las columnas
                if(a[i][j] > max[i]){
                    max[i] = a[i][j];
                }
                
                //mostrar el array
                System.out.print(a[i][j] + " ");
            }
            
            //mostar los minimos de las filas
            System.out.print("|" + max[i] + "\n");
        }  
        
        System.out.print("_ _ _ _ _ _ _\n");
        
        //mostrar los maximos de las columnas
        for(j = 0; j < a.length; j++){
            System.out.print(min[j] + " ");
        }
        
        System.out.println("\n-----------------------------------------------------");
     }
}
