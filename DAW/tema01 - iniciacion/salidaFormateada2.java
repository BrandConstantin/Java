/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema01;

/**
 *
 * @author BrandConstantin
 */
public class salidaFormateada2 {
    public static void main(String[] args){
        System.out.println("ARTICULO          PRECIO          Nยบ CAJAS");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-10s     %8.2f         %6d\n", "manzanas", 4.5, 10);
        System.out.printf("%-10s     %8.2f         %6d\n", "chirimoyas", 4.87, 12);
        System.out.printf("%-10s     %8.2f         %6d\n", "uvas", 12.456, 9);
    }    
}
