/*
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 */
package tema02;

/**
 *
 * @author BrandConstantin
 * 
 */
public class CalcularFactura {
    public static void main(String[] args) {
        double precio = 100.00;
        double iva = 0.21;
        
        double precioConIva = precio * iva;
        double total = precio + precioConIva;
        
        System.out.println("Factura");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Precio Articulo      \tIva      \tTotal Factura");
        System.out.printf("%-10s         \t%.2f    \t%8.2f\n", precio, precioConIva, total);
        
    }
}
