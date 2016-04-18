/*
 * diseñar una función que devuelve una tabla con los divisores.

 */
package ejercicios;

import funciones.Varias;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Num_De_Divisores_Primos_conTabla {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int num = 1;
        int div[] = funciones.Varias.divisores(num);
        
        System.out.println("Divisores primos");
        System.out.println("···············································");
        System.out.println("Introduce un número: ");
        num = tec.nextInt();
        System.out.println("\n·················································");
        System.out.println("Los divisores de " + num + " son: ");
        for(int i = 0; i < funciones.Varias.divisores(num).length; i++){
            System.out.println("|_" + funciones.Varias.divisores(num) + "_|");
        }
        System.out.println();
    }
    //ejercicio con errores
    //mirar más tarde
}
