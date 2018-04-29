/*
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la
altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular
la curvatura de las esquinas inferiores.
 */
package t1c1_turno2;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class U {
    public static void main(String[] args) {
      Scanner t = new Scanner (System.in);
      System.out.println("LETREA U");
      System.out.println("-----------------------------------------------------------------------------");
      System.out.println("Introduce la altura de la letra");
      int altura = t.nextInt();
      System.out.println("------------------------------------------------------------------------------");
      
      String espacio = "     ";
      
     /* //dibujo la linea izquierda
      for(int i = 1; i <= altura; i++){        
        System.out.print("#");
        System.out.print(espacio);
        System.out.println("#");
      }
      
      for(int x = 1; x < altura - 2; x++){
        System.out.print("#");
      }*/
      
      int i;
      int alt = 1;

      //dibuja hacia abajo
      for(alt = 1; alt <= altura - 1; alt++){
         for(i = 1; i <= altura; i++){
             System.out.print("#");

            //dijuba el espacio
              for(i = 2; i <= altura; i++){
                System.out.print(" ");
              }
              System.out.println("#");
         } 
      }
      
      //dibujar la ultima linea
      for(alt = 1; alt <= altura; alt++){
        if((alt == 1) || (alt == altura +1)){
          System.out.print(" ");
        }else{
          System.out.print("#");
        }
      }
    }
}
