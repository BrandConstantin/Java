/*
 * Realiza una función que tome como parámetro un array y que devuelva un número formado con los
dígitos que hay en cada una de las celdas del array en orden. Suponemos que en cada celda habrá un
dígito (un número del 0 al 9). Por ejemplo, si el array a contiene los valores {8, 2, 7, 1}, la sentencia
convierteArrayEnNumero(a) devolvería el 8271. La cabecera de la función es la siguiente:
public static long convierteArrayEnNumero(int[] n)
 */
package t2c2_b;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class ConvierteArrayEnNumero {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.println("Convierte Array En Número");
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("Array: ");
        int[] a = new int[10];
        generaArray(a);
        System.out.println("\n----------------------------------------------");
        long numero = convierteArrayEnNumero(a);
        System.out.println("Array convertido en número: " + numero);
    }

    public static void generaArray(int[] a){
        //generamos números dentro del array
        int i;

        for(i = 0; i < a.length; i++){ 
            a[i] = (int)(Math.random() * 10);
            System.out.print(a[i] + "|");
        }
    }

    public static long convierteArrayEnNumero(int[] a){
        long multiplicador = 1;
        long numero = 0;
        int j;
        
        for(j = a.length - 1; j >= 0; j--){
            numero += a[j] * multiplicador;
            multiplicador = multiplicador * 10;
        }  
        
        return numero;
    }
}
