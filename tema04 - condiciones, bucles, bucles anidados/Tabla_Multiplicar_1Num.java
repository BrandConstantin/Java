/*
 * Tabla multiplicar
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Tabla_Multiplicar_1Num {
     public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
         System.out.println("Introduce un número: ");
         int num = tecla.nextInt();
         
         System.out.println("----------------------------------------------");
         
         for (int i = 0; i <= 10; i++) {
             int resultado = i * num;
             System.out.println(i + " x " + num + " = " + resultado);
         }
     }
}
