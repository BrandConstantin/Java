/*
 * Pedir 10 números y contar los negativos
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Mostrar_Negativos {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);    
        
        int contadorNumeros = 10;
        int num = 0;
        int contadorNegativos = 0;
        
        for(int i = contadorNumeros; i > 0; i--){
            System.out.println("Introduce número: ");
            num = tecla.nextInt();
                    
            if(num < 0){
                contadorNegativos++;
            }
        }
        
        System.out.println("Hay un total de " + contadorNegativos + " números negativos");
    }
}
