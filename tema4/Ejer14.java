/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o 
 * divisible entre 5.
 * 
 * @author costy
 */

public class Ejer14 {
  public static void main(String[] args) {   
  
    System.out.println("Introduce un numero por tecladon\n");
    
    int num = Integer.parseInt(System.console().readLine());
    
      if (num % 2 ==0){
        System.out.println("El numero es par");
      } else {
       System.out.println("El numero es impar");
      }
  }
}
