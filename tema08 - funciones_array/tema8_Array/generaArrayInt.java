/*
 *  Genera un array de tamaño n con números aleatorios cuyo
 * intervalo (mínimo y máximo) se indica como parámetro.
 */
package tema8_Array;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class generaArrayInt {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);

        System.out.println("Programa que genera un array aleatorio: ");
        System.out.println("Introduzca la longitud del array: ");
        int numIntrod = tecla.nextInt();
        System.out.println("Introduzca número máximo: ");
        int maximo = tecla.nextInt();
        System.out.println("Introduzca número mínimo: ");
        int minimo = tecla.nextInt();
        System.out.println("-----------------------------------------------");
        
        int[] a = funciones.funcionesArray.generaArrayInt(numIntrod, maximo, minimo);
        System.out.println("El array resultante es \n" + funciones.funcionesArray.generaArrayInt(numIntrod, maximo, minimo));
    }
}
