/*
 * Implementa una función que sea capaz de “estirar” un array bidimensional transformándola en un
array de una dimensión. El array estirada será el resultado de pegar cada una de las filas del array
original, una detras de otra empezando por la fila 0. La cabecera de la función es la siguiente:
public static int[] estira(int[][] n)
Por ejemplo, si el array bidimensional “a” es el que se muestra a continuación
45 92 14 20 25 78
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48
El array unidimensional generado por estira(a) sería el siguiente:
45 92 14 20 25 78 35 72 24 45 42 60 32 42 64 23 41 39 98 45 94 11 18 48
 */
package t2_rec;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class DesenrrollaArrayBidi_IzqDerecha {
    public static void main (String [] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("CONVERTIR ARRAY BIDI EN UNI");
        System.out.println("----------------------------------------------------");
        
        System.out.print("Introduzca las filas del array: ");
        int filas = t.nextInt();
        System.out.print("Introduzca las columnas del array: ");
        int columnas = t.nextInt();
        System.out.print("Introduzca el número maximo: ");
        int max = t.nextInt();
        System.out.print("Introduzca el número minimo: " );
        int min = t.nextInt();
        
        int[][] a = generaArrayBidi(filas, columnas, max, min);
        muestraArrayBidi(a);
        System.out.println("\n----------------------------------------------------");
        desenrolla(a);
    }
    
    
    ////////////Funciones////////////
    /**
    * Devuelve el número de filas de un array bidimensional
    *
    * @param x un array bidimensional de enteros
    * @return numero entero positivo.
    */
    //Numero de filas array/////////////////////////////////////////////////////
    public static int numeroFilas(int x[][]) {
        return x.length;
    }
    /**
    * Devuelve el número de columnas de un array bidimensional
    *
    * @param x un array bidimensional de enteros
    * @return numero entero positivo.
    */
    
    
    //Numero de columnas array/////////////////////////////////////////////////////
    public static int numeroColumnas(int x[][]) {
        return x[0].length;
    }
    /**
    * Cuenta el número de digitos de un número entero.
    *
    * @param num un número entero positivo de tipo long
    * @return un entero
    */
    
    //Cuenta digitos/////////////////////////////////////////////////////
    public static int cuentaDigitos (long num) {
        int contador = 0;
        int digitos = 0;
        //Cuenta cuántas veces sepuede dividir hasta llegar a cero
        while(num > 0) {
            num = num/10;
            contador++;
        }
        //Establece cuúntos digitos tiene
        digitos = contador;
        return digitos;
    }
    /**
    * busca el maximo valor del array
    *
    * @param x un array bidimensional de enteros
    *
    * @return numero entero positivo
    */
    //Muestra el maximo valor del array/////////////////////////////////////////
    public static int maximoArrayBidi(int x[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numeroFilas(x); i++) {
            for (int j = 0; j < numeroColumnas(x); j++) {
                if(x[i][j] > max) {
                    max = x[i][j];
                }
            }
        }
        return max;
    }
    /**
    * Muestra un array bidimensional
    *
    * @param x un array bidimensional de enteros
    *
    */
    
    //Muestra array bi/////////////////////////////////////////////////////
    public static void muestraArrayBidi(int x[][]) {
        String formatoNumero = "%" + cuentaDigitos(maximoArrayBidi(x)) + "d";
        for (int i = 0; i < numeroFilas(x); i++) {
            for (int j = 0; j < numeroColumnas(x); j++) {
                System.out.printf(formatoNumero + " ", x[i][j]);
            }
            System.out.println();
        }
    }
    /**
    * Genera un array bidimensional de forma aleatoria
    *
    * @param filas numero entero positivo
    * @param columnas numero entero positivo
    * @param maximo numero entero positivo
    * @param minimo numero entero positivo
    *
    * @return numero entero positivo
    */
    
    //Genera array bi/////////////////////////////////////////
    public static int[][] generaArrayBidi(int filas, int columnas, int maximo, int minimo ){
        int[][] array = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = (int)((Math.random()*(maximo - minimo)+ 1) + minimo);
            }
        }
        return array;
    }
    /**
    * Muestra array
    *
    * @param x un array de enteros
    */
    //Muestra array/////////////////////////////////////////////////////
    public static void muestraArray(int x[]) {
    for (int i = 0; i < x.length; i++) {
        System.out.print(x[i] + "|");
    }
    System.out.println();
    }
    /**
    * convierte un array bidimensional en un array unidimensional
    *
    * @param n array bidimensional
    *
    *
    * @return un array unidimensional
    */

    //Desenrrolla array/////////////////////////////////////////
    public static int[] desenrolla(int[][] n) {
        //Crea el array unidimensional
        int[] arrayUni = new int[(numeroFilas(n)*numeroColumnas(n))];
        int indice = 0;
        
        //Va rotando el array bidimensional
        int cambio = 0;
        for (int j = 1; j <= (numeroFilas(n)/2); j++) {
            int x = 0 + cambio;
            //Rota linea superior
            for (int i = cambio; i < (numeroColumnas(n)- cambio); i++) {
                arrayUni[indice] = n[x][i];
                indice++;
            }
            //Rota linea derecha
            for (int i = cambio + 1; i < (numeroFilas(n)- cambio); i++) {
                arrayUni[indice] = n[i][(numeroColumnas(n) - 1) - cambio];
                indice++;
            }
            //Rota linea inferior
            for (int i = (numeroColumnas(n)- 2)-cambio; i >= cambio; i--) {
                arrayUni[indice] = n[(numeroFilas(n)- 1)-cambio][i];
                indice++;
            }
            //Rota linea izquierda
            for (int i = (numeroFilas(n)-2) - cambio; i > cambio; i--) {
                arrayUni[indice] = n[i][x];
                indice++;
            }
            cambio++;
        }
        if((numeroFilas(n)%2)!=0) {
            for(int i = 0; i <= numeroColumnas(n)-numeroFilas(n); i++) {
                arrayUni[indice] = n[numeroFilas(n)/2][numeroFilas(n)/2 + i];
                indice++;
            }
        }
        muestraArray(arrayUni);
        return arrayUni;
    }
}
