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
public class Sumar_Numero {

    public static void main(String[] args) {

        int[] numero = new int[15];
        int[] cambiado = new int[15];

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

        System.out.println("\n----");

        //a partir del indice final + 1 añade los demas números menos el ultimo
        for (int i = 0; i < numero.length; i++) {
            cambiado[i] = numero[i] + 1;
        }

        //el ultimo indice al ser empujado fuera del array se coloca primero
        cambiado[0] = numero[0] + 1;

        //a partir del indice cambiado[0] + 1 se colocan los demás números
        for (int i = 0; i < numero.length; i++) {
            numero[i] = cambiado[i] + 1;
        }

        //mostrar array cambiado
        for (int i = 0; i < cambiado.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < cambiado.length; i++) {
            System.out.print(cambiado[i] + "\t");
        }
    }
}
