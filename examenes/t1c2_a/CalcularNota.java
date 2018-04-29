/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer
examen cuenta el 40% y la del segundo examen un 60%.
Ejemplo 1:
Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
Ejemplo 2:
Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 */
package t1c2_a;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class CalcularNota {
      public static void main(String[] args) {
          Scanner t = new Scanner (System.in);
          System.out.println("CALCULAR MEDIA PROGRAMACIÓN");
          System.out.println("-----------------------------------------------------------------------------");
          
          System.out.println("Que media quieres sacar en esta asignatura? ");
          double media = t.nextDouble();
          System.out.println("Cual ha sido la nota del primer examen? ");
          double examen1 = t.nextDouble();
          System.out.println("-----------------------------------------------------------------------------");       
          
          double examen2 = ((100 * media) - (examen1 * 40)) / 60;
          
          System.out.println("Para sacar una media de " + media + 
                  " en esta asignatura, tines que sacar un " + examen2 +" en el segundo examen");
      }
}
