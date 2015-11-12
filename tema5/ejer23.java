/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de 
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
 * se debe mostrar el total acumulado, el contador de los números introducidos 
 * y la media.
 * 
 * @author costy
 */
import java.util.Scanner;

public class ejer23 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int suma = 0;
    int numIntrod;
    int totalNumeros = 0;
    boolean terminado = true;
    
    do {
        System.out.println("Introduce numeros:");
        numIntrod = teclado.nextInt();
        terminado = (suma + numIntrod) < 10000;
        
        if (terminado){
            totalNumeros++;
            suma += numIntrod;
        }
    } while (terminado);
    System.out.println("La media de los numeros es " + (suma / totalNumeros) + 
            " el total acumulado siendo " + suma + 
            " con un total de numeros introducidos de " + totalNumeros);  
  }
}