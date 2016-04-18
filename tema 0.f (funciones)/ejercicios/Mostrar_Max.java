/*
 * Pedir un numero N y mostrar un mensaje por pantalla N veces
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Max {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int max;
        int a;
        int b;
        
        System.out.println("Introduzca un número: ");
        a = tec.nextInt();
        System.out.println("Introduzca otro número: ");
        b = tec.nextInt();
        System.out.println("·················································");
        System.out.println("El número mayor es " + funciones.Varias.maximo(a, b));
        System.out.println("·················································");
    }
}
