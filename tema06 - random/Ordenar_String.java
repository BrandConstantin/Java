/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class Ordenar_String {

    public static void main(String[] args) {

        System.out.println("El orden de los que van a ir a limpiar la casa esta semana son:");
        String[] numero = new String[7];

        numero[0] = "Andre";
        numero[1] = "Bibi";
        numero[2] = "Clara";
        numero[3] = "Daniela";
        numero[4] = "Eugenio";
        numero[5] = "Flores";
        numero[6] = "Gorge";

        int posicion1;
        int posicion2;
        String orden1 = "";

        for (int i = 0; i < numero.length; i++) {
            posicion1 = (int) (Math.random() * 7);
            posicion2 = (int) (Math.random() * 7);

            orden1 = numero[posicion1];
            String aux = numero[posicion2];

            numero[posicion1] = aux;
            numero[posicion2] = orden1;
        }

        for (int j = 0; j < numero.length; j++) {//para recorrer y mostrar un array
            System.out.print(numero[j] + " ");
        }
    }
}
