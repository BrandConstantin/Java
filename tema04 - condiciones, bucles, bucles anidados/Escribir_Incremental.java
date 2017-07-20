/*
 * Haz un programa que solicite un número de 5 cifras,  y escriba 5 líneas, de forma que en la primera línea sólo 
 * escriba la primera cifra del número suministrado, en la segunda línea las dos primeras cifras, y así sucesivamente 
 * hasta escribirlo entero en la quinta fila.
 */
package tema04;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Escribir_Incremental {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String numeroEnLetra;
        int numero;
 
        System.out.println("Escritura gradual o incremental de un entero positivo de 5 cifras.");
        System.out.println("=================================================================="); 
        System.out.print("Introduzca un número positivo de 5 cifras:");
        numeroEnLetra = teclado.nextLine();
 
        numero = Integer.parseInt(numeroEnLetra);
        if (numero > 9999 && numero < 100000) {
            System.out.println(numeroEnLetra.substring(0,1));
            System.out.println(numeroEnLetra.substring(0,2));
            System.out.println(numeroEnLetra.substring(0,3));
            System.out.println(numeroEnLetra.substring(0,4));
            System.out.println(numeroEnLetra.substring(0,5));
        }else{
            System.out.println("Debes introducir un número de 5 cifras");
        } 
    }    
}
