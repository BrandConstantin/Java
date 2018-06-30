/*
 * Mostrar el producto de los 10 primeros numeros impares
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Producto_10_numImpares_b {
     public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int x;
        long producto = 1;
        
        //los primeros 10 numeros impares serián
        //1,3,5,7,9,11,13,15,17,19
        for(x = 1; x <= 20; x++){
            System.out.print("Introduce número " + x + " ");
            int num = tecla.nextInt();
            
            if(num % 2 != 0){
                producto *= num;
            }
        }
        
        System.out.println("La multiplicación de los  primeros impares es " + producto);
     }
}
