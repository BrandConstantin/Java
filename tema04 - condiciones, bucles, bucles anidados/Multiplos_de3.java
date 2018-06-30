/*
 * Multiplos de 3
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Multiplos_de3 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            int num = tecla.nextInt();
            
            if(num % 3 == 0){
                System.out.println("Multiplo de 3");
            }else{
                System.out.println("No multiplo de 3");
            }
        }
    }
}
