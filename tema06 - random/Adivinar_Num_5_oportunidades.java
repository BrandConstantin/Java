
/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el número secreto.
 *
 * @author costy
 */
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Adivinar_Num_5_oportunidades {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int oportunidades = 5;
        boolean encontrado = false;
        int numAzar = (int) (Math.random() * 101);
        int numIntrod;

        while ((oportunidades > 0) && (encontrado = true)) {
            System.out.println("Escribe un número de 0 a 100: ");
            numIntrod = num.nextInt();

            oportunidades--;
            if (numIntrod == numAzar) {
                oportunidades = 0;
                encontrado = true;
                System.out.println("Has adivinado el número");
            } else {
                if (oportunidades <= 0) {
                    System.out.println("Lo siento no hay mas intentos!!");
                } else {
                    if (numIntrod > numAzar) {
                        encontrado = false;
                        System.out.println("Introduce un número menor");
                    } else {
                        encontrado = false;
                        System.out.println("Introduce un número mayor");
                    }
                }
            }
        }
        System.out.println("El numero era " + numAzar);
    }
}
