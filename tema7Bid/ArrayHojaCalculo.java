/*
 * Escribe un programa que pida 20 números enteros. Estos números se deben 
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las 
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se 
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * 
 * @Costy 
 *     throws InterruptedException 
 */
 
import java.util.Scanner;

public class ArrayHojaCalculo {
  public static void main(String[] args){
    
    Scanner num = new Scanner(System.in);
    
    int[][] numero = new int[4][5];  
    int fila;
    int columna = 0;
    
    System.out.println("Introduce los 20 numeros:");
    System.out.println("===========================================================================");
   
    // pedir los números
    for(fila = 0; fila < 4; fila++){
        for(columna = 0; columna < 5; columna++){
            System.out.print("Fila " + fila + " Columna" + columna + " : \t");
            numero[fila][columna] = num.nextInt();
        }
    }
    System.out.println(" ");
    System.out.println("===========================================================================");
   
    //muestra los numeros y suma las filas 
    int totalFila = 0;
    for(fila = 0; fila < 4; fila++){
        int sumaFila = 0;
        for(columna = 0; columna < 5; columna++){
            System.out.printf("%5d", numero[fila][columna]);
            sumaFila += numero[fila][columna];
        }
        System.out.printf("%5d\n", sumaFila);
        totalFila += sumaFila;
    }
 
    //suma las columnas
    int totalColumna = 0;
    for(columna = 0; columna < 5; columna++){
        int sumaColumna = 0;
        for(fila = 0; fila < 4; fila++){
            sumaColumna += numero[fila][columna];
        }
        System.out.printf("%5d", sumaColumna);
        totalColumna += sumaColumna;
    }
    
    int total = 0;
    total = totalColumna + totalFila;
    System.out.println("\t" + total);
  }
}
