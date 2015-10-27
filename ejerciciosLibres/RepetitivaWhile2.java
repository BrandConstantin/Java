/*
 * Hallar el producto de varios numeros enteros no negativos. El proceso termina
 * cuando se meta un numero negativo. 
 *
 * @author costy
 */

import java.util.Scanner;

public class RepetitivaWhile2 {
    public static void main(String[] args){
        
        int num = 0;
        int contador = 0;
        int producto = 1;
        
        //salida información
        System.out.println("Introduce un numero entero no negativo:");
        Scanner tecla = new Scanner(System.in);
        num = tecla.nextInt();
        
        while (num >= 10){
            contador = contador + 1;
            producto = producto * num;
            System.out.println("Introduce un numero entero no negativo:");
            num = tecla.nextInt();
        }   
        System.out.println("Se han leido " + contador + " enteros no negativos" + 
                " cuyo producto es: " + producto);
    }
}
