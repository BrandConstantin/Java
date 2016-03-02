/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre 
 * en orden inverso, es decir, el primero que se introduce es el último en 
 * mostrarse y viceversa.
 * 
 * 
 *@Costy 
 */
import java.util.Scanner;

public class ArrayInverso {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    System.out.println("Introduce 10 numeros y te los enseñare a reves");
    
    double[] numero = new double[10];
    
    for (int i = 0; i < numero.length; i++) {
    System.out.print((i + 1) + " numero:");
    numero[i] = Double.parseDouble(num.nextLine());
    }
  
    System.out.println("Los numeros a reves son:");
  
    for (int a = 9; a >= 0; a--){
    System.out.print(numero[a] + " ");
    }
  }
}
