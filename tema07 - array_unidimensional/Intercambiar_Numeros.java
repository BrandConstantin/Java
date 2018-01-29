/*
 * Intercambiar un número con otro
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Intercambiar_Numeros {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[10];
        int[] cambiado = new int[10];
        int inicial = -1;
        int finala = -1;

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 10);
        }

        //Mostras el indice y sus numeros guardados en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }

        System.out.println("");

        while ((finala < inicial) || (((inicial < 0) || (inicial > 9)) || ((finala < 0) || (finala > 9)))) {
            //pedir los números
            System.out.print("Indica un indice inicial: ");
            inicial = Integer.parseInt(num.nextLine());
            System.out.print("Indica un indice final: ");
            finala = Integer.parseInt(num.nextLine());

            if (inicial > finala) {
                System.out.println("El indice inicial no puede ser mayor que el final");
            }

            if (((inicial < 0) || (inicial > 9)) || ((finala < 0) || (finala > 9))) {
                System.out.println("Los indices deben ser comprendidos entre 0 y 9");
            }

            //escoger el número a cambiar
            for (int i = 0; i < numero.length; i++) {
                cambiado[i] = numero[i];
            }
        }

        //cambiar los números
        //coje el número del indice inicial y reemplaza el número del indice final
        cambiado[finala] = numero[inicial];
        //coje el número del indice final y reemplaza el número del indice inicial
        cambiado[inicial] = numero[finala];

        //mostrar array inversado
        for (int i = 0; i < cambiado.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < cambiado.length; i++) {
            System.out.print(cambiado[i] + "\t");
        }
    }
}
