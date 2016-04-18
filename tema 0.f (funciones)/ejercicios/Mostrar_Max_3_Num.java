/*
 * Mostrar el máximo de 3 numeros
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Max_3_Num {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        
        System.out.println("Introduzca I número: ");
        a = tec.nextInt();
        System.out.println("Introduzca II número: ");
        b = tec.nextInt();
        System.out.println("Introduzca III número: ");
        c = tec.nextInt();
        System.out.println("·················································");
        int max = funciones.Varias.maximo(a, b, c);
        System.out.println("El número mayor es " + max);
        System.out.println("·················································");
    }
}
