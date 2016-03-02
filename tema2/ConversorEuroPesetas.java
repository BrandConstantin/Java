/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
 * estar almacenada en una variable.
 */

/**
 *
 * @author Costy
 */
public class ConversorEuroPesetas {
    public static void main (String[] args){
        int euros = 50;
        double pesetas = (int) (euros * 166.386);
        
        System.out.printf("Aqui tiene los %d euros convertidos en %.2f pesetas", euros, pesetas); 
    }
}
