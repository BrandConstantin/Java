
/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
 * separados por espacios..
 *
 * @author brand
 */

public class Numeros_aleatorios {

    public static void main(String[] args) {

        System.out.println("Numeros aleatorios");

        for (int i = 1; i <= 20; i++) {
            System.out.println("Num " + i + ":" + ((int) (Math.random() * 11) + 0));
        }

        System.out.println();
    }
}
