/*
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la
altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura
más uno.
 */
package t1c1;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class L {
    public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("LETRA L");
          System.out.println("------------------------------------------------------------------------------------------------------");
          
          System.out.println("Introduce la altura de la letra: ");
          int altura = t.nextInt();
          System.out.println("-------------------------------------------------------------------------------------------------------");
          
          for(int i = 1; i < altura; i++){
            System.out.println("#");
          }
          
          int longitud = (altura / 2) + 1;
          
          for(int i = 0; i < longitud; i++){
            System.out.print("#");
          }
          System.out.println("");
    }
}
