/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una 
 * letra, un número o un símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario
 *  mediante un menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda
 * o hacia la derecha.
 * 
 * @author costy
 */
import java.util.Scanner;
public class PiramideRellena {
  public static void main(String[] args) {   
   Scanner tecla = new Scanner(System.in);
   
  System.out.println("DIBUJAR PIRAMIDE RELLENA SIMBOLO");
  System.out.println("==================================================");
  
  System.out.println("Elige hacia donde quieres que apunte el vértice de la pirámide");
  System.out.println("1. hacia arriba");
  System.out.println("2. hacia izquierda");
  System.out.println("3. hacia abajo");
  System.out.println("4. hacia derecha");
  System.out.print("Elige solo una opción de de 1 a 4 y pulsa cualquier teclado\n");

  int caso = tecla.nextInt();
  
  System.out.println("Pulse cualquier teclado para dibujar:");
  String dibujo = tecla.next();
  System.out.println("==================================================");

  switch (caso) {
    case 1:
    System.out.println(" " + " " + " " + " " + dibujo);
    System.out.println(" " + " " + " " + dibujo + dibujo + dibujo);
    System.out.println(" " + " " + dibujo + dibujo + dibujo + dibujo + dibujo);
    System.out.println(" " + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo);
    System.out.println(dibujo + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo);
    break;
    case 2:
    System.out.println(" " + " " + " " + " " + dibujo);
    System.out.println(" " + " " + " " + dibujo + dibujo);
    System.out.println(" " + " " + dibujo + dibujo + dibujo);
    System.out.println(" " + dibujo + dibujo + dibujo + dibujo);
    System.out.println(dibujo + dibujo + dibujo + dibujo + dibujo);
    System.out.println(" " + dibujo + dibujo + dibujo + dibujo);
    System.out.println(" " + " " + dibujo + dibujo + dibujo);
    System.out.println(" " + " " + " " + dibujo + dibujo);
    System.out.println(" " + " " + " " + " " + dibujo);
    break;
    case 3: 
    System.out.println(dibujo + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo);
    System.out.println(" " + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo + dibujo);
    System.out.println(" " + " " + dibujo + dibujo + dibujo + dibujo + dibujo);
    System.out.println(" " + " " + " " + dibujo + dibujo + dibujo);
    System.out.println(" " + " " + " " + " " + dibujo);
    break;
    case 4:
    System.out.println(dibujo);
    System.out.println(dibujo + dibujo);
    System.out.println(dibujo + dibujo + dibujo);
    System.out.println(dibujo + dibujo + dibujo + dibujo);
    System.out.println(dibujo + dibujo + dibujo + dibujo +dibujo);
    System.out.println(dibujo + dibujo + dibujo + dibujo);
    System.out.println(dibujo + dibujo + dibujo);
    System.out.println(dibujo + dibujo);
    System.out.println(dibujo);
    break;
      }
  }
}
