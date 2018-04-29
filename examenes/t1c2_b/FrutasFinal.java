/*
 * Escribe un programa que pida 8 palabras y las almacene en un array. A continuación, las palabras
correspondientes a nombres de fruta se deben almacenar al final (sin importar el orden) y las que no son
nombres de fruta al principio. Puedes utilizar tantos arrays auxiliares como quieras. Las frutas que conoce
el programa deben estar en otro array y son las siguientes: manzana, mandarina, mango, chirimoya y
nectarina.
 */
package t1c2_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class FrutasFinal {
      public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("COLOCAR FRUTAS AL FINAL DEL ARRAY");
        System.out.println("------------------------------------------------------------------------------");
        
        String[] frutas = {"platano", "tomate", "sandia", "melon", "kiwi", "piña", "uva", "manzana", "pera",
                        "melocoton", "nectarina", "naranja", "limon", "lima", "ciruela", "guinda", "cereza", "nispero",
                         "chirimoya"};
        
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
          boolean esFruta = false;
          
          //poner las demas palabras al principio
          for(int i = 0; i < palabras.length; i++){
            // comprueba si palabra[i] es una fruta
            esFruta = false;
            for(int x = 0; x < frutas.length; x++){
              if((palabras[i].equals(frutas[x]))){
                esFruta = true;
              }
            }
            
            if(!esFruta){
              resultado[k] = palabras[i];
              k++;
            }
          }
          
          //poner las otras palabras al principio
          for(int i = 0; i < palabras.length; i++){
            // comprueba si palabra[i] es una fruta
            esFruta = false;
            for(int x = 0; x < frutas.length; x++){
              if((palabras[i].equals(frutas[x]))){
                esFruta = true;
              }
            }
            
            if(esFruta){
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
