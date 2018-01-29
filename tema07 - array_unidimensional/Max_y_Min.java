/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre los 
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Max_y_Min {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String negro = "\033[35m";
        double[] numero = new double[10];

        //pide 10 números
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce " + (i + 1) + " número: ");
            numero[i] = Double.parseDouble(num.nextLine());
        }

        System.out.println("--------------------------------------------------");

        //sacar el mínimo y el máximo
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > max) {
                max = numero[i];
            }

            if (numero[i] < min) {
                min = numero[i];
            }
        }

        //mostrar los números
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == max) {
                System.out.print(verde + numero[i] + " | ");
            } else if (numero[i] == min) {
                System.out.print(naranja + numero[i] + " | ");
            }else{
                System.out.print(negro + numero[i] + " | ");
            }
        }
    }
}
