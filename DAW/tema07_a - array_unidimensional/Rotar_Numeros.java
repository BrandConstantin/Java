/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A 
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el 
 * programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar que 
 * inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá colocar el
 * número de la posición inicial en la posición final, rotando el resto de números para que no se 
 * pierda ninguno. Al final se debe mostrar el array resultante. 
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Rotar_Numeros {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] numero = new int[10];
        int[] cambiado = new int[10];
//        String verde = "\033[32m";
//        String azul = "\033[34m";
//        String naranja = "\033[33m";
        int inicial = -1;
        int finala = -1;

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
//            System.out.print("Introduce número " + (i + 1) + ": ");
//            numero[i] = Integer.parseInt(num.nextLine());
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

            //cambiar los números
            //coje el número del indice inicial y reemplaza el número del indice final
            cambiado[finala] = numero[inicial];
            
            //a partir del indice final + 1 añade los demas números menos el ultimo
            for (int i = finala + 1; i < numero.length; i++) {
                cambiado[i] = numero[i - 1];
            }
            
            //el ultimo indice al ser empujado fuera del array se coloca primero
            cambiado[0] = numero[9];
            
            //a partir del indice cambiado[0] + 1 se colocan los demás números
            for (int i = 0; i < inicial; i++) {
                cambiado[i + 1] = numero[i];
            }
        }

        System.out.println("Se cambia el indice inicial con el final, los demas indices los 'empuja' ");

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
