/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Posicionar1_UltimoNumero {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int numero[] = new int[6];
        int ultimo;

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce número: ");
            numero[i] = tec.nextInt();
        }

        System.out.println("============================================");

        //guardamos el ultimo elemento
        ultimo = numero[5];

        //desplazamos los elementos hacia ultima posición
        //al desplazarlo perdemos el ultimo valor, por esto lo hemos guardado
        for (int i = numero.length - 2; i >= 0; i--) {
            numero[i + 1] = numero[i];
        }

        //el ultimo valor pasa a ser primero
        numero[0] = ultimo;

        //Mostras el indice y sus numeros guardados en el array
        for (int i = 0; i < numero.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }
    }
}
