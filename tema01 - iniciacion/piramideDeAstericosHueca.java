/*
 *Igual que el programa anterior, pero esta vez la pirámide estará hueca (se debe ver
 *únicamente el contorno hecho con asteriscos).
 */
package tema01;

/**
 *
 * @author BrandConstantin
 */
public class piramideDeAstericosHueca {
  public static void main(String[] args) {

    System.out.println("Dibujo piramide hueca e invertida");
    String rojo = "\033[31m";
    String verde = "\033[32m";

    System.out.println(rojo + "*" + "*" + "*" + "*" + "*" + "*" + "*" + "*" +"*");
    System.out.println(verde + " " + "*" + " " + " " +  " " + " " + " " + "*");
    System.out.println(rojo + " " + " " + "*" + " " + " " + " " + "*");
    System.out.println(verde + " " + " " +  " " + "*" + " " + "*");
    System.out.println(rojo + " " + " " + " " + " " + "*");   
     
  }
}
