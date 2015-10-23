/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido 
 * por teclado.
 * 
 * @author costy
 */

public class ejer09 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe un numero");
    
    int num = Integer.parseInt(System.console().readLine());
    int digitos = 0;
    
    while (num > 0){
      num = num / 10;
      digitos++;
    }
    
    System.out.println("El numero tiene " + digitos + " digitos");
  }
}
