/*
 * Escribe un programa que rellene un array de 100 elementos con números enteros comprendidos entre
0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará si el usuario
quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el
número destacado entre dobles asteriscos.
 */
package t1c2_a;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class DestacarMinyMaxDeArray {
  
      public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("DESTACAR MIN O MAX DE UN ARRAY");
          System.out.println("-----------------------------------------------------------------------------");
          
          int[] a = new int[100];
          int i;
          
          //mostrar el array
          for(i = 0; i < a.length; i ++){
            a[i] = (int)(Math.random() * 501);
            System.out.print(a[i] + "||");
          }
          
          //declarar minimo y el maximo
          int min = 502; 
          int max = 0;
          
          for(i = 0; i < a.length; i ++){
              if(a[i] > max){
                max = a[i];
              }else if(a[i] < min){
                min = a[i];
              }
          }
          
          System.out.println("\n-------------------------------------------------------------------------------");
          System.out.println("Quieres destacar algún número?");
          System.out.println("1. Maximo");
          System.out.println("2. Minimo");
          int opcion = t.nextInt();
          
          switch(opcion){
            case 1:
              for(i = 0; i < a.length; i ++){
                if(a[i] == max){
                  System.out.print("##" + max + "##");
                }else{
                  System.out.print(a[i] + "||");
                }
              }
              break;
              
            case 2: 
              for(i = 0; i < a.length; i ++){
                if(a[i] == min){
                  System.out.print("##" + min + "##");
                }else{
                  System.out.print(a[i] + "||");
                }
              }
              break;
          }
      }
}
