/*
 * Pedir un número y decir cuantos hay primos de 1 a n
 */
package tema.pkg0.c.bucles.anidados;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Num_Primos_de_1_a_n_While {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int n;
        int i = 1;
        int contarPrimos = 0;
        boolean primo = false;
        
        System.out.println("Contar primos");
        System.out.println("==================================");
        
        System.out.println("Introduce un número: ");
        n = tecla.nextInt();
        
        while(i <= n){
            if(i % 2 == 0){
                primo = false;
                contarPrimos++;
            }
            i++;
        }
        System.out.println("De 1 a " + n + " hay un total de " + contarPrimos + 
                " primos");
    }
}
