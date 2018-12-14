package tema03;

/**
 * Queremos transformar una metros dada en metros (introducida desde teclado):
* a decímetros, centímetros y milímetros (sistema internacional);
* a pulgadas, yardas y pies (sistema anglosajón de unidades).
 * Ten en cuenta que 1 pulgada = 2,54 cm, 1 pie = 12 pulgadas y una yarda = 3 pies.
 *
 * @author BrandConstantin
 */
import java.util.Scanner;

public class Conversion_Longitud{
  public static void main(String[] args) {
      Scanner datos = new Scanner(System.in);
      
      System.out.println("Cual es la longitud medida en metros que quieres transformr?");
      double metros = datos.nextDouble();
      
      //hacemos la transformacion tanto en sistema internacional como en el anglosajón
      double decimetros = metros * 10;
      double centimetros = metros * 100;
      double milimetros = metros * 1000;
      double pulgadas = (metros * 100) / 2.54;
      double pies = pulgadas / 12;
      double yardas = pies / 3;
      
       System.out.println("Los " + metros + " metros son:");
       System.out.printf("decimetros = %.2f \t centimetros = %.2f \t milimetros = %.2f \n ", decimetros, centimetros, milimetros);
       System.out.printf("pulgadas = %.2f \t pies = %.2f \t yardas = %.2f ", pulgadas, pies, yardas);
       
       }
}