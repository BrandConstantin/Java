/*
 * Ejemplo de tipo enumerado
 *
 * @author costy
 */

public class ejemploCadenas {
  
  public static void main(String[] args) {

    //código aplicación
    String cad1 = "CICLO DAW";
    String cad2 = "IES Campanillas";

    System.out.println("Yo soy Costy y estudio "+ cad1);
    System.out.printf("El instituto esta en %s\n", cad2);
    
    //concatenación de cadenas
    System.out.printf("Estudio %s\n ", cad1.concat(cad2));
    
    //pasar a minúsculas
    System.out.printf("Estudio %s\n ", cad1.toLowerCase());

  }
}