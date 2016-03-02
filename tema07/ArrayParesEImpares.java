/*
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * 
 *@Costy 
 */
 
import java.util.Scanner;

public class ArrayParesEImpares {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    int[] numero = new int [8];
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    //String morado = "\033[35m";
    //String blanco = "\033[37m";
    
    //pide los numeros y los muestra
    System.out.println("Escribe ocho numeros:");
    System.out.println("===================================================");

    for (int i = 0; i < numero.length; i++) {
      System.out.print(azul + (i + 1) + " numero:");
      numero[i] = Integer.parseInt(num.nextLine());

    //diferenciar pares de impares
      if ((numero[i] % 2) == 0){
        System.out.println(numero[i] + verde + "\tPAR");
      } else{
        System.out.println(numero[i] + naranja + "\tIMPAR");
      }
    }
  }
}
