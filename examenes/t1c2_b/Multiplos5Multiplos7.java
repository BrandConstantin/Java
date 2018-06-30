/*
 * Escribe un programa que rellene un array de 20 elementos con números enteros comprendidos entre
0 y 400 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario
quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes.
 */
package t1c2_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Multiplos5Multiplos7 {
    public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("MULTIPLOS DE 5 Y MULTIPLOS DE 7 ");
          System.out.println("-----------------------------------------------------------------------------");
          
          int[] multiplos = new int[20];
                     
          //mostrar array original
          System.out.print("Indice:  ");
          for(int i = 0; i < multiplos.length; i++){
            System.out.print("|" + (i + 1) + "|");
          }
          
          System.out.println();
          
          System.out.print("Numeros: ");
          for(int i = 0; i < multiplos.length; i++){
            //rellenar el array aleatoriamente
            multiplos[i] = (int)(Math.random() * 21);
            System.out.print("|" + multiplos[i] + "|");
          }
          
          System.out.println("-------------------------------------------------------------------");
          System.out.println("\nQuieres sacar los multiplos: ");
          System.out.println("1. de '5'");
          System.out.println("2. de '7'");
          int opcion = t.nextInt();
          System.out.println("------------------------------------------------------------------");
          
          switch(opcion){
            case 1: 
                for(int i = 0; i < multiplos.length; i++){
                    if(multiplos[i] % 5 == 0){
                        System.out.print("["+multiplos[i]+"] ");
                    }else{
                        System.out.print(multiplos[i]+" ");
                    }
                }
              break;
            case 2:
                for(int i = 0; i < multiplos.length; i++){
                    if(multiplos[i] % 7 == 0){
                        System.out.print("["+multiplos[i]+"] ");
                    }else{
                        System.out.print(multiplos[i]+" ");
                    }
                }
              break;
          }
    }
}
