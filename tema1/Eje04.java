/**
 * Escribe un programa que muestre tu horario de clase. Puedes usar espacios o tabuladores
 *para alinear el texto.
 *
 * @author Costy
 */

public class Eje04 { // Clase principal
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println("Presentación colores en Ingles:");
    System.out.println(rojo + "LUN"  + "\tMAR"  + "\tMIER"  + "\tJUE"  + "\tVIE");
    System.out.println(verde + "FOL"  + "\tPROG"  + "\tSI"  + "\tPROG"  + "\tBD");
    System.out.println(naranja + "FOL"  + "\tPROG"  + "\tSI"  + "\tPROG"  + "\tBD");
    System.out.println(azul + "FOL"  + "\tPROG"  + "\tSI"  + "\tPROG"  + "\tBD");
    System.out.println(morado + "PROG"  + "\tBD"  + "\tSI" + "\tLM" + "\tPROG");
    System.out.println(blanco + "ED"  + "\tBD"  + "\tLM"  + "\tED"  + "\tSI");
    System.out.println(rojo + "ED"  + "\tBD" + "\tLM"  + "\tED"  + "\tSI");

  }
}
