/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class TotalFactura {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        double producto1;
        double producto2;
        double producto3;
        double iva = 0.21;
        
        System.out.print("Introduce el precio del primer producto: ");
        producto1 = t.nextDouble();
        System.out.print("Introduce el precio del segundo producto: ");
        producto2 = t.nextDouble();
        System.out.print("Introduce el precio del segundo producto: ");
        producto3 = t.nextDouble();
        System.out.println("........................................"); 
        
        double precioConIva1 = producto1 * iva;
        double total1 = producto1 + precioConIva1;
        
        double precioConIva2 = producto2 * iva;
        double total2 = producto2 + precioConIva2;
        
        double precioConIva3 = producto3 * iva;
        double total3 = producto3 + precioConIva3;
        
        System.out.println("Factura");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Precio Articulo      \tIva      \tTotal Factura");
        System.out.printf("%-10s         \t%.2f    \t%8.2f\n", producto1, precioConIva1, total1);
        System.out.printf("%-10s         \t%.2f    \t%8.2f\n", producto2, precioConIva2, total2);
        System.out.printf("%-10s         \t%.2f    \t%8.2f\n", producto3, precioConIva3, total3);
    }
}
