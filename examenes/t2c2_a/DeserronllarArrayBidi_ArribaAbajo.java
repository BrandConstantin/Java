/*
Implementa una función que sea capaz de “desenrollar” un array bidimensional recorriéndola en
espiral en el sentido de las agujas del reloj. La cabecera de la función es la siguiente:
public static int[] desenrolla(int[][] n)
Por ejemplo, si el array bidimensional “a” es el que se muestra a continuación
45 92 14 20 25 78
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48
El array unidimensional generado por desenrolla(a) sería el siguiente
45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35 72 24 45 42 41 23 64 42
 */
package t2c2_a;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class DeserronllarArrayBidi_ArribaAbajo {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.println("DESERRONLLAR ARRAY BIDIMENSIONAL");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Array Generado:");
        int[][] arrayBidi = generaArrayBidi(10, 10, 10, 99);
        muestraArrayBidi(arrayBidi);
        
        System.out.println("\n-----------------------------------------------------");
        muestraArrayUni(desenrrola(arrayBidi));
    }
    
    public static int[][] generaArrayBidi(int fila, int columna, int min, int max){          
        int i = fila;
        int j = columna;
        int[][] a = new int[fila][columna];
        
        for(i = 0; i < fila; i++){ 
            for(j = 0; j < columna; j++){
                a[i][j] = (int)(Math.random() * 89) + 11;
            }
        }
        
        return a;
    }
    
    public static void muestraArrayBidi(int a[][]){
        int k;
        int l;
        
        for(k = 0; k < a.length; k ++){ 
            System.out.println(" ");
            for(l = 0; l < a.length; l++){
                System.out.print(a[k][l] + " ");
            }
        }
    }
    
    public static int[] desenrrola(int[][] a){
        int filas = a.length;
        int columnas = a.length;
        int capacidad = filas * columnas;
        int[] arrayUni = new int[capacidad];
        
        int posicion = 0;
        int filaActual = 0;
        int columnaActual = 0;
        int vuelta = 0;
        int i;
        
        while(posicion < capacidad){  
            for(i = 0 + vuelta; i < filas - vuelta; i++){
                arrayUni[posicion] = a[i][0 + vuelta];
                posicion++;
            }
            
            for(i = 1 + vuelta; i < columnas - vuelta; i++){
                arrayUni[posicion] = a[filas - 1 - vuelta][i];
                posicion++;
            }
            
            for(i = filas - 2 - vuelta; i >= 0 + vuelta; i--){
                arrayUni[posicion] = a[i][columnas - 1 - vuelta];
                posicion++;
            }
            
            for(i = columnas - 2 - vuelta; i >= 1 + vuelta; i--){
                arrayUni[posicion] = a[0 + vuelta][i];
                posicion++;
            }

            vuelta++;
        }
        
        return arrayUni;
    }
    
    public static void muestraArrayUni(int a[]){
        for (int b : a) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
    }
}
