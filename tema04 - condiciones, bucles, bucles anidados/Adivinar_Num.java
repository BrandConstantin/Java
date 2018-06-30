package tema04;

/*
 * 
 *  Haz un programa que intente adivinar un número entero secreto entre 0 y 100  que has escrito en un papel. 
 * El programa comenzará preguntando por un número dentro  del rango y tú tendrás que contestarle por teclado si
 * tu número es exactamente ése  (ha acertado) o bien es mayor o menor. Con esa pista, el programa tendrá que 
 * volver preguntar otro número y así sucesivamente hasta que acierte el número.
 * Hay que intentar que el programa adivine el número en la menor cantidad de pasos posibles.
 * El programa debe ser capaz de saber si el usuario lo está engañando dándole pistas falsas.
 * 
 * @author costy
 */

import java.util.Scanner;
public class Adivinar_Num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contadorIntentos = 0;
        int extremoInf = 0;
        int extremoSup = 100;
        int numeroLeido;
        boolean fin = false;
        int puntoMedio;
        
        System.out.println("ADIVINAR NÚMERO");
        System.out.println("================================================");
        System.out.println("Escribe:");
        System.out.println("0 si he acertado numero");
        System.out.println("1 si el numero es menor");
        System.out.println("2 si el número es mayor");
        System.out.println("================================================");
        
        while (!fin) {
            // Cálculo del punto medio (posible candidato)
            puntoMedio= (extremoInf + extremoSup) / 2;
            
            System.out.printf("¿El número secreto es %d?\n", puntoMedio);
            do {
                System.out.print ("Escribe 0, 1 o 2\n");
                numeroLeido = teclado.nextInt();
            } while (numeroLeido < 0 || numeroLeido > 2);
            contadorIntentos++; // Incrementamos el contador de intentos

            switch (numeroLeido) {

                case 0:  // Hemos acertado
                    System.out.printf ("¡Bien! He necesitado: %d intentos.\n", contadorIntentos);
                    fin= true;
                    break;

                case 1:  // Mi número está por debajo. Nos quedamos con la mitad inferior.
                    extremoSup = puntoMedio-1;
                    if (extremoSup < extremoInf) {
                        System.out.printf ("Creo que me estás engañando...\n");
                        fin= true;
                    }
                    break;

                case 2:  // Mi número está por encima. Nos quedamos con la mitad superior.
                    extremoInf = puntoMedio+1;
                    if (extremoSup < extremoInf) {
                        System.out.printf ("Creo que me estás engañando...\n");
                        fin= true;
                    }
                    break;

                default:
                    System.out.printf ("Error.\n");
            }
        }
    }
}