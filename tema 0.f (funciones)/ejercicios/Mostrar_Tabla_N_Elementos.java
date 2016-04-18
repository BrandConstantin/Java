/*
 * Mostrar el máximo de una tabla de n elementos
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Mostrar_Tabla_N_Elementos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int t[] = new int [6];
        
        System.out.println("Ver el valor máximo de una tabla: ");
        System.out.println("···············································");
        for(int i = 0; i < t.length; i++){
            t[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("Los valores son");
        for(int i = 0; i < t.length; i++){
            System.out.print("|_" + t[i] + "_|");
        }
        System.out.println("\n·················································");
        int max = funciones.Varias.maximo(t);
        System.out.println("El número mayor es " + max);
    }
}
