/*
 * Escribe un programa que pida un número entero y un dígito y que diga a continuación cuántas veces aparece el
* dígito dentro del número.
* Ejemplo 1:
* Por favor, introduzca un número entero con 5 dígitos como máximo: 3667
* Introduzca un dígito: 6
* El 6 aparece 2 veces dentro de 3667.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Digito_dentro_Num {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    long num;
    long digito;
    long numReves = 0;
    int posicion = 1;

    System.out.print("Introduce un numero: ");
    num = teclado.nextLong();
    
    System.out.print("Introduce un digito: ");
    digito = teclado.nextLong();
    System.out.print("===================================================================\n");   
    
    do {
        numReves = (numReves * 10) + (num % 10);
        num = num / 10;
    } while (num > 0);
    
    do {
        if ((numReves % 10) == digito){
            System.out.println("El digito aparece en la posición: " + posicion);
        }
        
        numReves = numReves / 10;
        posicion++;
    } while (numReves > 0);
  }
}
