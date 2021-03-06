/*
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utili-
 * za el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
 * del programa
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class TestDeInfidelidad {
    public static void main(String[] args) {   
        Scanner tecla = new Scanner(System.in);

        System.out.println("CUESTIONARIO INFIDELIDAD");
        System.out.println("================================================");
        System.out.println("Constesta con \"SI\" o \"NO\"");
        int puntos = 0;

        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
        String pregunta1 = tecla.next().toUpperCase();
        if (pregunta1.equals("SI")){
          puntos += 3;
        } 

        System.out.println("Ha aumentado sus gastos de vestuario");
        String pregunta2 = tecla.next().toUpperCase();
        if (pregunta2.equals("SI")){
          puntos += 3;
        }

        System.out.println("Ha perdido el interés que mostraba anteriormente por ti"
        );
        String pregunta3 = tecla.next().toUpperCase();
        if (pregunta3.equals("SI")){
          puntos += 3;
        } 

        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el " + 
                                    "pelo y se asea con más frecuencia (si es mujer)");
        String pregunta4 = tecla.next().toUpperCase();
        if (pregunta4.equals("SI")){
          puntos += 3;
        }

        System.out.println("No te deja que mires la agenda de su teléfono móvil");
        String pregunta5 = tecla.next().toUpperCase();
        if (pregunta5.equals("SI")){
          puntos += 3;
        }

        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        String pregunta6 = tecla.next().toUpperCase();
        if (pregunta6.equals("SI")){
          puntos += 3;
        }

        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        String pregunta7 = tecla.next().toUpperCase();
        if (pregunta7.equals("SI")){
          puntos += 3;
        }

        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        String pregunta8 = tecla.next().toUpperCase();
        if (pregunta8.equals("SI")){
          puntos += 3;
        }

        System.out.println("Has notado que últimamente se perfuma más"); 
        String pregunta9 = tecla.next().toUpperCase();
        if (pregunta9.equals("SI")){
          puntos += 3;
        }

        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        String pregunta10 = tecla.next().toUpperCase();
        if (pregunta10.equals("SI")){
          puntos += 3;
        }

        if (puntos >= 0 && puntos <= 10) {
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
        } else if (puntos >= 11 && puntos <= 22){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente " +
                                "será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona." + 
                            " Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabez");
        }
    }
}
