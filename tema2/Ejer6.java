/**
 *Escribe un programa que calcule el total de una factura a partir de la base 
 * imponible (precio sin IVA). La base imponible estará almacenada en una 
 * variable.
 *
 * @author Costy
 */

public class Ejer6 {
  public static void main(String[] args) {

    double compra = 100 ;
    int iva  = 21;
    double compraTotal;
    
    compraTotal = compra + (compra * iva/100);
    
    System.out.print("Base imponible ...............................|");
    System.out.printf("                  %4.2f  ||\n", compra);
    System.out.printf("| I.V.A......................................\n");
    System.out.printf("Total............................................." +
    "....  %.2f ||\n", compraTotal );
  }
}
