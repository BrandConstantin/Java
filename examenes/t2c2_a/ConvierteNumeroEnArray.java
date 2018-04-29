/*
Realiza una función que tome como parámetro un número y que devuelva un array con los dígitos de
ese número separados en cada una de las celdas. Por ejemplo, convierteNumeroEnArray(1728)
devolvería un array de cuatro números enteros con el 1 en la posición 0, el 7 en la posición 1, el 2 en
la posición 2 y el 8 en la posición 3. La cabecera de la función es la siguiente:
public static int[] convierteNumeroEnArray(long n)
 */
package t2c2_a;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class ConvierteNumeroEnArray {
    public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("FUNCION: DECIR SI LA PIRAMIDE ESTA RELLENA O NO");
          System.out.println("-----------------------------------------------------------------------------");
          
          System.out.print("Introduce número que quieres convertirlo en array: ");
          long n = t.nextLong();
          System.out.println("------------------------------------------------------------------------------");
          
          int i;
          int[] a = convierteNumeroEnArray(n);
          
          for (i = 0; i < a.length ; i++ ) {
              System.out.print(a[i] + "|");
          }
    }
      
    //convertir número en un array
    public static int[] convierteNumeroEnArray(long n){
    int longitud = 0;
    long contador = n;
    
    //invierte el número
    while (contador > 0){
      contador /= 10;
      longitud++;
    }

    int[] a = new int[longitud];
    int control = longitud - 1;
    
    //vuelve a invertir el número a su forma original
    //y lo introduce en cada celda del array
    while (n > 0){
      long numInvertido = n % 10;
      a[control] = (int)numInvertido;
      n /= 10;
      control--;
    }
    
    return a;
    }    
}
