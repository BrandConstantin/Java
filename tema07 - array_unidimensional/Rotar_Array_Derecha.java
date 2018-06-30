/*
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 
 * 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se 
 * encuentra en la última posición debe pasar a la posición 0. Finalmente, 
 * muestra el contenido del array.
 */
package array_unidimensional;

/**
 *
 * @author brand
 */
public class Rotar_Array_Derecha {

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
            numero[i] = cambiado[i - 1];
        }
  
        //el ultimo indice al ser empujado fuera del array se coloca primero
        cambiado[0] = numero[14]; 

        //mostrar array cambiado
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + "\t");
        }
    }
}
