/*
 * Escribe un programa que genere una factura bien desglosada a partir del precio inicial, el descuento (si procede)
 * y el IVA aplicado. El precio inicial se debe indicar en euros y puede tener decimales. El programa preguntará si el
 * artículo está en oferta; si contestamos que sí, se hace un 10% de descuento, si no, no hay descuento. El tipo de
 * IVA puede ser 1) Superreducido 2) Reducido 3) General, siendo del 4%, 10% y 21% respectivamente. El IVA se
 * aplica después de haber calculado el descuento.
 * Ejemplo:
 * Por favor, introduzca el precio inicial del artículo en euros: 18.90
 * ¿El artículo está en oferta? (s/n): s
 * Introduzca el tipo de IVA 1) Superreducido 2) Reducido 3) General: 3
 * FACTURA
 * Precio inicial: 18.90
 * Descuento: 1.89 (10%)
 * Precio con descuento: 17.01
 * IVA: 3.57
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Factura_Desglosada {
  public static void main(String[] args) {
      Scanner datos = new Scanner(System.in);
      
      double precio;
      double descuento;
      String respuestaDescuento;
      double iva = 0;
      int respuestaIva;
      double precioConIva = 0;
      double precioConDescuento = 0;
      
      System.out.print("Cual es el precio del producto: ");
      precio = datos.nextDouble();
      
      System.out.print("Tiene el descuento de 10% aplicado? ");
      respuestaDescuento = datos.next().toLowerCase();
      
      System.out.println("--------------------------------------------");
      
      if(respuestaDescuento.equals("si") || respuestaDescuento.equals("s")){
          descuento = (precio * 10) / 100;
          precioConDescuento = precio - descuento;
      }else if(respuestaDescuento.equals("no") || respuestaDescuento.equals("n")){
          descuento = precio;
          precioConDescuento = descuento;
      }else{
          System.out.println("Respuesta desconocida!");
          System.out.println("No se te aplicara descuento");
          System.out.println("--------------------------------------------");
      }
      
      System.out.println("Escoge el tipo de IVA?");
      System.out.println("1. Reducido");
      System.out.println("2. General");
      System.out.println("3. Alto");
      respuestaIva = datos.nextInt();
      
      switch(respuestaIva){
          case 1: 
              iva = (precioConDescuento * 4) / 100;
              precioConIva = precioConDescuento + iva;
              break;
          case 2: 
              iva = (precioConDescuento * 10) / 100;
              precioConIva = precioConDescuento + iva;
              break;
          case 3: 
              iva = (precioConDescuento * 21) / 100;
              precioConIva = precioConDescuento + iva;
              break;
          default:
              System.out.println("Opcion incorrecta!");
              break;
      }
      
      System.out.println("--------------------------------------------");
      System.out.println(" \tPrecio inicial: \t" + precio + "€");
      System.out.println(" \tDescuento: \t" + precioConDescuento + "%");
      System.out.println(" \tIVA aplicada: \t" + iva + "%");
      System.out.println(" \tPrecio total: \t" + precioConIva + "€");
  }
}
