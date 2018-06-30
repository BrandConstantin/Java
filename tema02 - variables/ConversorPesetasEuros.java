/*
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
 */
package tema02;

/**
 *
 * @author BrandConstantin
 */
public class ConversorPesetasEuros {
    public static void main(String[] args) {
        int pesetas = 890000;
        
        int euros = pesetas / 166;
        System.out.printf("Las %d pesetas son %d euros", pesetas, euros);
    }
}
