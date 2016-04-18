/*
 * Pedir un numero N y mostrar un mensaje por pantalla N veces
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Mensaje_N_Veces {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int num;
        System.out.println("Introduzca un número: ");
        num = a.nextInt();
        System.out.println("·················································");
        funciones.Varias.mostrar(num);
        System.out.println("·················································");
    }
}
