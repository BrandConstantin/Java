/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe
 * ser introducida por teclado.
 *
 * @author Costy
 */
import java.util.Scanner;
public class ConversorEuroPesetas {
    public static void main (String[] args){
        Scanner tecla = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de euros que quieres convertir a pesetas:");
        int euros = tecla.nextInt();
        
        double pesetas = (double)(euros * 166.386);
        
        System.out.printf("Sus %d euros son equivalente a %.2f pesetas", euros, pesetas);
    }
}
