/**
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un
 *color diferente.
 *
 * @author Costy
 */

public class Eje5 { // Clase principal
  public static void main(String[] args) {
 String rojo = "\033[31m";
 String verde = "\033[32m";
 String naranja = "\033[33m";
 String azul = "\033[34m";
 String morado = "\033[35m";
 String blanco = "\033[37m";

    System.out.println("Presentación colores en Ingles:");
    System.out.println("LUN"  + " " +  "MAR"  + " " +  "MIER"  + " " +  "JUE"  + " " +  "VIE\t");
    System.out.println(rojo + "FOL"  + " " + verde + "PROG"  + " " + morado + "SI"  + " " + verde + "PROG"  + " " + naranja + "BD\t");
    System.out.println(rojo + "FOL"  + " " + verde +  "PROG"  + " " + morado + "SI"  + " " + verde + "PROG"  + " " + naranja + "BD\t");
    System.out.println(rojo + "FOL"  + " " + verde+  "PROG"  + " " + morado + "SI"  + " " + verde + "PROG"  + " " + naranja + "BD\t");
    System.out.println(verde + "PROG"  + " " + naranja + "BD"  + " " + morado + "SI" + " " + rojo + "LM" + " " + verde + "PROG\t");
    System.out.println(blanco + "ED"  + " " + naranja + "BD"  + " " + rojo + "LM"  + " " + blanco + "ED"  + " " + morado + "SI\t");
    System.out.println(blanco + "ED"  + " " + naranja + "BD" + " " + rojo + "LM"  + " " + blanco + "ED"  + " " + morado + "SI\t");

  }
}
