/*
 * Una empresa que se dedica a la venta de desinfectantes necesita un programa 
 * para gestionar las facturas. En cada factura figura: el código del artículo, 
 * la cantidad vendida en litros y el precio por litro.
 * Se pide de 5 facturas introducidas: Facturación total, cantidad en litros 
 * vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Factura_Desinfectantes {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        //en cada factura figura codigoArticulo, cantidadVendida, precioLitro
        String codigoArticulo;
        int cantidadVendida = 0;
        double precioLitro = 0;
        int cantidadTotalLitros = 0;
        double importeFactura;
        double facturacionTotal = 0;
        int mas600 = 0;
        
        //se piden 5 facturas
        for(int i = 1; i <= 5; i++){
            System.out.println("Factura nº: " + i);
            System.out.println("Introduce codigo articulo: ");
            codigoArticulo = tecla.next();
            System.out.println("Introduce cantidad vendida: ");
            cantidadVendida = tecla.nextInt();
            System.out.println("Introduce precio del litro: ");
            precioLitro = tecla.nextDouble();
            
            importeFactura = cantidadVendida * precioLitro;
            cantidadTotalLitros += cantidadVendida;
            facturacionTotal += importeFactura;
            
            if(importeFactura >= 600){
                mas600++;
            }
        }
        
        //en cada factura se refleja facturacionTotal en €, cantidadTotalLitros x articulo y totalFacturas > de 600€
        System.out.println("Rezumen total: ");
        System.out.println("Hay un total de " + mas600 + " facturas superiores a 600€");
        System.out.println("El total de litros vendidos es de " + cantidadTotalLitros);
        System.out.println("La facturación total de las 5 facturas es de " + facturacionTotal);
    }
}
