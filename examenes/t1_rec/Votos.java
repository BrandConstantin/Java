/*
 * Realiza un programa que gestione los votos de las próximas elecciones. La aplicación debe cumplir
los siguientes requisitos:
a) Los nombres de los partidos se deben guardar en un array llamada nombrePartido que se debe
inicializar al principio del programa con los siguientes nombres: Ciudadanos, Podemos, PP, PSOE,
Izquierda Unida y UpyD.
b) El programa debe pedir el número de votos que ha obtenido cada uno de los partidos. Estos
datos se deben guardar en un array llamado votacion.
c) El programa calculará la media de todas las votaciones y la mostrará por pantalla.
d) A continuación, el programa mostrará el mensaje: "Los partidos que han obtenido votos por
encima de la media son: " seguido de los nombres de los partidos cuyos votos han sido superiores
a la media.
e) A continuación, el programa mostrará el mensaje: "Los partidos que han obtenido votos por
debajo de la media son: " seguido de los nombres de los partidos cuyos votos han sido inferiores a
la media.
 */
package t1_rec;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Votos {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("ELECCIONES");
        System.out.println("-----------------------------------------------------------------------------");

        String[] nombrePartido = {"UPyD", "Podemos", "IU", "PP", "PSOE"};
        double[] votacion = new double[5];
        int i;

        System.out.println("Introduce el número de votos para cada partido: ");
        for (int j = 0; j < nombrePartido.length; j++) {
            System.out.print(nombrePartido[j] + " || ");
        }

        System.out.println("");

        for (int k = 0; k < votacion.length; k++) {
            System.out.print("Votos partido " + (k + 1) + ": ");
            votacion[k] = t.nextDouble();
        }

        System.out.println("----------------------------");
        for (int j = 0; j < nombrePartido.length; j++) {
            System.out.print(nombrePartido[j] + " || ");
        }
        System.out.println("");
        for (int k = 0; k < votacion.length; k++) {
            System.out.print(votacion[k] + " || ");;
        }

        System.out.println("\n------------------------------------");
        double suma = 0;
        for (int j = 0; j < votacion.length; j++) {
            suma += votacion[j];
        }

        double sumaTotal = suma / votacion.length;
        System.out.println("La media de los votos es de " + sumaTotal);

        System.out.println("--------------------------------------");
        System.out.println("PARTIDOS CON VOTOS POR ENCIMA DE LA MEDIA");
        for (i = 0; i < nombrePartido.length; i++) {
            for (i = 0; i < votacion.length; i++) {
                if (votacion[i] >= sumaTotal) {
                    System.out.println(nombrePartido[i] + " \t||\t " + votacion[i]);
                }
            }
        }
        System.out.println("\n----------------------------------------------------------------------------------");
        System.out.println("PARTIDOS CON VOTOS POR DEBAJO DE LA MEDIA");
        for (i = 0; i < nombrePartido.length; i++) {
            for (i = 0; i < votacion.length; i++) {
                if (votacion[i] <= sumaTotal) {
                    System.out.println(nombrePartido[i] + " \t||\t " + votacion[i]);
                }
            }
        }
    }
}
