/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
 * estar almacenada en una variable.
 */

/**
 *
 * @author Costy
 */
public class ConversorPesetasEuros {
    public static void main (String[] args){
        long pesetas = 500000000;
        double euros = (long) (pesetas / 166.386);
        
        System.out.printf("Aqui tiene los %d pesetas convertidos en %.2f euros", pesetas, euros); 
    }
}
