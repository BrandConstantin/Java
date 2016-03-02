/*
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
 * por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
 * y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
 * la lista generada anteriormente. Los números que se han cambiado deben aparecer
 * entrecomillados.
 * 
 * 
 *@Costy 
 */
 
import java.util.Scanner;

public class ArrayCambiarValorPorTeclado {
  public static void main(String[] args) {
    
    Scanner num = new Scanner(System.in);
    
    int[] numero = new int[100];
    
    for (int i = 0; i < numero.length; i++) {
      numero[i] = (int)(Math.random() * 21);
      System.out.print(numero[i] + "  ");
    }
    
    System.out.println("\nIntroduce un numero de 1 - 20 que quieres cambiar:");
    int num1 = num.nextInt();
    System.out.println("Introduce el numero con el cual quieres cambiar de 1- 20:");
    int num2 = num.nextInt();
   
    if ((num1 > 1) && (num1 < 20) && (num2 > 1) && (num2 < 20)){
        for (int a : numero){
          if(a == num1){
            System.out.print("'" + num2 + "'");
          }else{
            System.out.print(a);
          }
          System.out.print(" ");
        }   
    } else {
        System.err.println("Algun numero fuera de rango!");
    }
  }
}
