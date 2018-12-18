/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_unidimensional;

/**
 *
 * @author brand
 */
public class Minimo_PrimeraPosicion {

    public static void main(String[] args) {

        int[] numero = new int[15];
        int min = Integer.MAX_VALUE;

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 30);
        }

        //Mostras el indice y sus numeros guardados en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }

        //sacar el máximo
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < min) {
                min = numero[i];
            }
        }

        while (min != numero[0]) {
            int numFinal = numero[14];

            for (int j = 14; j > 0; j--) {
                numero[j] = numero[j - 1];
            }
            numero[0] = numFinal;
        }

        System.out.println("\n");
        System.out.println("El número minimo es " + min);
        System.out.println("");

        //mostrar array cambiado
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }
    }
}
