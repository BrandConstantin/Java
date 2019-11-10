/*
 * Rotar array hacia izquierda
 */
package array_unidimensional;

/**
 *
 * @author brand
 */
public class Rotar_Array_Izquierda {

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

        //a partir del indice final + 1 añade los demas números menos el ultimo
        for (int i = 0; i < numero.length; i++) {
            cambiado[i] = numero[i];
        }

        //a partir del indice cambiado[0] + 1 se colocan los demás números
        for (int i = cambiado.length - 1; i > 0; i--) {
            numero[i - 1] = cambiado[i];
        }
  
        //el ultimo indice al ser empujado fuera del array se coloca primero
        numero[14] = cambiado[0]; 

        //mostrar array cambiado
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }
    }
}
