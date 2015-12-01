/* 
 * Calcular el factorial de un numero entero no negativo leido desde teclado.
 * 
 * @author costy
 */

import java.util.Scanner;

public class AlgoritmoFactorial {
    public static void main(String[] args){
        
        int n;
        int factorial;
        int contador;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero no negativo:");
        n = teclado.nextInt();
        System.out.print("===================================================================\n");
        
        while (n < 0){
            System.err.println("Error: solo se admiten numeros positivos!! Vuelve a introducir un numero positivo:");
            n = teclado.nextInt();
        }
        factorial = 1; 
        contador = n;
        
        if (n != 0){
            do {
                factorial *= contador;
                contador--;
            } while (contador != 0);
        }
        System.out.println(n + " != "+ factorial);
    }
}