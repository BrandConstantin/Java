/*
 * Pedir un número y decir cuantos hay primos de 1 a n
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Num_Primo_de1_aN {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        int contarPrimos = 0;
        int i;
        
        System.out.print("Introduce un número: ");
        num = tecla.nextInt();
        
        for(i = 2; i <= num; i++){
            if(i % 2 != 0){                
                System.out.print(i + " ");
                contarPrimos++;
            }
        }
        
        System.out.println("\nHay un total de " + contarPrimos + " números primos");
    }
}
