/*
 * Triangulo invertido
 */
package dibujos;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Reloj_Arena {
    public static void main( String [] args ) {
        Scanner teclado = new Scanner(System.in);
        
        int altura = 3;
        int i, j, k;
        
        while(altura <= 3){
            System.out.print("Introduce la altura del rombo (mayor a 3): ");
            altura = teclado.nextInt();
        }
        
        if(altura > 3){
            //parte de abajo
            for (i = altura; i > 0; i--){
                for (k = altura; k > i; k--){
                    System.out.print(" ");
                 }
                for (j =1; j <= i; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            
            //parte de abajo
            for (i = 1; i <= altura; i++){
                for (k = altura; k > i; k--){
                    System.out.print(" ");
                } 
                for ( j =1; j <= i; j++){
                    System.out.print("*" + " ");
                }
                    System.out.println();
            }            
        }
    }    
}
