/*
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
 * debe ser introducida por teclado.
 *
 * @author Costy
 */
import java.util.Scanner;
public class ConversorPesetasEuros {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de pesetas que quieres convertir a euros:");
        long pesetas = tecla.nextInt();
        
        double euros = (double)(pesetas / 166.386);
        
        System.out.printf("Sus %d pesetas son equivalente a %.2f euros", pesetas, euros);
    }
}
