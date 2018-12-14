/*
 * Realiza un programa que calcule los litros que caben en una pecera a partir de sus dimensiones (ancho, alto y 
 * largo en centímetros). Tanto los datos introducidos como el resultado pueden contener decimales.
 */
package tema03;

import java.util.Scanner;

/**
 *
 * @author BrandConstantin
 */
public class Litros_Pescera {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        int ancho;
        int alto;
        int largo;
        
        System.out.print("Introduce el ancho de la pescera: ");
        ancho = dato.nextInt();
        System.out.print("Introduce el alto de la pescera: ");
        alto = dato.nextInt();
        System.out.print("Introduce el largo de la pescera: ");
        largo = dato.nextInt();
        
        double volumen = ancho * alto * largo;
        System.out.println("El volumen de la pescera es de " + volumen);
        
        double litros = volumen / 1000;
        System.out.println("Y caben un total de " + litros + " litros");
    }
}
