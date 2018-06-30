
/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios
 * (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting
 * con (char) para convertir un entero en un carácter.
 *
 * @author brand
 */
public class Matrix {

    public static void main(String[] args) throws InterruptedException {
        long repeticion = 0;

        for (long i = 0; i < 100000; i++) {
            for (long j = 0; j < 1000; j++) {
                System.out.print((char) (Math.random() * (126 - 32 + 1) + 32));

                if (repeticion == 95) {
                    Thread.sleep(1500);
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }
}
