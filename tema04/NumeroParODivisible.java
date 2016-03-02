/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o divisible
 * entre 5.
 * 
 * @author Costy
 */
import java.util.Scanner;
public class NumeroParODivisible {

  public static void main(String[] args) {
    Scanner tecla = new Scanner (System.in);

    System.out.println("NUMERO PAR O DIVISIBLE CON 5");
    System.out.println("===============================================");
    
    System.out.print("Introduce un numero:");
    int num = tecla.nextInt();
    
    if(num % 2 == 0){
        System.out.println("El numero es PAR");
    } else {
        System.err.println("El numero es IMPAR");
    }
    
    if(num % 5 == 0){
        System.out.println("El numero es DIVISIBLE con 5");
    } else {
        System.err.println("El numero no es DIVISIBLE con 5");
    }

  }
}
