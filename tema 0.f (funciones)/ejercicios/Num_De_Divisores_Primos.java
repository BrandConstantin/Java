/*
 * Devolver número de divisores primos que tiene un número
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Num_De_Divisores_Primos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int num;
        int div;
        
        System.out.println("Divisores primos");
        System.out.println("···············································");
        System.out.println("Introduce un número: ");
        num = tec.nextInt();
        System.out.println("\n·················································");
        div = funciones.Varias.numDivisores(num);
        System.out.println("El numero tiene " + div + " divisores");
    }
}
