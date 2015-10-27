/*
 * Ejemplo de tipo enumerado
 *
 * @author costy
 */

public class tipoEnumerado {
  public enum Dias{Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
  
  public static void main(String[] args) {

    //código aplicación
    Dias diaActual = Dias.Martes;
    Dias diaSiguiente = Dias.Miercoles;

    System.out.println("Hoy es "+ diaActual);
    System.out.println("Mañana es " + diaSiguiente);

  }
}