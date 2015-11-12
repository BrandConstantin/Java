/**
 * Escribe un programa que calcule el total de una factura a partir de la base 
 * imponible
 * 
 * @author Costy
 */

public class Ejer7 {
  public static void main(String[] args) {
    
  System.out.println("Cual es la base imponible? "); 
    double baseImpo = Double.parseDouble(System.console().readLine()); 
    
    int iva  = 21;
    double compraTotal = baseImpo + (baseImpo * (double)iva/100);
    
    System.out.print("Base imponible ...............................|");
    System.out.printf("%10.2f  ||\n", baseImpo);
    System.out.printf("I.V.A.  ........................................|");
    System.out.printf("%d      ||\n", iva);
    System.out.printf("Total.........................................|");
    System.out.printf("%.2f    ||\n", compraTotal );
                         
  }
}
