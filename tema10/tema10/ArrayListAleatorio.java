/*
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y
que luego calcule la suma, la media, el máximo y el mínimo de esos números. El tamaño
de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.

 */
package tema10;

import java.util.ArrayList;

/**
 *
 * @author BrinCo
 */
public class ArrayListAleatorio {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        int suma = 0;
        int media = 0;
        int maximo = 0;
        int minimo = 100;
        int tamano = (int)(Math.random() * 11) + 10;
        int i;
        
        for(i = 0; i < tamano; i++){
            a.add((int)(Math.random() * 101));
        }
        
        System.out.println("La lista generada es " + a);
        System.out.println("#############################");
        
        for(Integer num: a){
            suma += num;
        
            if(num < minimo){
                minimo = num;
            }
            if(num > maximo){
                maximo = num;
            }
        }
        System.out.println("La suma total de los números es " + suma);
        System.out.println("La media de los números es " + suma / tamano);
        System.out.println("El minimo de todos los números es " + minimo);
        System.out.println("El máximo de todos los números es " + maximo);
    }
}
