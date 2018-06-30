/*
 * Reemplazar un elemento en el array
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Reemplazar_Elemento_Array {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int[] numero = new int[8];
        int ultimo = 0;

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
//            System.out.print("Introduce un número: ");
//            numero[i] = tec.nextInt();
            numero[i] = (int) (Math.random() * 30);
        }

        System.out.println("");

        //Mostras el indice y sus numeros guardados en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }

        System.out.println("");

        //pedimos número para insertar
        System.out.print("Introduce nuevo número: ");
        int newElement = tec.nextInt();
        //pedimos posición donde insertarlo
        System.out.print("Introduce la posición del nuevo elemento (0 - 7): ");
        int posicion = tec.nextInt();

        System.out.println("");

        if (posicion < 8) {
            //desplazamos los elementos del array desde posición hasta el último (3-1)
            for (int i = 0; i > posicion; i--) {
                numero[i + 1] = numero[i];
            }

            //insertamos nuevo elemento
            numero[posicion] = newElement;
        } else {
            System.out.println("Opción erronea!");
        }

        //Mostras el indice y sus numeros guardados en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }
    }
}
