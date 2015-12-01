/**
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
 *
 * @author costy
 */
import java.util.Scanner;

public class FacturaDesglosada{
  public static void main(String[] args) {
      
      Scanner datos = new Scanner(System.in);
      
      System.out.println("FACTURA DESGLOSADA");
      
      double descuento = 0;
      double ivaAplicada = 0;
      double precioConDescuento = 0;
      double precioTotal = 0;
      
      System.out.println("Introduzca el precio inicial del artículo en euros:");
      double euros = datos.nextDouble();
      System.out.print("===================================================================\n");
      
      System.out.println("Tiene descuento 10% el producto? (s/n)");
      String respuesta = datos.next();
      
      if (respuesta.equals("s")){
          descuento = (euros * 10) / 100;
      } else if (respuesta.equals("n")){
          descuento = 0; 
      } else {
          System.err.println("Programa finalizado! Has pulsado una tecla incorrecta.");       
      }
      
      if ((respuesta.equals("n")) || (respuesta.equals("s"))){
      System.out.print("===================================================================\n");      
      
      System.out.println("Elije un tipo de IVA: \n1-Supereducido \n2-Reducido \n3-General");
      int iva = datos.nextInt();
      
      switch (iva){
          case 1:
              ivaAplicada = ((euros - descuento) * 4) / 100;
              break;
          case 2:
              ivaAplicada = ((euros - descuento)  * 10) / 100;
              break;
          case 3:
              ivaAplicada = ((euros - descuento)  * 21) / 100;
              break;
          default: 
            System.err.println("Programa finalizado! Has pulsado una tecla incorrecta.");
        }
      
      precioConDescuento = euros - descuento;
      
       System.out.printf("FACTURA: \nPrecio Inicial: %f \nDescuento: %f \nPrecio con Descuento: %f \nIVA %f " + 
          " ", euros, descuento, precioConDescuento, ivaAplicada);
      }
      
      precioTotal = precioConDescuento + ivaAplicada;
      System.out.println("El precio total es de " + precioTotal + "€");
  }
}