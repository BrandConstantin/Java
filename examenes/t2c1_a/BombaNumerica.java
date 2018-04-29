/*
 * Realiza el programa bomba numérica. En primer lugar, el programa debe generar y mostrar por
pantalla un array de 5 filas por 8 columnas con números aleatorios entre 100 y 200. A continuación se
le preguntará al usuario las coordenadas donde quiere hacer explotar la bomba. Justo en la posición
donde explota la bomba, el número se multiplica por 2. Los números adyacentes a éste se multiplican
por 3 y los números adyacentes a éstos últimos se multiplican por 4. La bomba se puede hacer
explotar en cualquier parte del array, incluso en los bordes.
 */
package t2c1_a;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class BombaNumerica {
    public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("BOMBA NÚMERICA");
          System.out.println("-----------------------------------------------------------------------------");
          
          int[][] bomba = new int[5][8];
          int i;
          int j;
          
          //mostrar el array bidi
          System.out.println("Columna:  1   2   3   4   5   6   7   8");
          System.out.println("----------------------------------------------------");
          for(i = 0; i < 5; i++){
            System.out.print("Fila: " + (i + 1) + " |");
            for(j = 0; j < 8; j++){
              bomba[i][j] = (int)(Math.random() * 101) + 100;
              System.out.print(bomba[i][j] + " ");
            }
            System.out.println(" ");
          }
          
          //pedir las coordenadas donde explotar la bomba
          System.out.println("--------------------------------------------------------------------------");
          System.out.println("Introduzca las coordenadas donde explotar la bomba");
          System.out.println("Fila: ");
          int fila = t.nextInt();
          System.out.println("Columna: ");
          int columna = t.nextInt();
          System.out.println("---------------------------------------------------------------------------");
          
          fila--;
          columna--;
          
          //hacer que explote la bomba
         
          for(i = 0; i < 5; i++){
            for(j = 0; j < 8; j++){
                if((j == columna) && (i == fila)){
                    bomba[i][j] *= 2;
                }else if((Math.abs(fila - i) <= 1) && (Math.abs(columna - j) <= 1)){
                      bomba[i][j] *= 3;
                }else if((Math.abs(fila - i) <= 2) && (Math.abs(columna - j) <= 2)){
                    bomba[i][j] *= 4;
                }
            }
          }
          
          //mostar resultado
          System.out.println("Columna:  1   2   3   4   5   6   7   8");
          System.out.println("----------------------------------------------------");
          for(fila = 0; fila < 5; fila++){
            System.out.print("Fila: " + (fila + 1) + " |");
              for(columna = 0; columna < 8; columna++){
                  System.out.print(bomba[fila][columna] + " ");
              }
              System.out.print("\n");
          }
    }
}
