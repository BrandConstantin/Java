/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores 
 * según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en 
 * forma de tabla como se muestra en la figura.
 * 
 * 
 * @Costy 
 * 
 */
 
import java.util.Scanner;

public class ArrayBi01 {
  public static void main(String[] args) 
    throws InterruptedException {
    
    Scanner num = new Scanner(System.in);
    
    int[][] numero = new int[3][6];
    
    numero[0][0] =0;
    numero[0][1] =30;
    numero[0][2] =2;
    numero[0][5] =5;
    numero[1][0] =75;
    numero[1][5] =0;
    numero[2][2] =-2;
    numero[2][3] =9;
    numero[2][5] =11;
    
    int fila;
    int columna;
    
    for(fila = 0; fila < 3; fila++){
      System.out.print("Fila: " + fila);
      
      for(columna = 0; columna < 6; columna++){
        System.out.printf("%10d ", numero[fila][columna]);
        Thread.sleep(500);
      }
      System.out.println();
    }
  }
}
