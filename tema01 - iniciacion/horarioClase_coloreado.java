/*
 * Escribe un programa que muestre tu horario de clase. Puedes usar espacios o tabuladores
 *para alinear el texto.
 */
package tema01;

/**
 *
 * @author BrandConstantin
 */
public class horarioClase_coloreado {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";

    System.out.println("Presentación colores en Ingles:");
    System.out.println("LUN" +  "\tMAR" +  "\tMIER" +  "\tJUE" +  "\tVIE");
    System.out.println(rojo + "FOL"+ verde + "\tPROG" + morado + "\tSI" + verde + "\tPROG" + naranja + "\tBD\t");
    System.out.println(rojo + "FOL" + verde +  "\tPROG" + morado + "\tSI" + verde + "\tPROG" + naranja + "\tBD\t");
    System.out.println(rojo + "FOL" + verde+  "\tPROG" + morado + "\tSI" + verde + "\tPROG" + naranja + "\tBD\t");
    System.out.println(verde + "PROG" + naranja + "\tBD" + morado + "\tSI" + azul + "\tLM" + verde + "\tPROG\t");
    System.out.println(blanco + "ED" + naranja + "\tBD" + azul + "\tLM" + blanco + "\tED" + morado + "\tSI\t");
    System.out.println(blanco + "ED" + naranja + "\tBD" + azul + "\tLM" + blanco + "\tED" + morado + "\tSI\t");

  }
}
