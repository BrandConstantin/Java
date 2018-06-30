/*
 * Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a
28 y siempre múltiplo de 4 (4, 8, 12...).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la
barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
Ejemplo 1:
do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
Ejemplo 2:
la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */
package t1c1;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class GeneradorMelodia {
    public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("GENERADOR MELODIA");
          System.out.println("-----------------------------------------------------------------------------");
          
          int melodia = (int)(Math.random() * 7);
          String notaInicial = "";
          String notaFinal= "";
                        
          for(int x = 0; x < melodia; x++){
            for(int i = 1; i < 5; i++){
              int notas = (int)(Math.random() * 7) + 1;
              String nota = "";

              switch(notas){
                case 1: 
                  nota = "do";
                  break;
                case 2:
                  nota = "re";
                  break;
                case 3:
                  nota = "mi";
                  break;
                case 4:
                  nota = "fa";
                  break;
                case 5: 
                  nota = "sol";
                  break;
                case 6:
                  nota = "la";
                  break;
                case 7:
                  nota = "si";
                  break;
              }
               
              //guardar la nota inicial para volver a sacarla al final
              if(i == 1 && x == 0){
                  notaInicial = nota;
              }
              
              if(i == 4 && x == (melodia -1)){
                  nota = notaInicial;
              }

              System.out.print(nota + " ");
            }
            
            System.out.print("|");
          }
          System.out.println("|");
    }
}
