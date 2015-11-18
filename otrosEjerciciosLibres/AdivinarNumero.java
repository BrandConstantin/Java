/*
 * 
 * Enunciado: Haz un programa que intente adivinar un número entero secreto 
 * entre 0 y 100 que has escrito en un papel. El programa comenzará preguntando 
 * por un número dentro del rango y tú tendrás que contestarle por teclado si tu
 * número es exactamente ése (ha acertado) o bien es mayor o menor. Con esa 
 * pista, el programa tendrá que volver preguntar otro número y así sucesivamente
 * hasta que acierte el número. Hay que intentar que el programa adivine el 
 * número en la menor cantidad de pasos posibles. El programa debe ser capaz de 
 * saber si el usuario lo está engañando dándole pistas falsas.
 * 
 * @costy
 * 
 */

import java.util.Scanner;

public class AdivinarNumero {

  public static void main(String[] args) {
    int contador = 0;
    int minimo= 0;
    int maximo= 100;
    int numeroLeido;
    boolean fin = false;
    int adivinado;

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("ADIVINADOR DE NÚMERO");
    System.out.println("====================");
    System.out.println("Escribe 2 cuando el numero es menor que el numero secreto");
    System.out.println("Escribe 0 cuando he acerdado el numero secreto");
    System.out.println("Escribe 1 cuando el numero es mayor que el numero secreto");

    while (!fin) {
      adivinado= (minimo + maximo) / 2;
      System.out.printf("¿El número secreto es %d?\n", adivinado);
      
      do {
        numeroLeido = teclado.nextInt();
      } while (numeroLeido<0 || numeroLeido>2);
        contador++;
        
      switch (numeroLeido) {

        case 0:
          System.out.printf ("He acertado! He necesitado: %d intentos.\n", contador);
          fin= true;
          break;

        case 1:
          maximo=adivinado-1;
          if (maximo < minimo) {
              System.out.printf ("Creo que me estás engañando...\n");
              fin= true;
          }
          break;

        case 2:
          minimo=adivinado+1;
          if (maximo < minimo) {
              System.out.printf ("Creo que me estás engañando...\n");
              fin= true;
          }
          break;

        default:
            System.err.printf ("Error.\n");
      }
    }
  }
}
