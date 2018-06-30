/*
 * Escribe las funciones sumatorio y producto, que calculen respectivamente la suma y el producto de
los números contenidos en un array. Por ejemplo, si el array a contiene los valores {8, 2, 7, 1}, la
sentencia sumatorio(a) devolvería el 18 y la sentencia producto(a) devolvería el 112. Las
cabeceras de las funciones se muestran a continuación:
public static int sumatorio(int[] n)
public static int producto(int[] n)
 */
package t2_rec;

import java.util.Scanner;

/**
 *
 * @author BrinCo
 */
public class SumaYProductoArray {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.println(" SUMA Y PRODUCTO DE UN ARRAY");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Array: ");
        int[] a = new int[5];
        generaArray(a);
        System.out.println("\n-------------------------------------------------");
        int suma = sumatorio(a);
        System.out.println("Suma del array: " + suma);
        int producto = producto(a);
        System.out.println("Producto del array: " + producto);
    }
    
    public static void generaArray(int[] a){
        //generamos números dentro del array
        int i;

        for(i = 0; i < a.length; i++){ 
            a[i] = (int)(Math.random() * 30) + 10;
            System.out.print(a[i] + "|");
        }
    }

    
    public static int sumatorio(int[] a){
        int suma = 0;
        int i;
        
        for(i = 0; i < a.length; i++){
            suma += a[i];  
        }
        
        return suma;
    }

    public static int producto(int[] a){
        int producto = 1;
        int i;
        
        for(i = 0; i < a.length; i++){
            producto *= a[i];  
        }
        
        return producto;
    }
}
