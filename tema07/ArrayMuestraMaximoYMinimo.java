/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre los 
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * 
 *@Costy 
 */
 
import java.util.Scanner;

public class ArrayMuestraMaximoYMinimo {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    double minimo = 0;
    double maximo = 0;
    double[] numero = new double[10];

    System.out.println("Escribe diez numeros:");
    
    for (int i = 0; i < numero.length; i++) {
      System.out.print((i + 1) + " numero:");
      numero[i] = Double.parseDouble(num.nextLine());
      
      if ( i == 0){
        maximo = numero[i];
        minimo = numero[i];
      }
      
      if (numero[i] < minimo){
        minimo = numero[i];
      }
      if (numero[i] > maximo){
        maximo = numero[i];
      }
    }
    for(int i = 0; i < numero.length; i++){
      if (numero[i] == minimo){
        System.out.println(numero[i] + "\tMINIMO");
      }
      if (numero[i] == maximo){
        System.out.println(numero[i] + "\tMAXIMO");
      }else{
        System.out.println(numero[i]);
      }
    }
  }
}
