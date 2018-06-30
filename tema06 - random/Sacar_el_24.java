
/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y
 * 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 *
 */
/**
 *
 * @author brand
 */
public class Sacar_el_24 {

    public static void main(String[] args) {

        int numero = 0;
        int contador = 0;

        System.out.println("Numeros aleatorios hasta encontrar el 24");
        System.out.println("----------------------------------------");

        do {
            numero = (int) (Math.random() * 300);
            contador++;
            //System.out.print(numero + " - ");
        } while (numero != 24);

        System.out.println("Se han necesitado " + contador + " intentos");
    }
}
