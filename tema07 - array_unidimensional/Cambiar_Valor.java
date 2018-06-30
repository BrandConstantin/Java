/*
 * Escribe un programa que genere 25 números aleatorios del 0 al 20 y que los muestre
 * por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
 * y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
 * la lista generada anteriormente. Los números que se han cambiado deben aparecer
 * entrecomillados.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Cambiar_Valor {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int array[] = new int[25];

        //sacar 100 números y guardarlos en un array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 21) + 1);

            System.out.print(array[i] + " | ");
        }

        System.out.println("\nIntroduce un numero de 1 - 20 que quieres cambiar:");
        int num1 = num.nextInt();
        System.out.println("Introduce el numero con el cual quieres cambiar de 1- 20:");
        int num2 = num.nextInt();

        if ((num1 > 0) && (num1 < 21) && (num2 > 0) && (num2 < 21)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num1) {
                    array[i] = num2;
                }
            }
        } else {
            System.err.println("Algun numero fuera de rango!");
        }

        //mostrar el nuevo array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num2) {
                System.out.print("<" + array[i] + "> | ");
            } else {
                System.out.print(array[i] + " | ");
            }
        }
    }
}
