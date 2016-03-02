/*
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
 * estar almacenada en una variable.
 */

/**
 *
 * @author Costy
 */
public class TotalFactura {
    public static void main (String[] args){
        int precioSinIva = 50;
        double iva = (precioSinIva * 21) / 100;
        double precioTotal = precioSinIva + iva;
        
        System.out.printf("Base imponible " + "\t%d\n", precioSinIva); 
        System.out.println("--------------------------------------");
        System.out.printf("IVA " + "        \t%.2f\n", iva); 
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL " + "         \t%.2f", precioTotal); 
    }
}
