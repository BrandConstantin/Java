/*
 * Mostrar el producto de los 10 primeros numeros impares
 */
package tema04;
import java.util.Scanner;
/**
 *
 * @author BrinCo
 */
public class Producto_10_numImpares_a {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int x;
        long producto = 1;
        
        System.out.println("Producto 10 primeros numeros impares:");
        System.out.println("==================================");
        
        //los primeros 10 numeros impares serián
        //1,3,5,7,9,11,13,15,17,19
        for(x = 1; x <= 20; x += 2){
            producto *= x;
        }
        
        System.out.println("La multiplicación de los 10 primeros impares es " + 
                            producto);
    }
}
