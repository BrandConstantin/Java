/*
 * Escribir una función que calcule el máximo común divisor y mostrar resultados
 * en una tabla.
 * 
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Maximo_Divisor_Comun_Tabla {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int maximDivisor;
        int t[] = new int [4];
        
        for(int i = 0; i < t.length; i++){
            t[i] = (int)(Math.random() * 1000 + 1);
        }
        
        System.out.println("Los números son: ");
        System.out.println("----------------------------------------");
        
        for(int i = 0; i < t.length; i++){
            System.out.print("|_" + t[i] + "_|");
        }
        
        System.out.println("");
        maximDivisor = funciones.Varias.maximDivisor(t);
        System.out.println("El maximo divisor es " + maximDivisor);
    }
}
