/*
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y que 
 * muestre a continuación un diagrama de barras horizontales con esos datos. Las barras del diagrama se pueden 
 * dibujar a base de asteriscos o cualquier otro carácter.
 */
package array_unidimensional;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class Diagrama_Temperatura {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int[] temp = new int[12];
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre","Octubre", "Noviembre", "Diciembre"};

        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";

        for (int i = 0; i < mes.length; i++) {
            System.out.print("Introduce la temperatura del mes: " + mes[i] + " ");
            temp[i] = Integer.parseInt(num.nextLine());
        }

        System.out.println("===================================================");

        for (int i = 0; i < mes.length; i++) {
            System.out.printf(azul + "%12s " + verde + "│", mes[i]);
            for (int j = 0; j < temp[i]; j++) {
                System.out.print(morado + "▄");
            }
            System.out.println(naranja + " " + temp[i] + "ºC" + blanco);
        }
        System.out.println("===================================================");
    }
}
