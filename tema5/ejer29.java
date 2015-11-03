/**
* Escribe un programa que muestre por pantalla todos los números enteros
* positivos menores a uno leído por teclado que no sean divisibles entre otro 
* también leído de igual forma.
* 
* @author costy
 */
import java.util.Scanner;

public class ejer29 {

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
    
    int numIntrod;
    int divisor;
    
    do {
        System.out.println("Introduce un numro");
        numIntrod = teclado.nextInt();  
        
        System.out.println("Introduce un divisor");
        divisor = teclado.nextInt();  
        
        
    } while (numIntrod < 0);
  }
}