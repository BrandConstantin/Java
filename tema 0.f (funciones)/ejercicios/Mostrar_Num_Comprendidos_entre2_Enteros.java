/*
 * Mostrar numeros comprendidos entre dos enteros
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Num_Comprendidos_entre2_Enteros {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.println("Numeros comprendidos entre dos valores");
        System.out.println("···············································");
        System.out.println("Introduce primer número: ");
        a = tec.nextInt();
        System.out.println("Introduce el segundo número: ");
        b = tec.nextInt();
        System.out.println("\n·················································");
        funciones.Varias.numComprendidos(a, b);
    }
}
