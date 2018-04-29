/*
 * Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos pares.
Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde
sea necesario para admitir números largos.
Ejemplo 1:
Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Suma de los dígitos pares: 22
Ejemplo 2:
Por favor, introduzca un número entero positivo: 31779
Dígitos pares:
Suma de los dígitos pares: 0
Ejemplo 3:
Por favor, introduzca un número entero positivo: 2404
Dígitos pares: 2 4 0 4
Suma de los dígitos pares: 10
 */
package t1c1;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class SumaDigitosPares {
      public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("SUMA DITIOS PARES");
          System.out.println("------------------------------------------------------------------------------------------------------");
          
          System.out.println("Introduzca un número largo: ");
          long num = t.nextLong();
          System.out.println("-------------------------------------------------------------------------------------------------------");
          
          long digito = 0;
          int sumaPares = 0;
          long numInvertido = 0;
          
          //invertir número
          while (num > 0){
            digito = num % 10;
            numInvertido = (numInvertido * 10) + digito;
            num /= 10;
          }
          
          System.out.println("Num invertido: " + numInvertido);
          System.out.println("---------------------------------------------------------------------");
                
          //dar la vuelta de nuevo al número
          while (numInvertido > 0){
            digito = numInvertido % 10;
            numInvertido /= 10;
            
            if(digito % 2 == 0){
              sumaPares += digito;
              System.out.print(digito + " ");
            }
          }
          
          System.out.println("\nLa suma de los pares es: " +  sumaPares);
      }
}
