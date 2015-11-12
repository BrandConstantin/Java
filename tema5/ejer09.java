
import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido 
 * por teclado.
 * 
 * @author costy
 */
import java.util.Scanner;

public class ejer09 {
  public static void main(String[] args) {   
    
    System.out.println("Escribe un numero");
    
    int num;
    int digitos = 0;
    
    Scanner teclado = new Scanner(System.in);
    num = teclado.nextInt();
    
    while (num > 0){
      num = num / 10;
      digitos++;
    }
    
    System.out.println("El numero tiene " + digitos + " digitos");
  }
}
