/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos 
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author costy
 */

public class ejer18 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe un numero:");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.println("Escribe otro numero:");
    int num2 = Integer.parseInt(System.console().readLine());

    if (num1 == num2){
      System.out.println("Escribe 2 numeros distinctos por favor!"); 
    } else {
        if (num1 > num2){
          int aux = num1;
          num1 = num2;
          num2 = aux;
        }
        for (int i = num1; i <= num2; i += 7){
          System.out.println(i + " ");
        }
      }
  }
}
