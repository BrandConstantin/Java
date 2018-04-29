/*
 * Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
correspondientes a colores se deben almacenar al comienzo y las que no son colores a continuación.
Puedes utilizar tantos arrays auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.
 */
package t1c2_a;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Colores {
      public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("COLOCAR COLORES DELANTE");
          System.out.println("-----------------------------------------------------------------------------");
          
          String[] colores = {"blanco", "amarillo",  "rojo", "verde", "azul", "magenta", "cian",
            "maron", "violeta", "morado", "naranjo", "gris", "negro"};
          
          //pedir 8 palabras por teclado
          //despues de aver creado un array que guarde esas palabras   
          String[] palabras = new String[8];

          for(int i = 0; i < palabras.length; i++){
            System.out.print("Introduce palabra: ");
            palabras[i] = t.nextLine();
          }
          
          System.out.println("-------------------------------------------------------------------------------------");
          //mostrar array con palabras
          for(int i = 0; i < palabras.length; i++){
            System.out.print(palabras[i] + "||");
          }
          System.out.println("\n------------------------------------------------------------------------------------");
          
          System.out.println(" ");
          String[] resultado = new String[8];
          int k = 0;
          
          //poner los colores por delante de las otras palabras
          for(int i = 0; i < palabras.length; i++){
            for(int x = 0; x < colores.length; x++){
              if(palabras[i].equals(colores[x])){
                resultado[k] = colores[x];
                k++;
              }
            }
          }
          
          //poner las otras palabras al final
          boolean esColor = false;
          for(int i = 0; i < palabras.length; i++){
            esColor = false;
            for(int x = 0; x < colores.length; x++){
              if((palabras[i].equals(colores[x]))){
                esColor = true;
              }
            }
            if (!esColor) {
               resultado[k] = palabras[i];
                k++;
            }
          }
          
          //mostrar resultado final
          for (String elemento : resultado) {
              System.out.print(elemento + "||");
        }
      }
}
