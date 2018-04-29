/*
 * Escribe un programa que rellene un array con 20 números aleatorios comprendidos entre 0 y 1000 y
que los muestre por pantalla. A continuación, el programa pedirá dos números de los que se han
mostrado. Por último, el programa dirá cuántos pasos hay que dar para pasar del primer número al
segundo. Se supone que el usuario introduce correctamente los números, es decir, se encuentran en
el array, no son el mismo, y el primer número aparece antes que el segundo.
Ejemplo:
159 204 20 250 178 790 353 632 229 357 924 54 260 310 140 549 335 826 923 113
Por favor, introduzca el primer número: 790
Ahora introduzca el segundo número: 310
Para pasar del 790 al 310 hay que dar 8 pasos.
 */
package t1_rec;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class ContarPasos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int array[] = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(array[i] + " | ");
        }

        System.out.println("");
        System.out.print("Introduce un número (de los que hay en el array): ");
        int numero1 = teclado.nextInt();
        System.out.println("");
        System.out.print("Introduce otro número (de los que hay en el array): ");
        int numero2 = teclado.nextInt();
        System.out.println("");

        int pasos = 0;
        int totalPasos = 0;

        for (int i = 0; i < array.length; i++) {
            pasos++;

            if (numero1 == array[i]) {
                pasos = 0;
            }

            if (numero2 == array[i]) {
                totalPasos = pasos;
            }
        }

        System.out.println("Hay un total de " + totalPasos + " pasos");

    }
}
