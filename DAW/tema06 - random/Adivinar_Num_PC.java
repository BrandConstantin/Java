
/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor que
 * el que te acaba de decir.
 *
 * @author brand
 */
import java.util.Scanner;

public class Adivinar_Num_PC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numAleatorio;
        int oportunidades = 5;
        int mayor = 100;
        int menor = 0;
        boolean encontrado = false;
        String respuesta = "";

        System.out.println("Piensa en un número y te lo voy a adivinar! ");
        System.out.println("Responde con 'si' si es si la respuesta o con 'no' si es "
                + " no");
        System.out.println("------------------------------------------------------");

        do {
            numAleatorio = (int) (Math.random() * (mayor - menor)) + menor;
            System.out.println("Es el numero adivinado " + numAleatorio + " ?");
            respuesta = teclado.next().toUpperCase();

            oportunidades--;

            if ((respuesta.equals("SI"))) {
                encontrado = true;
                oportunidades = 0;
            } else {
                if (oportunidades > 0) {
                    System.out.println("----");
                    System.out.println("Me quedan " + oportunidades);
                    System.out.println("Es un numero mayor o menor?");
                    respuesta = teclado.next().toLowerCase();

                    if (respuesta.equals("mayor")) {
                        menor = numAleatorio;
                        //numAleatorio = (int) ((Math.random() * (mayor - menor)) + mayor);
                    } else if (respuesta.equals("menor")) {
                        mayor = numAleatorio + 1;
                        //numAleatorio = (int) ((Math.random() * (mayor - menor)) + (menor + 1));
                    } else {
                        System.out.println("Escribe solo 'mayor' o 'menor' ");
                        System.out.println("Has perdido una oportunidad");
                    }
                }else {
                    System.out.println("No tengo más oportunidades");
                }
            }
        } while ((oportunidades > 0) && encontrado == false);

        if (encontrado == true) {
            System.out.println("He acertado! Un aplauzo para mi!");
        } else {
            System.out.println("Valienete pc mas retrasado soy!");
        }
    }
}
