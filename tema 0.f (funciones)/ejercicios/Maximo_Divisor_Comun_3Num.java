/*
 * Escribir una función que calcule el máximo común divisor de tres números.
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Maximo_Divisor_Comun_3Num {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int a;
        int b;
        int c;
        int maximDivisor;
        
        System.out.println("Introduce número: ");
        a = tecla.nextInt();
        System.out.println("Introduce el seguno número: ");
        b = tecla.nextInt();
        System.out.println("Introduce el tercer número: ");
        c = tecla.nextInt();
        System.out.println("----------------------------------------");
        
        maximDivisor = funciones.Varias.maximDivisor_3(a, b, c);
        System.out.println("El maximo divisor comun de " + a + ", " + b +
                " y " + c + " es " + maximDivisor);
    }
}
