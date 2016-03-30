/*
 * Multiple de 3
 */
package tema.pkg0.b.condicionales.y.bucles;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Multiple_De_3 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int num;
        boolean multiple = false;
        int contarMultiples = 0;
        
        System.out.println("Mostrar multiples de 3");
        System.out.println("==================================");
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Introduzca un número: ");
            num = tecla.nextInt();
            
            if(num % 3 == 0){
                multiple = true;
                contarMultiples++;
            }
        }
        
        if(multiple == false){
            System.out.println("No existen múltiplos de 3");
        }else{
            System.out.println("Hay un total de " + contarMultiples + " multiplos");
        }
    }
}
