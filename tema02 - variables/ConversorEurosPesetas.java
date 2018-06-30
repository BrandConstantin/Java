/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */
package tema02;

/**
 *
 * @author BrandConstantin
 */
public class ConversorEurosPesetas {
    public static void main(String[] args) {
        double euros =  100;
        double pesetas = 166;
        
        double conversor = euros * pesetas;
        System.out.printf("Los %.1f euros son %.1f pesetas", euros, conversor);
    }
}
