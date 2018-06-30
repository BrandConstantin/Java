/*
 * Escribe un programa que calcule el precio final de un producto según su base imponible (precio
antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código
promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4%
respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o
se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los
números no estén tabulados.
Ejemplo:
Introduzca la base imponible: 25
Introduzca el tipo de IVA (general, reducido o superreducido): reducido
Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
Base imponible
25.00
IVA (10%)
2.50
Precio con IVA
27.50
Cód. promo. (mitad): -13.75
TOTAL
13.75
 */
package t1c1;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class BaseImponible {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("CALCULAR BASE IMPONIBLE");
          System.out.println("------------------------------------------------------------------------------------------------------");
          
          System.out.println("Introduce el precio del producto: ");
          double precio = t.nextInt();
          
          System.out.println("Aplica un tipo de IVA :");
          System.out.println("1. General");
          System.out.println("2. Reducido");
          System.out.println("3. Superreducido");
          int opcion = t.nextInt();
          
          double iva = 0;
          
          switch (opcion){
                case 1:
                    iva = 0.21;
                    break;
                case 2:
                    iva = 0.10;
                    break;
                case 3:
                  iva = 0.04;
                default:
          }
          
          double ivaAplicada = iva * precio;
          double precioConIva = ivaAplicada + precio;
          
          System.out.println("-----------------------------------------------------------------------");
              System.out.println("Que tipo de promocion tiene el producto?");
              System.out.println("1. Sin promoción");
              System.out.println("2. Precio a mitad");
              System.out.println("3. 5€ descuento");
              System.out.println("4. 5% descuento");
              int tipoPromocion = t.nextInt();
              
          double precioConPromo = 0;
          String tipoPromo = "";
              
          switch(tipoPromocion){
            case 1 : 
              precioConPromo = precioConIva;
              tipoPromo = "Sin Promoción";
              break;
            case 2: 
              precioConPromo = precioConIva * 0.5;
              tipoPromo = "Mitad Precio";
              break;
            case 3:
              precioConPromo = precioConIva - 5;
              tipoPromo = "5€ descuento";
              break;
            case 4:
              precioConPromo = precioConIva - (precioConIva * 0.05);
              tipoPromo = "5% descuento";
              break;
            default : 
          }
          
          System.out.println("-------------------------------------------------------------------------------");
          System.out.println("BASE IMPONIBLE \t " + precio + "€");
          System.out.println("IVA : \t" + (iva * 100) + "%");
          System.out.println("PRECIO + IVA : \t" + precioConIva + "€");
          System.out.println("PROMOCION \t" + tipoPromo);
          System.out.println("TOTAL \t" + precioConPromo + "€");
  }
  
}
