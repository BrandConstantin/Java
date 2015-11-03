/**
Escribe un programa que lea un número n e imprima una pirámide de números con n
* filas como en la siguiente figura:
*    1
*   121
*  12321
* 1234321
* 
* @author costy
 */
import java.util.Scanner;

public class ejer24 {

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.println("Introduce la altura de la pirámide:");
    
    int numIntrod;
    int numero;

    numIntrod = teclado.nextInt();
    
    for (int a = 1; a <= numIntrod; a++) {
        for (int espacio = 0; espacio < (numIntrod - a); espacio++){
            System.out.print(" ");
        }
        for (numero = 1; numero <= a; numero++) {
            System.out.print(numero);
        }
        for (numero = a - 1; numero > 0; numero--) {
            System.out.print(numero);
        }
        System.out.println();
    }
  }
}