/**
 * Queremos transformar una longitud dada en metros (introducida desde teclado):
* a decímetros, centímetros y milímetros (sistema internacional);
* a pulgadas, yardas y pies (sistema anglosajón de unidades).
 * Ten en cuenta que 1 pulgada = 2,54 cm, 1 pie = 12 pulgadas y una yarda = 3 pies.
 *
 * @author costy
 */
import java.util.Scanner;

public class ConversionLongitud{
  public static void main(String[] args) {
      
      Scanner datos = new Scanner(System.in);
      
      System.out.println("Conversion de longitud dada en metros");
      
      System.out.println("Cual es la longitud o los metros que quieres transformr?");
      double longitud = datos.nextDouble();
      
      //hacemos la transformacion tanto en sistema internacional como en el anglosajón
      double decimetros = longitud * 10;
      double centimetros = longitud * 100;
      double milimetros = longitud + 1000;
      double pulgadas = longitud * 100 / 2.54;
      double pies = pulgadas / 12;
      double yardas = pies / 3;
      
       System.out.println("Los metros " + longitud + " que quieres transformar a dado como resultado:");
       System.out.printf("decimetros = %.5f\n centimetros = %.5f\n milimetros = %.5f\n ", decimetros, centimetros, milimetros);
       System.out.printf("pulgadas = %5f\n pies = %5f\n yardas = %5f ", pulgadas, pies, yardas);
       
       }
}