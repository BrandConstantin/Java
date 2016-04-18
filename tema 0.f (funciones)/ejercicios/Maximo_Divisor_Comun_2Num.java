/*
 * Escribir una función que calcule el máximo común divisor de dos números.
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Maximo_Divisor_Comun_2Num {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a;
        int b;
        int maximDivisor;
        
        System.out.println("Introduce número: ");
        a = tecla.nextInt();
        System.out.println("Introduce el seguno número: ");
        b = tecla.nextInt();
        System.out.println("----------------------------------------");
        
        maximDivisor = funciones.Varias.maximDivisor(a, b);
        System.out.println("El maximo divisor comun de " + a + " y " + b +
                " es " + maximDivisor);
    }
}
