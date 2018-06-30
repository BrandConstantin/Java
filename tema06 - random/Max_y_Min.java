
/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media de
 * esos números.
 */
/**
 *
 * @author brand
 */
public class Max_y_Min {

    public static void main(String[] args) {

        System.out.println("50 numeros aleatorios");
        System.out.println("-----------------------");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 50; i++) {
            int numero = (int) (Math.random() * 100) + 1;

            suma += numero;
            contador++;

            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }

        System.out.println("La suma de los números es de " + suma);
        System.out.println("Media de los números " + (suma / contador));
        System.out.println("Número maximo " + max);
        System.out.println("Número minimo " + min);
    }
}
