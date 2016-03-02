/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A 
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello 
 * una tabla. Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el 
 * resto de números (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe 
 * mostrar el array resultante.
 * 
 * 
 *@Costy 
 */
 
import java.util.Scanner;

public class ArrayPrimosPrimeraPosicion {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    int[] numero = new int[10];
    int[] pares = new int [10];
    int[] impares = new int [10];
    String verde = "\033[32m";
    String azul = "\033[34m";
    String naranja = "\033[33m";
    int contaImpar = 0;
    int contaPar = 0;
    int i;
    
    System.out.println("Escribe 10 numeros:");
    System.out.println("===================================================");
    
    //Se guardan los numeros en un array
    for (i = 0; i < numero.length; i++) {
      System.out.print((i + 1) + " numero:");
      numero[i] = Integer.parseInt(num.nextLine());
    }
    
    System.out.println(naranja + "=======================================================================");
    
    //Mostras el indice y sus numeros guardados en el array
    for (i = 0; i < numero.length; i++){
      System.out.print(verde + i + "\t");
    }
    System.out.println("\n-----------------------------------------------------------------------\n");
    for (i = 0; i < numero.length; i++){
      System.out.print(azul + numero[i] + "\t");
    
      //diferenciar pares de impares, contarlos y almacenarlos en un array
      if ((numero[i] % 2) == 0){
        pares[contaPar++] = numero[i];
      } else{
        impares[contaImpar++] = numero[i];
      }
    }
     
    //desplazar los pares al principio y los impares al final
    for (i = 0; i < pares.length; i++){
      numero[i] = pares[i];
    }
 
    int aux = 0;
      
    for (i = contaPar; i < numero.length; i++){
      numero[i] = impares[aux];
      aux++;
    }

    System.out.println(naranja + "\n=========================================================================");
    System.out.println(naranja + "\n=========================================================================");
    System.out.println(naranja + "\n=========================================================================");
    
    //ordenar los pares y los impares
    for (i = 0; i < numero.length; i++){
      System.out.print(verde + i + "\t");
    }
    System.out.println("\n-----------------------------------------------------------------------\n");
    for (i = 0; i < numero.length; i++){
      System.out.print(azul + numero[i] + "\t");
    }
  }
}
