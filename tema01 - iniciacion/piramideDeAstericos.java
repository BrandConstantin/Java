/*
 *Escribe un programa que pinte por pantalla una pirámide rellena a base de asteriscos. La
 *base de la pirámide debe estar formada por 9 asteriscos.
 */
package tema01;

/**
 *
 * @author BrandConstantin
 */
public class piramideDeAstericos {
  public static void main(String[] args) {

    System.out.println("Dibujo Piramide");
    String rojo = "\033[31m";
    String verde = "\033[32m";

    System.out.println(rojo + " " + " " + " " + " " + "*" + " " + " " + " " +" ");
    System.out.println(verde + " " + " " + " " + "*" + "*" + "*" + " " + " " +" ");
    System.out.println(rojo + " " + " " + "*" + "*" + "*" + "*" + "*" + " " +" ");
    System.out.println(verde + " " + "*" +  "*" + "*" + "*" + "*"  + "*" + "*" +" ");
    System.out.println(rojo + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" +"*");
     
  }
}
