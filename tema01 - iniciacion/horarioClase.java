/*
 * Escribe un programa que muestre tu horario de clase. Puedes usar espacios o tabuladores
 *para alinear el texto.
 */
package tema01;

/**
 *
 * @author BrandConstantin
 */
public class horarioClase {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String azul = "\033[34m";
    
    System.out.println("Presentación colores en Ingles:");
    System.out.println(rojo + "LUN"  + "\tMAR"  + "\tMIER"  + "\tJUE"  + "\tVIE");
    System.out.println(verde + "FOL"  + "\tPROG"  + "\tSI"  + "\tPROG"  + "\tBD");
    System.out.println(azul + "FOL"  + "\tPROG"  + "\tSI"  + "\tPROG"  + "\tBD");
    System.out.println(verde + "FOL"  + "\tPROG"  + "\tSI"  + "\tPROG"  + "\tBD");
    System.out.println(azul + "PROG"  + "\tBD"  + "\tSI" + "\tLM" + "\tPROG");
    System.out.println(verde + "ED"  + "\tBD"  + "\tLM"  + "\tED"  + "\tSI");
    System.out.println(azul + "ED"  + "\tBD" + "\tLM"  + "\tED"  + "\tSI");

  }
}
