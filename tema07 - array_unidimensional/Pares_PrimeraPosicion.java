/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y 
 * que los almacene en un array. El programa debe ser capaz de pasar todos los
 * números pares a las primeras posiciones del array (del 0 en adelante) y 
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares 
 * si es necesario.
 */
package array_unidimensional;

/**
 *
 * @author brand
 */
public class Pares_PrimeraPosicion {

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String rojo = "\033[31m";
        int numImpar = 0;
        int numPar = 0;

        //llenan el array de números y los muestra
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 100 + 1);
            System.out.print(numero[i] + " ");
        }

        System.out.println("\n--------------------------------------------------");

        //sacar los pares e impares
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                pares[numPar++] = numero[i];
            } else {
                impares[numImpar++] = numero[i];
            }
        }

        //mostrar primero los pares y luego los impares
      for (int i = 0; i < pares.length; i++){
        numero[i] = pares[i];
      }
      
      int aux = 0;
      
      for (int i = numPar; i < numero.length; i++){
        numero[i] = impares[aux];
        aux++;
      }

      System.out.println("Array cambiado: ");
      for (int i = 0; i < numero.length; i++ ){
        System.out.print(numero[i]+" ");
      } 
    }
}
