/*
Realiza un programa que genere la versión tacaña de un número a partir de otro introducido por
teclado. La versión tacaña es aquella que contiene los mismos dígitos o menos que el número original
y en el mismo orden. A efectos prácticos es como quitarle dígitos de forma aleatoria a un determinado
número.
 */
package t1_rec;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class VersionTacaniaNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        long numero = teclado.nextLong();

        long numeroInverso = 0;
        int digito = 0;
        boolean encontrado = true;
        int aleatorio = 0;
        long numeroNuevo = 0;

        while (numero > 0) {
            digito = (int) (numero % 10);
            numeroInverso = (numeroInverso * 10) + digito;
            numero /= 10;
        }

        //le damos otra vez la vuelta al número y le quitamos digitos
        while (numeroInverso > 0) {
            digito = (int) (numeroInverso % 10);
            aleatorio = (int) (Math.random() * 2);

            if (aleatorio == 1) {
                numeroNuevo = (numeroNuevo * 10) + digito;
                encontrado = true;
            }

            numeroInverso /= 10;
        }

        System.out.println(numeroNuevo);
    }
}
