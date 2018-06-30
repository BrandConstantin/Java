/*
 * Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que
ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un número
mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un
número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica
como “apto” o “no apto”, por tanto se debe preguntar al usuario “¿Cuál ha sido el resultado de la
recuperación? (apto/no apto). Si el resultado de la recuperación es “apto”, la nota será un 5; en caso
contrario, se mantiene la nota media anterior.
Ejemplo 1:
Nota del primer control: 7
Nota del segundo control: 10
Tu nota de Programación es 8.5
Ejemplo 2:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
Tu nota de Programación es 5
Ejemplo 3:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
Tu nota de Programación es 4.5
 */
package t1c1_turno2;

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
          
          System.out.println("Que nota sacaste en el primer examen? ");
          double nota1 = t.nextDouble();
          System.out.println("Que nota sacaste el segundo examen? ");
          double nota2 = t.nextDouble();
          System.out.println("-----------------------------------------------------------------------------");
          
          double media = (nota1 + nota2) / 2;
          
          //para hacer los switch con string tiene que ser la versión 8 o superior de netbeans
          
         /* String recuperacion = "";
          
          if(media  >= 5){
            System.out.print("Has aprobado. Tu media final es: ");
            System.out.print(media);
          }
          
          if(media < 5){
              System.out.println("EXAMEN RECUPERACIÓN");
              System.out.println("Cual ha sido el resultado de la recuperación? (apto/no apto)");
              recuperacion = t.nextLine();
          
              if(recuperacion.equals("apto")){
                  System.out.println("La media final es 5");
              }else if(recuperacion.equals("no apto")){
                System.out.println("No has aprobado, tienes que volver a cursar programación");
              }else if(!(recuperacion.equals("apto")) || !(recuperacion.equals("no apto"))){
                  System.out.println("Vuelve a escribir (apto / no apto)");
                  recuperacion = t.nextLine();
              }
          }*/
          
          if(media  >= 5){
            System.out.print("Has aprobado. Tu media final es: ");
            System.out.print(media);
          }else{
            System.out.println("EXAMEN RECUPERACIÓN");
            System.out.println("Cual ha sido el resultado de la recuperación? (apto/no apto)");
            System.out.println("1. Apto");
            System.out.println("2. No Apto");
            int recuperacion = t.nextInt();
            
            switch (recuperacion){
              case 1:
                System.out.println("Tienes la media 5");
                break;
              case 2:
                System.out.println("No has aprobado, tienes que volver a cursar Programación");
                break;
            }
          }
      }
}
