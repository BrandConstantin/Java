/*
 * Mostrar todos los numeros de 1 al numero introducido
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class De_1_aNum_b {
     public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        int x = 0;
        
         System.out.print("Introduce un número: ");
         num = tecla.nextInt();
         
         while(x <= num){
             System.out.print(x + " ");
             x++;
         }
     }
}
