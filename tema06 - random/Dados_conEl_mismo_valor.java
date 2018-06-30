
/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los
 * dos dados tengan el mismo valor.
 */
/**
 *
 * @author brand
 */
public class Dados_conEl_mismo_valor {

    public static void main(String[] args) throws InterruptedException {
        int dado1;
        int dado2;
        int intentos = 0;
        boolean acertado = false;

        do {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            intentos++;

            System.out.println("--------------------");
            System.out.println("Dado 1: " + dado1 + " Dado 2: " + dado2);
        } while (dado1 != dado2);

        System.out.println("");
        System.out.println("Se han necesitado " + intentos + " intentos");
    }
}
