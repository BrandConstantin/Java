/*
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se 
 * encuentra en la última posición debe pasar a la posición 0. Finalmente, 
 * muestra el contenido del array.
 * 
 * 
 *@Costy 
 */
 
import java.util.Scanner;

public class Array06 {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    int[] numero = new int[15];

    System.out.println("Escribe quince numeros:");
    
    for (int i = 0; i < numero.length; i++) {
      System.out.print((i + 1) + " numero:");
      numero[i] = Integer.parseInt(num.nextLine());
    }
    System.out.println();
    
    for (int i = 0; i < 15; i++) {
      System.out.printf("|%3d|", numero[i]);
    }
    
    int aux = numero[14];
    for (int i = 14; i > 0; i--) {
      numero[i] = numero[i-1];
    }
    numero[0] = aux;

    System.out.println("    ");

    for (int i = 0; i < 15; i++) {
      System.out.printf("|%3d|", numero[i]);
    }
  }
}
