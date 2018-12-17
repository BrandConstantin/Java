/*
 * Tabla de multiplicar de todos los números
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Tabla_Multiplicar_todo {
     public static void main(String[] args) {
        //Scanner tecla = new Scanner(System.in);
        
         /*System.out.println("Introduce un número: ");*/
         int num = 0;
         
         System.out.println("----------------------------------------------");         
         
         for (int i = 0; i <= 10; i++) {            
             for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
               System.out.print(i + " x " + j + " = " + resultado + "\t");                
             }
             
            System.out.println("");
         }
     }    
}
