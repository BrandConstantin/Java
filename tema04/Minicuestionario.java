/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
 * en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
 * calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan
 * para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 *
 * @author Costy
 */
import java.util.Scanner;
public class Minicuestionario {

  public static void main(String[] args) {
    Scanner tecla = new Scanner (System.in);

    System.out.println("MINICUESTIONARIO - (10 preguntas)");
    System.out.println("===============================================");
    
    int punto = 0;
    
    System.out.print("Cual es la capital de Italia? ");
    String respuesta1 = tecla.next().toUpperCase();
    if (respuesta1.equals("ROMA")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("Zara es una marca Española? ");
    String respuesta2 = tecla.next().toUpperCase();
    if (respuesta2.equals("SI")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("Bosnia es un pais de Asia? ");
    String respuesta3 = tecla.next().toUpperCase();
    if (respuesta3.equals("NO")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("Ha ganado España mas de 3 veces el Eurovisión? ");
    String respuesta4 = tecla.next().toUpperCase();
    if (respuesta4.equals("NO")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("Napoleon Bonaparte era frances? ");
    String respuesta5 = tecla.next().toUpperCase();
    if (respuesta5.equals("SI")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("Noruega es un pais central-europeo? ");
    String respuesta6 = tecla.next().toUpperCase();
    if (respuesta6.equals("NO")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("Es Sevilla una ciudad de Andalucia? ");
    String respuesta7 = tecla.next().toUpperCase();
    if (respuesta7.equals("SI")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("Es Europa \"el continente viejo\" porque es el continente mas antiguo del mundo? ");
    String respuesta8 = tecla.next().toUpperCase();
    if (respuesta8.equals("SI")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("Tiene Europa la superficie mas grande que el pais EEUU? ");
    String respuesta9 = tecla.next().toUpperCase();
    if (respuesta9.equals("NO")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.print("En Europa, la Union Europea se ha constituido despues de la I Guerra Mundial? ");
    String respuesta10 = tecla.next().toUpperCase();
    if (respuesta10.equals("NO")){
        punto += 1;
        System.out.println("Has acertado!");
    } else {
        System.err.println("Incorrecto!!");
    }
    System.out.printf("\nTu puntuacion en este cuestionario ha sido de %d puntos", punto);
  }
}
