/*
 * Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera:
primer dígito del primer número, primer dígito del segundo número, segundo dígito del primer número,
segundo dígito del segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al
menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números
largos.
Ejemplo 1:
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97
Ejemplo 2:
Por favor, introduzca un número: 137
Introduzca otro número: 909
El número formado por los dígitos pares es 0
El número formado por los dígitos impares es 19379
 */
package t1c1_turno2;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class MezclarParesEImpares {
    public static void main(String[] args) {
      Scanner t = new Scanner (System.in);
      System.out.println("MEZCLAR NUMEROS PARES E IMPARES");
      System.out.println("-----------------------------------------------------------------------------");
      
      System.out.println("Introduce un número: ");
      long num1 = t.nextLong();
      System.out.println("Introduce otro número: ");
      long num2 = t.nextLong();
      System.out.println("---------------------------------------------------------------------------------");
      
      int digito1 = 0;
      int digito2 = 0;
      int digito3 = 0;
      int digito4 = 0;
      long numInvertido1 = 0;
      long numInvertido2 = 0;
      
      //voltear los 2 números
      while( (num1 > 0) && (num2 > 0)){
          digito1 = (int)num1 % 10;
          numInvertido1 = (numInvertido1 * 10) + digito1;
          num1 /= 10;
          
          digito2 = (int)num2 % 10;
          numInvertido2 = (numInvertido2 * 10) + digito2;
          num2 /= 10;
      }
      
      long numInvertido3 = numInvertido1;
      long numInvertido4 = numInvertido2;
      
      //sacar los pares
      System.out.print("Pares: ");
  
      while((numInvertido1 > 0) && (numInvertido2 > 0)){              
          if((numInvertido1 % 10) % 2 == 0){
            System.out.print(numInvertido1 % 10);
          }

          numInvertido1 /= 10;
          
          if((numInvertido2 %10) % 2 == 0){
            System.out.print(numInvertido2 % 10);
          }
          
          numInvertido2 /= 10;
      }

      System.out.println();
      
      //sacar los impares
      
      System.out.print("Impares: ");
      
      while((numInvertido3 > 0) && (numInvertido4 > 0)){              
          if((numInvertido3 % 10) % 2 != 0){
            System.out.print(numInvertido3 % 10);
          }

          numInvertido3 /= 10;
          
          if((numInvertido4 %10) % 2 != 0){
            System.out.print(numInvertido4 % 10);
          }
          
          numInvertido4 /= 10;
      }    
      
      System.out.println();
    }
}
