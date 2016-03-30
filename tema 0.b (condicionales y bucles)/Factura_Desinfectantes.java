/*
 * Una empresa que se dedica a la venta de desinfectantes necesita un programa 
 * para gestionar las facturas. En cada factura figura: el código del artículo, 
 * la cantidad vendida en litros y el precio por litro.
 * Se pide de 5 facturas introducidas: Facturación total, cantidad en litros 
 * vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.
 */
package tema.pkg0.b.condicionales.y.bucles;
import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class Factura_Desinfectantes {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        int codigoArticulo;
        double cantidadLitros;
        int precioLitro = 0;
        double importeFactura = 0;
        double facturacionTotal = 0;
        int sumaCantidad = 0;
        int numFacturas = 0;
        int mas600 = 0;
        
        System.out.println("Calcula Factura");
        System.out.println("==================================");
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Factura nº " + i);
            System.out.println("==================================");
            System.out.println("Introduce código producto:");
            codigoArticulo = tecla.nextInt();
            System.out.println("Introduce cantidad litros:");
            cantidadLitros = tecla.nextDouble();
            System.out.println("Introduce precio/litro:");
            precioLitro = tecla.nextInt();

            importeFactura = cantidadLitros * precioLitro;
            facturacionTotal += importeFactura;
            sumaCantidad += cantidadLitros;
            
            if(importeFactura >= 600){
                mas600++;
            }
        }
 
        System.out.println("REZUMEN DE VENTAS");
        System.out.println("La facturación total es de " + facturacionTotal + "€");
        System.out.println("El total de litros vendidos es de " + sumaCantidad + "L");
        System.out.println("Facturas superiores a 600€: " + mas600);
    }
}
